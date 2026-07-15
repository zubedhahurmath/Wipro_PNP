package collections;

public class PrimeDemo {
	public static void main(String[] args) {

        PrimeInterface p = PrimeCheck::new;

        p.create(17);
        p.create(20);
    }

}
