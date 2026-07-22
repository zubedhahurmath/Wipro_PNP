package logicBuildingMettlArrays;

public class DecreasingSequence {
	public static void decreasingSeq(int[] input1, int input2) {

        int count = 0;
        int maxLength = 0;
        int i = 0;
        while (i < input2 - 1) {
            if (input1[i] > input1[i + 1]) {
                count++;
                int length = 2;
                i++;
                while (i < input2 - 1 && input1[i] > input1[i + 1]) {
                    length++;
                    i++;
                }
                if (length > maxLength) {
                    maxLength = length;
                }
            } else {
                i++;
            }
        }

        System.out.println("Number of decreasing sequences = " + count);
        System.out.println("Length of longest decreasing sequence = " + maxLength);
    }
    public static void main(String[] args) {

        int[] arr1 = {11, 3, 1, 4, 7, 8, 12, 2, 3, 7};
        System.out.println("Example 1:");
        decreasingSeq(arr1, arr1.length);
        
        int[] arr2 = {9};
        System.out.println("\nExample 2:");
        decreasingSeq(arr2, arr2.length);

        int[] arr3 = {12, 51, 100, 212, 15, 12, 7, 3, 57, 300, 312, 78, 19, 100, 102, 101, 99, 74, 0, -5};
        System.out.println("\nExample 3:");
        decreasingSeq(arr3, arr3.length);
    }

}
