package collections;


import java.util.ArrayList;
import java.util.function.Predicate;

public class PalindromeDemo {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("madam");
        list.add("java");
        list.add("level");
        list.add("apple");
        list.add("radar");
        list.add("car");
        list.add("malayalam");
        list.add("hello");
        list.add("noon");
        list.add("book");

        Predicate<String> p = str -> {

            String rev = "";

            for (int i = str.length() - 1; i >= 0; i--) {
                rev += str.charAt(i);
            }

            return str.equalsIgnoreCase(rev);
        };

        for (String s : list) {
            if (p.test(s)) {
                System.out.println(s);
            }
        }
    }
}