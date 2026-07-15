package collections;

import java.util.ArrayList;
import java.util.function.Consumer;

public class OddEvenDemo {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }

        Consumer<Integer> c = n -> {

            if (n % 2 == 0)
                System.out.println(n + " even");
            else
                System.out.println(n + " odd");
        };

        for (int n : list) {
            c.accept(n);
        }
    }
}