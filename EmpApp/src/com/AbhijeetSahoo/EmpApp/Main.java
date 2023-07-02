package com.AbhijeetSahoo.EmpApp;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	EmpDaoInterface edi=new EmpDaoImplement();
	System.out.println("\t\t\tWelcome to Employee management application");
	for(int i=1;i<50;i++) System.out.print("* ");
	Scanner sc=new Scanner(System.in);
	do {
		int id,age;
		String name;
		double salary;
		System.out.println("\n1.Add an employee.");
		System.out.println("2.Show the all details of employee.");
		System.out.println("3.Search an employee.");
		System.out.println("4.Update details of an employee.");
		System.out.println("5.Delete an employee.");
		System.out.println("6.Exit");
		System.out.println("\nChoose a option number: ");
		int option=sc.nextInt();
		switch(option){
			case 1:
				Employee emp=new Employee();
				System.out.println("Enter the employee id:");
				id=sc.nextInt();
				System.out.println("Enter Name:");
				sc.nextLine();
				name= sc.nextLine();
				System.out.println("Enter Salary:");
				salary=sc.nextDouble();
				System.out.println("Enter Age:");
				age=sc.nextInt();
				emp.setId(id);
				emp.setName(name);
				emp.setSalary(salary);
				emp.setAge(age);
				edi.createEmployee(emp);
				break;
			case 2:
				edi.showAllEmployee();
				break;
			case 3:
				int empId;
				System.out.println("Enter the employee id to see details about that employee:");
				empId=sc.nextInt();
				edi.showEmpById(empId);
				break;
			case 4:
				System.out.println("Enter employee id to update the details:");
				empId=sc.nextInt();
				System.out.println("Enter the new name:");
				sc.nextLine();
				name=sc.nextLine();
				System.out.println("Enter the new salary: ");
				salary=sc.nextDouble();
				System.out.println("Enter the new age:");
				age=sc.nextInt();
				edi.updateEmp(empId,name,salary,age);
				break;
			case 5:
				System.out.println("Enter the employee no which details you want to delete:");
				empId=sc.nextInt();
				edi.deleteEmp(empId);
				break;
			case 6:
				System.out.println("Thank you....");
				System.exit(0);
				break;
			default:
				System.out.println("Invalid option numbered you choosed.");
		}
		
		char flag;
		System.out.println("Do you want to continue ?(Y/N) :");
		flag=sc.next().charAt(0);
		
		if(flag=='y'||flag=='Y') {
			continue;
		}
		else
		{
			System.out.println("Thank You...");
			break;
		}
		
	}while(true);
	
	sc.close();
}
}
