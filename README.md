# Employee Management Application

The Employee Management Application is a Java program that allows users to perform various operations related to employee management. Users can add employees, display employee details, search for employees, update employee information, delete employees, and exit the application.

## Files

The application consists of the following files:

1. **Main.java**: The entry point of the application. It contains the main method and the user interface for interacting with the employee management system.

2. **Employee.java**: A class representing an employee. It defines the attributes of an employee, such as ID, name, salary, and age. The class also provides getter and setter methods for accessing and modifying employee data.

3. **DBConnection.java**: A utility class for establishing a database connection. It uses JDBC to connect to an Oracle database. You need to update the connection URL, username, and password in this file to match your Oracle database configuration.

4. **EmployeeDaoIntrf.java**: An interface that defines the contract for performing CRUD operations on employees. It specifies the methods for adding, retrieving, updating, and deleting employee records.

5. **EmployeeDaoImpl.java**: An implementation of the `EmployeeDaoIntrf` interface. It provides the actual implementation for the CRUD operations using JDBC and the database connection.

## Prerequisites

To run the Employee Management Application, you need the following:

- Java Development Kit (JDK) installed on the system.
- Eclipse IDE (or any Java IDE) installed on the system.
- Oracle Database installed and configured on the system.

## Getting Started

To set up and run the Employee Management Application, follow these steps:

1. Clone the project repository or download the source code files.

2. Open the project in Eclipse IDE or your preferred Java IDE.

3. Update the `DBConnection.java` file with your Oracle database connection details. Modify the `DB_URL`, `DB_USERNAME`, and `DB_PASSWORD` variables to match your Oracle database configuration.

4. Compile and run the `Main.java` class to start the application.

## Usage

Upon running the application, you will see a menu with several options. Here's a brief overview of each option:

1. **Add an employee**: Allows you to add a new employee to the system. You will be prompted to enter the employee's ID, name, salary, and age.

2. **Show all employee details**: Displays the details of all employees in the system.

3. **Search an employee**: This prompts you to enter an employee ID and displays the details of the employee with the corresponding ID.

4. **Update details of an employee**: This lets you update the details of a specific employee. Enter the employee ID, followed by the new name, salary, and age.

5. **Delete an employee**: You can remove an employee from the system by entering the employee's ID.

6. **Exit**: Terminates the application.

After performing the selected operation, you will be asked if you want to continue. Enter 'Y' or 'y' to return to the main menu or any other key to exit the application.


