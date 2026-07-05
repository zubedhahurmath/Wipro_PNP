package arrays;

public class LargestSmallest {
	public static void main(String[] args) {
        int[] arr = {12, 45, 7, 89, 23, 56, 3};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Smallest Number = " + arr[0]);
        System.out.println("Second Smallest Number = " + arr[1]);
        System.out.println("Largest Number = " + arr[arr.length - 1]);
        System.out.println("Second Largest Number = " + arr[arr.length - 2]);
    }
}
