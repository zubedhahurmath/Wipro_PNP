package collections;
import java.util.ArrayList;
import java.util.function.Function;

public class EmployeeInterfaceDemo {
	public static void main(String[] args) {

        ArrayList<EmployeeInterface> list = new ArrayList<>();

        list.add(new EmployeeInterface(101, "Rahul", "Pune", 25000));
        list.add(new EmployeeInterface(102, "Priya", "Hyderabad", 30000));
        list.add(new EmployeeInterface(103, "Amit", "Delhi", 28000));
        list.add(new EmployeeInterface(104, "Sneha", "Pune", 32000));
        list.add(new EmployeeInterface(105, "Kiran", "Chennai", 26000));

        Function<ArrayList<EmployeeInterface>, ArrayList<String>> fun = employees -> {

            ArrayList<String> locations = new ArrayList<>();

            for (EmployeeInterface e : employees) {
                locations.add(e.location);
            }

            return locations;
        };
        System.out.println(fun.apply(list));
    }

}
