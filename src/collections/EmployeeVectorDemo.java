package collections;

import java.util.Vector;
import java.util.Iterator;
import java.util.Enumeration;

public class EmployeeVectorDemo {

    public static void main(String[] args) {

        Vector<EmployeeDemo> employees = new Vector<>();

        employees.add(new EmployeeDemo(101, "Rahul", 50000));
        employees.add(new EmployeeDemo(102, "Priya", 60000));
        employees.add(new EmployeeDemo(103, "Amit", 55000));

        System.out.println("Employees using Iterator:");
        Iterator<EmployeeDemo> iterator = employees.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("\nEmployees using Enumeration:");
        Enumeration<EmployeeDemo> enumeration = employees.elements();

        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }
    }
}