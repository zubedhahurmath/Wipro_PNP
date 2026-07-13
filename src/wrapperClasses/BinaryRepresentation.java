package wrapperClasses;

import java.util.Scanner;
public class BinaryRepresentation {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number (1 to 255): ");
        int num = sc.nextInt();

        if (num < 1 || num > 255) {
            System.out.println("Invalid Input");
        } else {
            String binary = Integer.toBinaryString(num);

            // Pad with leading zeros to make it 8 digits
            String result = String.format("%8s", binary).replace(' ', '0');

            System.out.println(result);
        }

        sc.close();
    }

}
