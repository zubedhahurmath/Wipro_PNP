package logicBuildingMettlDay9;

public class PalindromePossible {
	 public int isPalindromePossible(int input1)
	    {
	        int[] freq = new int[10];

	        while(input1 > 0)
	        {
	            freq[input1 % 10]++;
	            input1 /= 10;
	        }

	        int oddCount = 0;

	        for(int i = 0; i < 10; i++)
	        {
	            if(freq[i] % 2 != 0)
	                oddCount++;
	        }

	        if(oddCount <= 1)
	            return 2;
	        else
	            return 1;
	    }

	    public static void main(String[] args)
	    {
	        PalindromePossible obj = new PalindromePossible();

	        System.out.println(obj.isPalindromePossible(21251));
	        System.out.println(obj.isPalindromePossible(2125));
	    }

}
