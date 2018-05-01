/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.truxx.dao;
import com.truxx.entities.LoginDetails;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kalva
 */


public class LogindetailsDao {
    private Connection connect = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;

    public List<LoginDetails> getloginDetails() {
		JDBCConnection jdbcConnection = new JDBCConnection();
		connect = jdbcConnection.getConnnection();
		List<LoginDetails> logindetails = new ArrayList<>();
		
		try {

			// Statements allow to issue SQL queries to the database
			statement = connect.createStatement();
			// Result set get the result of the SQL query
			resultSet = statement.executeQuery(
					"select * from logindetails;");
			logindetails = writeResultSet(resultSet);
                        
                        

		} catch (SQLException ex) {
			System.out.println("An error occurred. Maybe user/password is invalid");
			ex.printStackTrace();
		}

		finally {
			close();
		}
		return logindetails;
	}
    

    
    private List<LoginDetails> writeResultSet(ResultSet resultSet) throws SQLException {
		List<LoginDetails> LoginDetails = new ArrayList<>();                
		while (resultSet.next()) {
                        int userId = resultSet.getInt("UserId");
			
			String userName = resultSet.getString("UserName");
                        String Password = resultSet.getString("Password");
			LoginDetails record = new LoginDetails();
                        record.setUserID(userId);
                        record.setPassword(Password);
                        record.setUsername(userName);
                        
			LoginDetails.add(record);
		}
		return LoginDetails;
	}
    
        public String addLoginDetails(LoginDetails details) {
		JDBCConnection jdbcConnection = new JDBCConnection();
		connect = jdbcConnection.getConnnection();

		String message="";
		try {
                    statement = connect.createStatement();
			String insertStat = "INSERT INTO logindetails (UserId,UserName,Password) \n" +
                                            "VALUES (?,?,?)";
                        PreparedStatement preparedStmt = connect.prepareStatement(insertStat);
                        preparedStmt.setInt (1, details.getUserID());
                        preparedStmt.setString(2, details.getUsername());
                        preparedStmt.setString(3, details.getPassword());
                        preparedStmt.execute();
                        message = "success";
		} catch (SQLException ex) {
			ex.printStackTrace();
                        message= "failed";
		}
		finally {
			close();                        
		}
		return message;
	}
        public void deleteLoginDetails(int userid) {

		JDBCConnection jdbcConnection = new JDBCConnection();
		connect = jdbcConnection.getConnnection();

		String deleteSQL = "DELETE FROM logindetails WHERE UserId=? ";

		try {
			
			preparedStatement = connect.prepareStatement(deleteSQL);
			preparedStatement.setInt(1, userid);

			// execute delete SQL stetement
			preparedStatement.executeUpdate();

			System.out.println("Record is deleted!");
			
		}
    catch (SQLException ex) {
			ex.printStackTrace();
                        
		}
		finally {
			close();                        
		}
		//return message; 
        }
           public void deleteUserDetails(int userid) {

		JDBCConnection jdbcConnection = new JDBCConnection();
		connect = jdbcConnection.getConnnection();

		String deleteSQL = "DELETE FROM users WHERE UserId=? ";

		try {
			
			preparedStatement = connect.prepareStatement(deleteSQL);
			preparedStatement.setInt(1, userid);

			// execute delete SQL stetement
			preparedStatement.executeUpdate();

			System.out.println("Record is deleted!");
			
		}
    catch (SQLException ex) {
			ex.printStackTrace();
                        
		}
		finally {
			close();                        
		}
		//return message; 
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