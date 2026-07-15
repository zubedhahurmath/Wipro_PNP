package collections;

import java.util.HashSet;
import java.util.Iterator;

public class EmployeeHashSetDemo {
	public static void main(String[] args) {
        HashSet<String> employees = new HashSet<>();
        employees.add("Rahul");
        employees.add("Priya");
        employees.add("Amit");
        employees.add("Sneha");
        employees.add("Kiran");
        System.out.println("Employee Names:");

        Iterator<String> iterator = employees.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
