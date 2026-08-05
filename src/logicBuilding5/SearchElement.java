package logicBuilding5;
import java.util.Scanner;
public class SearchElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[15];
        System.out.println("Enter 5 elements:");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter element to search: ");
        int x = sc.nextInt();
        boolean found = false;
        for (int i = 0; i < 5; i++) {
            if (arr[i] == x) {
                System.out.println("Element found at position " + i);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Element not found.");
        }
        sc.close();
    }
}