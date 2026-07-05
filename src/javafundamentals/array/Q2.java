package javafundamentals.array;
public class Q2 {
	public static void main(String[] args) {
        if (args.length == 1) {
            System.out.println("Welcome " + args[0]);
        } else {
            System.out.println("Please pass exactly one command line argument.");
        }
    }
}
