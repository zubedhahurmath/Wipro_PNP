package logicBuilding1;

import java.util.Scanner;

public class PassOrFail {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int pass = 0;
        for (int i = 1; i <= 3; i++) {
            System.out.print("Enter marks of student " + i + ": ");
            int marks = sc.nextInt();
            if (marks >= 35) {
                pass++;
            }
        }
        System.out.println("Number of students passed = " + pass);
        sc.close();
	}
}
