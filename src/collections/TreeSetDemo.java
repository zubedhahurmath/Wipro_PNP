package collections;

import java.util.TreeSet;
import java.util.Iterator;

public class TreeSetDemo {
	
	public static void main(String[] args) {

        // Create TreeSet
        TreeSet<String> names = new TreeSet<>();

        names.add("Rahul");
        names.add("Priya");
        names.add("Amit");
        names.add("Sneha");
        names.add("Kiran");

        System.out.println("Elements in Reverse Order:");
        System.out.println(names.descendingSet());

        System.out.println("\nElements using Iterator:");
        Iterator<String> iterator = names.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        String search = "Priya";

        if (names.contains(search)) {
            System.out.println("\n" + search + " exists in the TreeSet.");
        } else {
            System.out.println("\n" + search + " does not exist in the TreeSet.");
        }
    }

}
