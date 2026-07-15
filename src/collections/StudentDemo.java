package collections;
import java.util.ArrayList;

public class StudentDemo {
	 public static void main(String[] args) {

	        ArrayList<Student> list = new ArrayList<>();

	        list.add(new Student(1, "Rahul", 80));
	        list.add(new Student(2, "Priya", 45));
	        list.add(new Student(3, "Amit", 70));
	        list.add(new Student(4, "Sneha", 55));
	        list.add(new Student(5, "Kiran", 35));

	        long count = list.stream()
	                .filter(s -> s.mark >= 50)
	                .count();

	        System.out.println("Students Cleared: " + count);
	    }

}
