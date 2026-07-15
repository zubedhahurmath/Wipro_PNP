package collections;



import java.util.ArrayList;
import java.util.function.Predicate;

public class PerfectSquareDemo {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(4);
        list.add(7);
        list.add(9);
        list.add(15);
        list.add(16);
        list.add(20);
        list.add(25);
        list.add(30);

        Predicate<Integer> p = n -> {

            int root = (int) Math.sqrt(n);
            return root * root == n;
        };

        for (int n : list) {
            if (p.test(n)) {
                System.out.println(n);
            }
        }
    }
}