package flowcontrolstatements;

public class Q1{
	public static void main(String[] args) {
        if (args.length == 1) {
            int num = Integer.parseInt(args[0]);
            if (num > 0) {
                System.out.println(num + " is Positive");
            } else if (num < 0) {
                System.out.println(num + " is Negative");
            } else {
                System.out.println(num + " is Zero");
            }
        } else {
            System.out.println("Please pass exactly one integer command line argument.");
        }
	}
}
