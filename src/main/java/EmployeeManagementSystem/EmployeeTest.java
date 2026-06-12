package EmployeeManagementSystem;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class EmployeeTest {

    public static void main(String[] args) throws ParseException {

        ArrayList<Employee> employees = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        int choice;

        do {
            System.out.println("\nEMPLOYEE MANAGEMENT SYSTEM");
            System.out.println("1. Add Employee");
            System.out.println("2. Display All Employees");

            System.out.print("Enter a choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Employee ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Employee Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Department: ");
                    String dept = sc.nextLine();

                    System.out.print("Enter Salary: ");
                    double sal = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Enter Joining Date: ");
                    Date doj = sdf.parse(sc.nextLine());

                    employees.add(new Employee(id, name, dept, sal, doj));
                    System.out.println("Employee Added Successfully!");
                    break;

                case 2:
                    if (employees.isEmpty()) {
                        System.out.println("No employees found.");
                    } else {
                        for (Employee e : employees) {
                            e.displayEmployee();
                        }
                    }
                    break;

                case 3:
                    System.out.println("Exiting Application. Thank you!");
                    break;

                default:
                    System.out.println("Invalid Choice. Try again.");
            }

        } while (choice != 3);

        sc.close();

    }
}
