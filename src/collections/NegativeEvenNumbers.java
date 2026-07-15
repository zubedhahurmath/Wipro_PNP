package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class NegativeEvenNumbers {
	public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>();

        al.add(-10);
        al.add(5);
        al.add(-8);
        al.add(7);
        al.add(-15);
        al.add(-4);
        al.add(20);
        al.add(-2);
        al.add(11);
        al.add(6);

        List<Integer> result = al.stream()
                .filter(n -> n < 0 && n % 2 == 0)
                .collect(Collectors.toList());

        System.out.println(result);
    }

}
