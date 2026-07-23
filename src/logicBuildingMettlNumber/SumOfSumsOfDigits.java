package logicBuildingMettlNumber;

public class SumOfSumsOfDigits {
    public static int sumOfSumsOfDigits(int input1) {
        String s = String.valueOf(input1);
        int total = 0;
        for (int i = 0; i < s.length(); i++) {
            int sum = 0;
            for (int j = i; j < s.length(); j++) {
                sum += s.charAt(j) - '0';
            }
            total += sum;
        }
        return total;
    }
    public static void main(String[] args) {
        int input1 = 582109;
        int result = sumOfSumsOfDigits(input1);
        System.out.println("Input: " + input1);
        System.out.println("Sum of Sums of Digits: " + result);
    }
}