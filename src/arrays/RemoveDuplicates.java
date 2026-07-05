package arrays;

public class RemoveDuplicates {
	public static void main(String[] args) {
        int[] arr = {12, 34, 12, 45, 67, 89};
        System.out.print("{");
        boolean first = true;
        for (int i = 0; i < arr.length; i++) {
            boolean duplicate = false;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    duplicate = true;
                    break;
                }
            }
            if (!duplicate) {
                if (!first) {
                    System.out.print(",");
                }
                System.out.print(arr[i]);
                first = false;
            }
        }
        System.out.println("}");
    }
}
