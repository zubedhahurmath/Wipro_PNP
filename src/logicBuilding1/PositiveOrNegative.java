package logicBuilding1; 

import java.util.Scanner;

public class PositiveOrNegative {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int positive = 0;
        int negative = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter number " + i + ": ");
            int num = sc.nextInt();
            if (num >= 0) {
                positive++;
            } else {
                negative++;
            }
        }
        System.out.println(positive);
        System.out.println(negative);
        sc.close();
	}
}
