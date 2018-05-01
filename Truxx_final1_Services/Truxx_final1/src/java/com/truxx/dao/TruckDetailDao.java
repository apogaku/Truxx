/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.truxx.dao;

import com.truxx.entities.LoginDetails;
import com.truxx.entities.Trucks;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;




public class TruckDetailDao {
    private Connection connect = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;

    public List<Trucks> getTruckDetails(int userid) {
		JDBCConnection jdbcConnection = new JDBCConnection();
		connect = jdbcConnection.getConnnection();
		List<Trucks> trucks = new ArrayList<>();
		
		try {

			// Statements allow to issue SQL queries to the database
			statement = connect.createStatement();
			// Result set get the result of the SQL query
			resultSet = statement.executeQuery(
					"select * from trucks where userid='"+userid+"';");
			trucks = writeResultSet(resultSet);
                        
                        

		} catch (SQLException ex) {
			System.out.println("An error occurred. Maybe user/password is invalid");
			ex.printStackTrace();
		}

		finally {
			close();
		}
		return trucks;
	}
    

    
    private List<Trucks> writeResultSet(ResultSet resultSet) throws SQLException {
		List<Trucks> trucks = new ArrayList<>();                
		while (resultSet.next()) {
                       // int userId = resultSet.getInt("UserId");
                        int year= resultSet.getInt("Year");
                        int capacity = resultSet.getInt("Capacity");
                        int truckid= resultSet.getInt("TruckId");
			
			String Model = resultSet.getString("Model");
                        String make = resultSet.getString("Make");
			Trucks record = new Trucks();
                        
                        record.setCapacity(capacity);
                        record.setMake(make);
                        record.setModel(Model);
                        record.setTruckId(truckid);
                        record.setYear(year);
                       
                        
			trucks.add(record);
		}
		return trucks;
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