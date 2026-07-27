package logicBuildingMettlStrings;

public class AdditionUsingStrings {
	public static String addNumberStrings(String input1, String input2) {
        int i = input1.length() - 1;
        int j = input2.length() - 1;
        int carry = 0;
        String result = "";
        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry;
            if (i >= 0) {
                sum += input1.charAt(i) - '0';
                i--;
            }
            if (j >= 0) {
                sum += input2.charAt(j) - '0';
                j--;
            }
            result = (sum % 10) + result;
            carry = sum / 10;
        }
        return result;
    }
    public static void main(String[] args) {
        String input1 = "1234";
        String input2 = "56";
        String result = addNumberStrings(input1, input2);
        System.out.println(result);
    }
}
