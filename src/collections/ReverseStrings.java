package collections;


import java.util.ArrayList;

public class ReverseStrings {

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
            String rev = "";

            for (int i = str.length() - 1; i >= 0; i--) {
                rev += str.charAt(i);
            }

            System.out.println(rev);
        });
    }
}

