package flowcontrolstatements;

public class CaseConverter {
	public static void main(String[] args) {
        if (args.length == 1) {
            char ch = args[0].charAt(0);
            if (ch >= 'a' && ch <= 'z') {
                System.out.println(ch + "->" + Character.toUpperCase(ch));
            } 
            else if (ch >= 'A' && ch <= 'Z') {
                System.out.println(ch + "->" + Character.toLowerCase(ch));
            } 
            else {
                System.out.println("Please enter an alphabet.");
            }

        } else {
            System.out.println("Please pass exactly one alphabet as a command line argument.");
        }
    }
}
