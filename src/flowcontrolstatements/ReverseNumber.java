package flowcontrolstatements;

public class ReverseNumber {
	public static void main(String[] args) {
        if (args.length == 1) {
            int num = Integer.parseInt(args[0]);
            int reverse = 0;
            while (num != 0) {
                int digit = num % 10;
                reverse = reverse * 10 + digit;
                num = num / 10;
            }
            System.out.println(reverse);
        } else {
            System.out.println("Please pass exactly one integer as a command line argument.");
        }
    }
}
