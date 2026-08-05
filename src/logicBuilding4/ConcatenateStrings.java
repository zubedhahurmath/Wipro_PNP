package logicBuilding4;
import java.util.Scanner;
public class ConcatenateStrings {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String string1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String string2 = sc.nextLine();
        String string3 = string1 + string2;
        System.out.println("Concatenated String: " + string3);
        sc.close();
    }
}
