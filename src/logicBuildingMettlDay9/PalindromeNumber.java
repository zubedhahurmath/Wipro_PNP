package logicBuildingMettlDay9;

public class PalindromeNumber {
	public int isPalindrome(int input1)
    {
        int original = input1;
        int reverse = 0;

        while(input1 > 0)
        {
            int digit = input1 % 10;
            reverse = reverse * 10 + digit;
            input1 /= 10;
        }

        if(original == reverse)
            return 2;
        else
            return 1;
    }

    public static void main(String[] args)
    {
        PalindromeNumber obj = new PalindromeNumber();

        System.out.println(obj.isPalindrome(252));
        System.out.println(obj.isPalindrome(18981));
        System.out.println(obj.isPalindrome(5005));
        System.out.println(obj.isPalindrome(1234));
    }

}
