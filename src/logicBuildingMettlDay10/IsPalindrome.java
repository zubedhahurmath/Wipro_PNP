package logicBuildingMettlDay10;

public class IsPalindrome {
	public int isPalindrome(String input1)
    {
        input1 = input1.toLowerCase();

        int left = 0;
        int right = input1.length() - 1;

        while(left < right)
        {
            if(input1.charAt(left) != input1.charAt(right))
                return 1;

            left++;
            right--;
        }

        return 2;
    }

    public static void main(String[] args)
    {
        IsPalindrome obj = new IsPalindrome();

        System.out.println(obj.isPalindrome("Madam"));
        System.out.println(obj.isPalindrome("malayalam"));
        System.out.println(obj.isPalindrome("Level"));
        System.out.println(obj.isPalindrome("Hello"));
    }

}
