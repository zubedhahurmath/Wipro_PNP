package logicBuildingMettlArrays;

public class FindOriginalFirstAndSum {
	public static void findOriginalFirstAndSum(int[] input1, int input2) {
        int sum = 0;
        for (int i = input2 - 2; i >= 0; i--) {
            input1[i] = input1[i] - input1[i + 1];
        }
        int firstElement = input1[0];
        for (int i = 0; i < input2; i++) {
            sum += input1[i];
        }
        System.out.println("Original First Element = " + firstElement);
        System.out.println("Sum = " + sum);
    }
    public static void main(String[] args) {
        int[] arr = {15, 10, 6, 3};
        findOriginalFirstAndSum(arr, arr.length);
    }
}
