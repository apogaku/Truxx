/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;

import Entity.TripInfo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author sg chowdhury
 */
public class TripsInfoDAO {
    private Connection connect = null;
    private Connection connectAuthor = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;

    
    public List<TripInfo> getTripsDriver(int userId) {
		JDBCConnection jdbcConnection = new JDBCConnection();
		connect = jdbcConnection.getConnnection();
		List<TripInfo> trips = new ArrayList<>();
		try {
                        statement= connect.createStatement();
                        resultSet = statement.executeQuery("select TripStartTime, TripEndTime, TripDate, TripStartLocationStreetName,\n" +
"TripDestinationStreetName from trips inner join trucks on trucks.TruckId = trips.TruckID where trucks.UserID = "+userId+";");                      
			trips = writeResultSetrips(resultSet);           

		} catch (SQLException ex) {
			ex.printStackTrace();
		}

		finally {
			close();
		}
		return trips;
	}
    
    
    
    public List<TripInfo> getTrips(int userId) {
		JDBCConnection jdbcConnection = new JDBCConnection();
		connect = jdbcConnection.getConnnection();
		List<TripInfo> trips = new ArrayList<>();
		try {
                        statement= connect.createStatement();
                        resultSet = statement.executeQuery("select TripStartTime, TripEndTime, TripDate, TripStartLocationStreetName,TripDestinationStreetName from trips where RenterUserID = "+userId+";");                      
			trips = writeResultSetrips(resultSet);           

		} catch (SQLException ex) {
			ex.printStackTrace();
		}

		finally {
			close();
		}
		return trips;
	}
    private List<TripInfo> writeResultSetrips(ResultSet resultSet) throws SQLException {
		List<TripInfo> trips = new ArrayList<>();                
		while (resultSet.next()) {
                            Timestamp tripStartTime = resultSet.getTimestamp("TripStartTime");
                            Timestamp tripEndTime = resultSet.getTimestamp("TripEndTime");
                            Date tripDate = resultSet.getDate("TripDate");
                            String tripStartLocationStreetName = resultSet.getString("TripStartLocationStreetName");
                            String tripDestinationStreetName = resultSet.getString("TripDestinationStreetName");
               
                    TripInfo tripinfo = new TripInfo();
                    tripinfo.setTripStartTime(tripStartTime);
                    tripinfo.setTripEndTime(tripEndTime);
                    tripinfo.setTripDate(tripDate);
                    tripinfo.setTripStartLocationStreetName(tripStartLocationStreetName);
                    tripinfo.setTripDestinationStreetName(tripDestinationStreetName);
                    trips.add(tripinfo);
                    
		}
		return trips;
	}
    
    
     private void close() {
        try {
            if (resultSet != null) {
                resultSet.close();
            }

            if (statement != null) {
                statement.close();
            }

            if (connect != null) {
                connect.close();
            }
        } catch (Exception e) {

        }
    }
     
     public static void main(String[] args) {
        TripsInfoDAO tripsInfoDAO = new TripsInfoDAO();
        tripsInfoDAO.getTrips(1);
    }
    
}
