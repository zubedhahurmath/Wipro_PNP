package miniproject4;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeManagement {
	 public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);
	        ArrayList<Employee> list = new ArrayList<>();

	        while (true) {

	            System.out.println("Main Menu");
	            System.out.println("1. Add an Employee");
	            System.out.println("2. Display All");
	            System.out.println("3. Exit");

	            int choice = sc.nextInt();

	            switch (choice) {

	            case 1:

	                Employee emp = new Employee();

	                System.out.print("Enter Employee ID: ");
	                emp.setId(sc.nextInt());

	                sc.nextLine();

	                System.out.print("Enter Employee Name: ");
	                emp.setName(sc.nextLine());

	                System.out.print("Enter Employee Age: ");
	                emp.setAge(sc.nextInt());

	                System.out.print("Enter Employee Salary: ");
	                emp.setSalary(sc.nextDouble());

	                list.add(emp);

	                break;

	            case 2:

	                System.out.println("------Report------");

	                for (Employee e : list) {
	                    System.out.println(e.getId() + " "
	                            + e.getName() + " "
	                            + e.getAge() + " "
	                            + e.getSalary());
	                }

	                System.out.println("------End of Report------");

	                break;

	            case 3:

	                System.out.println("Exiting the System");
	                sc.close();
	                System.exit(0);

	            default:

	                System.out.println("Invalid Choice");
	            }
	        }
	    }

}
