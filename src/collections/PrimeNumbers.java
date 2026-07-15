package collections;

import java.util.ArrayList;

public class PrimeNumbers {

    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>();

        al.add(12);
        al.add(7);
        al.add(19);
        al.add(20);
        al.add(13);
        al.add(25);
        al.add(29);
        al.add(18);
        al.add(31);
        al.add(5);
        al.add(40);
        al.add(17);
        al.add(23);
        al.add(15);
        al.add(11);
        al.add(2);
        al.add(27);
        al.add(8);
        al.add(37);
        al.add(9);
        al.add(41);
        al.add(6);
        al.add(10);
        al.add(3);
        al.add(14);

        al.forEach(n -> {
            boolean prime = true;

            if (n < 2)
                prime = false;
            else {
                for (int i = 2; i <= Math.sqrt(n); i++) {
                    if (n % i == 0) {
                        prime = false;
                        break;
                    }
                }
            }

            if (prime)
                System.out.println(n);
        });
    }
}