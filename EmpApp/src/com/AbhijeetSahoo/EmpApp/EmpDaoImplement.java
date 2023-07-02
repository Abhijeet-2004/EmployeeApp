package com.AbhijeetSahoo.EmpApp;

import java.sql.*;

public class EmpDaoImplement  implements EmpDaoInterface {
	Connection con;
	@Override
	public void createEmployee(Employee emp) {
	con=DBConnection.createDBConnection();
	String query="insert into employee values(?,?,?,?)";
	try {
		PreparedStatement pstm=con.prepareStatement(query);
		pstm.setInt(1,emp.getId());
		pstm.setString(2,emp.getName());
		pstm.setDouble(3, emp.getSalary());
		pstm.setInt(4,emp.getAge());
		
		int check=pstm.executeUpdate();
		if(check!=0)
			System.out.println("Employee inserted successfully.");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	}

	@Override
	public void showAllEmployee() {
		con=DBConnection.createDBConnection();
		String query="Select * from employee";
		
		try {
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery(query);
			System.out.println("------------ Employee ------------");
			System.out.println("----------------------------------");
			System.out.println("Id\t Name\t Salary\t\t Age");
			while(rs.next()) {
				System.out.printf("%d\t %s\t %.2f\t %d",rs.getInt(1),rs.getString(2),rs.getDouble(3),rs.getInt(4));
				System.out.println();
				
			}
			System.out.println("----------------------------------");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void showEmpById(int id) {
		con=DBConnection.createDBConnection();
		String query="Select * from employee where id="+id;
		Statement stmt;
		try {
			stmt = con .createStatement();
			ResultSet rs=stmt.executeQuery(query);
			System.out.println("------------ Employee ------------");
			System.out.println("----------------------------------");
			System.out.println("Id\t Name\t Salary\t\t Age");
			while(rs.next()) {
				System.out.printf("%d\t %s\t %.2f\t %d",rs.getInt(1),rs.getString(2),rs.getDouble(3),rs.getInt(4));
				System.out.println();
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void updateEmp(int id, String name,double salary,int age) {
		con=DBConnection.createDBConnection();
		String Query="Update employee set name=?,salary=?,age=? where id=?";
		try {
			PreparedStatement pstm=con.prepareStatement(Query);
			pstm.setString(1,name);
			pstm.setDouble(2,salary);
			pstm.setInt(3,age);
			pstm.setInt(4,id);
			int check=pstm.executeUpdate();
			if(check!=0)
				System.out.println("Employee details updated successfully.");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void deleteEmp(int id) {
		con=DBConnection.createDBConnection();
		String Query="Delete from employee where id="+id;
		try {
			Statement stmt=con.createStatement();
			int check=stmt.executeUpdate(Query);
			if(check!=0)
				System.out.println("Employee details recorded successfully.");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
