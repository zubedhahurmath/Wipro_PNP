package collections;


import java.util.ArrayList;
import java.util.function.Consumer;

public class ReverseWordsDemo {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        list.add("Mango");

        Consumer<ArrayList<String>> c = words -> {

            for (int i = 0; i < words.size(); i++) {

                String rev = "";

                for (int j = words.get(i).length() - 1; j >= 0; j--) {
                    rev += words.get(i).charAt(j);
                }

                words.set(i, rev);
            }
        };

        c.accept(list);

        System.out.println(list);
    }
}