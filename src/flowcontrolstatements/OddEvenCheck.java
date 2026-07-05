package flowcontrolstatements;
public class OddEvenCheck {
	public static void main(String[] args) {
        if (args.length == 1) {
            int num = Integer.parseInt(args[0]);
            if (num % 2 == 0) {
                System.out.println(num + " is Even");
            } else {
                System.out.println(num + " is Odd");
            }
        } else {
            System.out.println("Please pass exactly one integer command line argument.");
        }
    }
}
