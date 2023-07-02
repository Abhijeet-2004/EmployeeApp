package com.AbhijeetSahoo.EmpApp;

public interface EmpDaoInterface {
//Create employee
	public void createEmployee(Employee emp);
//show all employee
	public void showAllEmployee();
//show particular employee by its id
	public void showEmpById(int id);
//Update a employee details
	public void updateEmp(int id,String name,double salary,int age);
//Delete the employee
	public void deleteEmp(int id);
}
