// Package declaration
package Project;
// Importing necessary classes
import java.util.ArrayList;
import java.util.Scanner;

class Employee1 {
    // Private instance variables for Employee1
    private int id;
    private String name;
    private String designation;
    private int age;
    private double salary;
    private String email;
    // Parameterized constructor for Employee1
    public Employee1(int id, String name, String designation, int age, double salary, String email) {
        this.id = id;
        this.name = name;
        this.designation=designation;
        this.age=age;
        this.salary = salary;
        this.email=email;
    }
    // Getter and setter methods for each instance variable
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDesignation() {
        return designation;
    }
    public void setDesignation(String designation) {
        this.designation=designation;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age=age;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

}
class EmployeeManagementSystem {
    // ArrayList to store Employee1 objects
    private ArrayList<Employee1> employees = new ArrayList<Employee1>();
    // Scanner object for user input
    Scanner sc = new Scanner(System.in);
    // Method to add a new employee
    public void addEmployee() {
        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Employee Age: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Employee Designation: ");
        String designation = sc.nextLine();
        System.out.print("Enter Employee Salary: ");
        double salary = sc.nextDouble();
        System.out.print("Enter Employee Email: ");
        String email = sc.next();
        sc.nextLine();
        // Create a new Employee1 object and add it to the ArrayList
        Employee1 em = new Employee1(id, name, designation, age, salary, email);
        employees.add(em);
        System.out.println("Employee added successfully!");
    }
    // Method to delete an employee by ID
    public void deleteEmployee() {
        System.out.print("Enter Employee ID to delete : ");
        int deleteId = sc.nextInt();
        sc.nextLine();
        // Iterate through the ArrayList and delete the employee with the specified ID
        for(Employee1 employee:employees) {
            if(employee.getId()==deleteId) {
                employees.remove(employee);
                System.out.println("Employee deleted successfully");
                return;
            }
        }
        // If ID Not Found.
        System.out.println("Employee with the given ID : " +deleteId+" not found.");
    }
    // Method to update employee details
    public void updateEmployee() {
        System.out.print("Enter Employee ID To Update: ");
        int updateId = sc.nextInt();
        sc.nextLine();
        // Iterate through the ArrayList and update the details of the employee with the specified ID
        for(Employee1 em : employees) {
            if(em.getId()==updateId) {
                System.out.println("Enter new details");
                System.out.print("Enter Employee Salary: ");
                em.setSalary(sc.nextDouble());
                sc.nextLine();
                System.out.print("Enter Employee Designation: ");
                em.setDesignation(sc.nextLine());
                System.out.println("Employee details updated successfully!");
                return;
            }
        }
        // If ID Not Found.
        System.out.println("Employee with the given ID= " +updateId+" not found.");
    }
    // Method to view an employee by ID
    public void viewWithId() {
        System.out.print("Enter ID to view the employee : ");
        int viewId = sc.nextInt();
        sc.nextLine();
        int flag=1;
        // Iterate through the ArrayList and display the details of the employee with the specified ID
        for(int i=0; i< employees.size();i++) {
            Employee1 em = employees.get(i);
            if(em.getId()==viewId) {
                // Display the employee details in a formatted table
                System.out.println(" ______________________________________________________________________________________________________________ ");
                System.out.println();
                System.out.printf("| %-5s | %-20s | %-20s | %-10s | %-5s  | %-25s |\n", "ID", "Name", "Designation", "Age", "Salary", "Email");
                System.out.println(" ______________________________________________________________________________________________________________ ");

                // Display each employee's details in the table
                System.out.println();
                System.out.printf("| %-5s | %-20s | %-20s | %-10s | %-5s | %-25s |\n",
                        em.getId(), em.getName(), em.getDesignation(), em.getAge(), em.getSalary(), em.getEmail());

                System.out.println(" _______________________________________________________________________________________________________________ ");
                System.out.println();
                flag=0;
                break;
            }
        }
        if(flag==1) {
            System.out.println("Employee with the given ID : " +viewId+" not found.");
        }
    }
    // Method to add dummy data
    public void addDummyData() {
        Employee1 emp1 = new Employee1(101, "vyshu", "Manager", 22, 60000.00, "vyshu123@gmail.com");
        Employee1 emp2 = new Employee1(102, "Niharika", "Web Developer", 22, 52000.00, "niharika23@gmail.com");
        Employee1 emp3 = new Employee1(103, "Akshara", "Analyst", 22, 55000.00, "akshara56@gmail.com");
        Employee1 emp4 = new Employee1(104, "Bhargavi", "HR Specialist", 21, 52000.00, "bhargavi78@gmail.com");
        Employee1 emp5 = new Employee1(105, "Chandana", "Developer", 23, 52000.00, "chandana98@gmail.com");
        // Add employees to the employees list
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        employees.add(emp4);
        employees.add(emp5);
    }
    // Method to display
    public void displayEmployees() {
        System.out.println("List of Employees :");
        // Table header
        System.out.println(" _________________________________________________________________________________________________________________");
        System.out.println();
        System.out.printf("| %-5s | %-20s | %-20s | %-10s | %-5s  | %-25s |\n", "ID", "Name", "Designation", "Age", "Salary", "Email");
        System.out.println(" __________________________________________________________________________________________________________________ ");

        // Display each employee's details in the table
        for (Employee1 em : employees) {
            System.out.println();
            System.out.printf("| %-5s | %-20s | %-20s | %-10s | %-5s  | %-25s |\n",
                    em.getId(), em.getName(), em.getDesignation(), em.getAge(), em.getSalary(), em.getEmail());
        }

        System.out.println(" ____________________________________________________________________________________________________________________ ");
        System.out.println();
    }

}
public class EmployeeSystem {
    public static void main(String[] args) {
        EmployeeManagementSystem ems = new EmployeeManagementSystem();
        ems.addDummyData();
        Scanner read = new Scanner(System.in);
        boolean c = true;
        while (true) {
            System.out.println("\n********************************* Employee Management System *********************************");
            System.out.println("                                    1. Add Employee                       ");
            System.out.println("                                    2. Delete Employee                    ");
            System.out.println("                                    3. View a Specific Employee           ");
            System.out.println("                                    4. Display All Employees                     ");
            System.out.println("                                    5. Update Employees                   ");
            System.out.println("                                    6. Exit                               ");
            System.out.println("*************************************************************************************************");
            System.out.print("Enter your choice: ");
            int ch = read.nextInt();
            switch (ch) {
                case 1:
                    ems.addEmployee();
                    break;
                case 2:
                    ems.deleteEmployee();
                    break;
                case 3:
                    ems.viewWithId();
                    break;
                case 4:
                    ems.displayEmployees();
                    break;
                case 5:
                    ems.updateEmployee();
                    break;
                case 6:
                    System.out.println("Thank You For Accessing Our Application. ");
                    System.out.println("------------------------------Exit-----------------------------------");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option");
                    break;
            }
        }
    }
}