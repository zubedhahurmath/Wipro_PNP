package logicBuildingMettlArrays;

public class MostFrequentlyDigit {
	public static int mostFrequentlyOccurringDigit(int[] input1, int input2) {

        int[] freq = new int[10];

        for (int i = 0; i < input2; i++) {

            int num = input1[i];

            if (num == 0) {
                freq[0]++;
            }
            num = Math.abs(num);
            while (num > 0) {
                int digit = num % 10;
                freq[digit]++;
                num = num / 10;
            }
        }

        int answer = 0;

        for (int digit = 0; digit <= 9; digit++) {
            if (freq[digit] >= freq[answer]) {
                answer = digit;
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        int[] arr1 = {123, 234, 345, 456};
        System.out.println("Most Frequent Digit = " +
                mostFrequentlyOccurringDigit(arr1, arr1.length));

        int[] arr2 = {111, 222, 333, 444};
        System.out.println("Most Frequent Digit = " +
                mostFrequentlyOccurringDigit(arr2, arr2.length));

        int[] arr3 = {12, 24, 36, 48, 90};
        System.out.println("Most Frequent Digit = " +
                mostFrequentlyOccurringDigit(arr3, arr3.length));
    }

}
