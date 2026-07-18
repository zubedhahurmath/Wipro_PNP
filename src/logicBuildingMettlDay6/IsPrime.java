package logicBuildingMettlDay6;

public class IsPrime {
	 public int isPrime(int input1)
	    {
	        for(int i = 2; i <= Math.sqrt(input1); i++)
	        {
	            if(input1 % i == 0)
	                return 1;
	        }
	        return 2;
	    }

	    public static void main(String[] args)
	    {
	        IsPrime obj = new IsPrime();
	        System.out.println(obj.isPrime(7));
	        System.out.println(obj.isPrime(10));
	    }

}
