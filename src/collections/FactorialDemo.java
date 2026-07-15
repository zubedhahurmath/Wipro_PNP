package collections;

public class FactorialDemo {
	public static void main(String[] args) {

        Factorial obj = new Factorial();

        FactorialInterface f = obj::factorial;

        System.out.println(f.factorial(5));
    }

}
