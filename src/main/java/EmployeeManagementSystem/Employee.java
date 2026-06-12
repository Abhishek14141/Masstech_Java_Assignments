package EmployeeManagementSystem;

import java.util.Date;

public class Employee {
    private int empId;
    private String empName;
    private String department;
    private double salary;
    private Date joiningDate;

    public Employee(int empId, String empName, String department, double salary, Date joiningDate) {
        this.empId = empId;
        this.empName = empName;
        this.department = department;
        this.salary = salary;
        this.joiningDate = joiningDate;
    }

    public void displayEmployee() {
        System.out.println("Id: " + empId);
        System.out.println("Name: " + empName);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
        System.out.println("joiningDate: " + joiningDate);

    }
}
