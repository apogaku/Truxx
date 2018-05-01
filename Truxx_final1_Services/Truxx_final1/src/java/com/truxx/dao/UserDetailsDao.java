/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.truxx.dao;
import com.truxx.entities.LoginDetails;
import com.truxx.entities.StatusMessage;
import com.truxx.entities.Trips;
import com.truxx.entities.Trucks;
import com.truxx.entities.Users;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author kalva
 */


public class UserDetailsDao {
    private Connection connect = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;

    public StatusMessage updateUserDetails(Users rev) {
		    //public String saveReview(Reviews rev) {
		JDBCConnection jdbcConnection = new JDBCConnection();
		connect = jdbcConnection.getConnnection();

		String message="";
                StatusMessage status = new StatusMessage();                        
		try {
                    statement = connect.createStatement();
                   
    
			String insertStat = "UPDATE users SET FirstName=?, LastName=?, Email=?, StreetName=?, ContactNo=? WHERE UserID='1';";
                        PreparedStatement preparedStmt = connect.prepareStatement(insertStat);
                       
                        preparedStmt.setString(1, rev.getFirstName());	
                         preparedStmt.setString(2, rev.getLastName());	
                          preparedStmt.setString(3, rev.getEmail());	
                           preparedStmt.setString(4, rev.getStreetName());
                           preparedStmt.setString(5, rev.getContactNo());
			 preparedStmt.executeUpdate();
                                               message = "success";
                        status.setStatus(message);
                        

		} catch (SQLException ex) {
			ex.printStackTrace();
                        message= "failed";
                        status.setStatus(message);
		}

		finally {
			close();                        
		}
		return status;
                //return message;
	}
        public StatusMessage BookTripdetails(Trips rev) {
		  
		JDBCConnection jdbcConnection = new JDBCConnection();
		connect = jdbcConnection.getConnnection();
                Date date = new Date();
 SimpleDateFormat ft = new SimpleDateFormat ("MM/DD/YYYY"); 
 SimpleDateFormat df2 = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		String message="";
                StatusMessage status = new StatusMessage();                        
		try {
                    statement = connect.createStatement();
                    String starttime=rev.getTripStartTime();
                    String endtime=rev.getTripStartTime();
                    String tripdate=rev.getTripDate();
         String insertStat = "INSERT INTO `truxx`.`trips` ( `TripStartTime`, `TripEndTime`, `TripDate`, `TripTypeId`, `TruckID`, `RenterUserID`, "
                + "`TripStartLocationStreetName`, `TripStartLocationStateID`, `TripStartLocationCityID`, `TripBookingTime`, `TripStartLocationZipcodeID`,"
                + " `TripDestinationStreetName`, `TripDestinationStateID`, `TripDestinationCityID`, `TripDestinationZipcodeID`) "
                + "VALUES ( '"+starttime+"', '"+endtime+"', '"+tripdate+"', "
                + "?,?,?,?, ?, ?, ?, ?, ?, ?,?, ?);";
                        PreparedStatement preparedStmt = connect.prepareStatement(insertStat);
                        System.out.println("test date val"+rev.getTruckID());
                        
                       //  preparedStmt.setString(1,starttime);	
                         //preparedStmt.setString(2, rev.getTripEndTime());
                       //  preparedStmt.setString(3,);	
                         preparedStmt.setInt(1, rev.getTripTypeId());
                         preparedStmt.setInt(2, rev.getTruckID());
                         preparedStmt.setInt(3, rev.getRenterUserID());
                         preparedStmt.setString(4, rev.getTripStartLocationStreetName());
                         preparedStmt.setInt(5, 1);
                         preparedStmt.setInt(6, 1);
                         preparedStmt.setString(7,ft.format(date) );
                         preparedStmt.setInt(8, 1);
                         preparedStmt.setString(9, rev.getTripDestinationStreetName());
                         preparedStmt.setInt(10,1);
                         preparedStmt.setInt(11, 1);
                         preparedStmt.setInt(12,2);
			 preparedStmt.execute();
                          message = "success";
                        status.setStatus(message);
                        

		} catch (SQLException ex) {
			ex.printStackTrace();
                        message= "failed";
                        status.setStatus(message);
		}

		finally {
			close();                        
		}
		return status;
                //return message;
	}
        public Trucks gettruckid(String Capacity,String startdate, String endDate) {
		JDBCConnection jdbcConnection = new JDBCConnection();
		connect = jdbcConnection.getConnnection();
		Trucks user = new Trucks();
		int truckid=1;
		try {
//System.out.println("trip details"+trip.toString()+"trip capacity"+trip.getCapacity());
			// Statements allow to issue SQL queries to the database
			statement = connect.createStatement();
			// Result set get the result of the SQL query
			resultSet = statement.executeQuery(
"select truxx.trucks.TruckId from truxx.trucks where trucks.TruckId not in(select truckid from truxx.trips where TripStartTime!='"+startdate+"' and TripEndTime!='"+endDate+"')and trucks.Capacity='"+Capacity+"' limit 1;");
      System.out.println("select truxx.trucks.TruckId from truxx.trucks where trucks.TruckId not in(select truckid from truxx.trips where TripStartTime!='"+startdate+"' and TripEndTime!='"+endDate+"')and trucks.Capacity='"+Capacity+"' limit 1;");
         
      System.out.print("Print result");
           truckid = writeResultSettruck(resultSet);
                        
                        user.setTruckId(truckid);

		} catch (SQLException ex) {
			System.out.println("An error occurred. Maybe user/password is invalid");
			ex.printStackTrace();
		}

		finally {
			close();
		}
		return user;
	}
        
          private int writeResultSettruck(ResultSet resultSet) throws SQLException {
          int TruckId=1;
          int i=0;
		             while (resultSet.next()&& i==0) {
                                 i++;
                                System.out.println("Set data");
                                System.out.println("data in result set"+resultSet.getInt("TruckId"));
                         TruckId = resultSet.getInt("TruckId");
			
                             }
		return TruckId;
	}
       
    public Users getuserid(String email) {
		JDBCConnection jdbcConnection = new JDBCConnection();
		connect = jdbcConnection.getConnnection();
		Users user = new Users();
		
		try {

			// Statements allow to issue SQL queries to the database
			statement = connect.createStatement();
			// Result set get the result of the SQL query
			resultSet = statement.executeQuery(
					"select userID from truxx.users where email='"+email+"';");
			user = writeResultSet(resultSet);
                        
                        

		} catch (SQLException ex) {
			System.out.println("An error occurred. Maybe user/password is invalid");
			ex.printStackTrace();
		}

		finally {
			close();
		}
		return user;
	}
       private Users writeResultSet(ResultSet resultSet) throws SQLException {
           Users record = new Users();
		            while (resultSet.next()) {
                         int userId = resultSet.getInt("userID");
			  record.setUserID(userId);
                 }      
		return record;
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
}