package collections;


import java.util.ArrayList;

public class OddLengthStrings {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();

        al.add("Apple");
        al.add("Banana");
        al.add("Orange");
        al.add("Mango");
        al.add("Grapes");
        al.add("Pineapple");
        al.add("Cherry");
        al.add("Kiwi");
        al.add("Papaya");
        al.add("Guava");

        al.forEach(str -> {
            if (str.length() % 2 != 0) {
                System.out.println(str);
            }
        });
    }
}