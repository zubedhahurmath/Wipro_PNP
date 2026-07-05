package flowcontrolstatements;

public class Q1B {
	public static void main(String[] args) {
        if (args.length == 2) {
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);
            if (num1 % 10 == num2 % 10) {
                System.out.println(true);
            } else {
                System.out.println(false);
            }
        } else {
            System.out.println("Please pass exactly two non-negative integers as command line arguments.");
        }
    }
}
