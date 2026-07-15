package collections;



import java.util.ArrayList;
import java.util.function.Predicate;

public class EmployeeSalaryDemo {

    public static void main(String[] args) {

        ArrayList<EmployeeSalary> list = new ArrayList<>();

        list.add(new EmployeeSalary(101, "Rahul", 9000));
        list.add(new EmployeeSalary(102, "Priya", 15000));
        list.add(new EmployeeSalary(103, "Amit", 8000));
        list.add(new EmployeeSalary(104, "Sneha", 12000));
        list.add(new EmployeeSalary(105, "Kiran", 7000));

        Predicate<EmployeeSalary> p = e -> e.getSalary() < 10000;

        for (EmployeeSalary e : list) {
            if (p.test(e)) {
                System.out.println(e.getName());
            }
        }
    }
}