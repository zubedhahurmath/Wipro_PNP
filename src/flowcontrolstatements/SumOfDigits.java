package flowcontrolstatements;

public class SumOfDigits {
	public static void main(String[] args) {
        if (args.length == 1) {
            int num = Integer.parseInt(args[0]);
            int sum = 0;
            while (num != 0) {
                sum = sum + (num % 10);
                num = num / 10;
            }
            System.out.println(sum);
        } else {
            System.out.println("Please pass exactly one integer as a command line argument.");
        }
    }
}

