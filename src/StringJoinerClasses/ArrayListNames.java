package StringJoinerClasses;

import java.util.ArrayList;
import java.util.StringJoiner;
public class ArrayListNames {
	public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Rahul");
        names.add("Priya");
        names.add("Amit");
        names.add("Sneha");

        StringJoiner sj = new StringJoiner(", ", "{", "}");

        for (String name : names) {
            sj.add(name);
        }

        System.out.println(sj);
    }
	

}
