package logicBuildingMettlNumber;

public class SumOfPowerOfDigits {
	public static int sumOfPowerOfDigits(int input1) {
        String s = String.valueOf(input1);
        int sum = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            int digit = s.charAt(i) - '0';
            int power = s.charAt(i + 1) - '0';
            sum += (int) Math.pow(digit, power);
        }
        int lastDigit = s.charAt(s.length() - 1) - '0';
        sum += (int) Math.pow(lastDigit, 0);
        return sum;
    }
    public static void main(String[] args) {
        int input1 = 582109;
        int result = sumOfPowerOfDigits(input1);
        System.out.println("Input: " + input1);
        System.out.println("Sum of Power of Digits: " + result);
    }
}
