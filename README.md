📌 Description
The Employee Payroll System is a Java-based application designed to manage employee salary calculations efficiently. It follows an OOP (Object-Oriented Programming) approach using abstraction, inheritance, and method overriding. The system supports both full-time and part-time employees, each with their own salary computation methods.

🏗️ Project Structure
1️⃣ Employee (Abstract Class)
Variables:
String name – Employee’s name
int id – Employee’s unique ID
Methods:
calculateSalary() (Abstract) – To be implemented by subclasses
toString() – Returns employee details
Constructor:
Initializes name and id
2️⃣ FullTimeEmployee (Subclass of Employee)
Variable:
double monthlySalary – Monthly salary of a full-time employee
Methods:
Overrides calculateSalary() to return the monthly salary
Constructor:
Initializes name, id, and monthlySalary
3️⃣ PartTimeEmployee (Subclass of Employee)
Variables:
int hoursWorked – Number of hours worked
double hourlyRate – Payment per hour
Methods:
Overrides calculateSalary() to compute salary as hoursWorked * hourlyRate
Constructor:
Initializes name, id, hoursWorked, and hourlyRate
4️⃣ PayrollSystem (Main Management Class)
Variables:
ArrayList<Employee> employees – Stores all employees
Methods:
addEmployee(Employee e) – Adds an employee to the list
removeEmployee(int id) – Removes an employee by ID
displayEmployees() – Displays all employees' details
🚀 Features
✔️ Object-Oriented Design (Abstraction, Inheritance, Polymorphism)
✔️ Supports Full-Time and Part-Time Employees
✔️ Employee Management (Add, Remove, and Display)
✔️ Simple Payroll Calculation

🛠️ Technologies Used
Java
IntelliJ IDEA (Recommended IDE)
Collections Framework (ArrayList)
