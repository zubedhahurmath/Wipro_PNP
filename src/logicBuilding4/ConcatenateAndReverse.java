package logicBuilding4;
import java.util.Scanner;
public class ConcatenateAndReverse {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String string1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String string2 = sc.nextLine();
        String reverse = "";
        for (int i = string2.length() - 1; i >= 0; i--) {
            reverse += string2.charAt(i);
        }
        String string3 = string1 + reverse;
        System.out.println("Result: " + string3);
        sc.close();
    }
}
