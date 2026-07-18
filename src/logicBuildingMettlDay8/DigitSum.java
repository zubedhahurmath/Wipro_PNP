package logicBuildingMettlDay8;

public class DigitSum {
	 public int digitSum(int input1)
	    {
	        while(input1 >= 10)
	        {
	            int sum = 0;

	            while(input1 > 0)
	            {
	                sum += input1 % 10;
	                input1 /= 10;
	            }

	            input1 = sum;
	        }

	        return input1;
	    }

	    public static void main(String[] args)
	    {
	        DigitSum obj = new DigitSum();
	        System.out.println(obj.digitSum(976592));
	        System.out.println(obj.digitSum(123456));
	    }

}
