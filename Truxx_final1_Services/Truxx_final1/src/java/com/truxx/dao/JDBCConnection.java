/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.truxx.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author kalva
 */
public class JDBCConnection {
    public Connection getConnnection() {
 Connection connect = null;

try {
	Class.forName("com.mysql.jdbc.Driver");
	
	String url = "jdbc:mysql://localhost:3306/truxx?user=root&password=1234";
    
	connect = DriverManager.getConnection(url);


}
catch (SQLException | ClassNotFoundException ex) {
    System.out.println("An error occurred. Maybe user/password is invalid");
    ex.printStackTrace();
}
 return connect;
 }

}
