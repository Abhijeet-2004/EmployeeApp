package com.AbhijeetSahoo.EmpApp;
import java.sql.*;
public class DBConnection {
	static Connection con;
	
public static Connection createDBConnection() {
	try {
	//load the driver
	Class.forName("oracle.jdbc.driver.OracleDriver"); //load the driver class
	//get  the connection 
	String url="jdbc:oracle:thin:@localhost:1521:XE";
	String userId="SYSTEM";
	String password="1234";
	con=DriverManager.getConnection(url,userId,password);
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	return con;
}
}
