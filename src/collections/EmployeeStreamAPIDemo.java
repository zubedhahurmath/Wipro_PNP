package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeStreamAPIDemo {
	public static void main(String[] args) {

        ArrayList<EmployeeStreamAPI> list = new ArrayList<>();

        list.add(new EmployeeStreamAPI(101, "Rahul", 25, "Pune"));
        list.add(new EmployeeStreamAPI(102, "Priya", 23, "Hyderabad"));
        list.add(new EmployeeStreamAPI(103, "Amit", 28, "Pune"));
        list.add(new EmployeeStreamAPI(104, "Sneha", 24, "Delhi"));
        list.add(new EmployeeStreamAPI(105, "Kiran", 27, "Pune"));

        List<EmployeeStreamAPI> puneEmployees = list.stream()
                .filter(e -> e.location.equalsIgnoreCase("Pune"))
                .collect(Collectors.toList());

        puneEmployees.forEach(System.out::println);
    }

}
