package logicBuildingMettlDay7;

public class UniqueDigitsCount {
	 public int uniqueDigitsCount(int input1)
	    {
	        boolean[] visited = new boolean[10];
	        int count = 0;

	        while(input1 > 0)
	        {
	            int digit = input1 % 10;

	            if(!visited[digit])
	            {
	                visited[digit] = true;
	                count++;
	            }

	            input1 /= 10;
	        }

	        return count;
	    }

	    public static void main(String[] args)
	    {
	        UniqueDigitsCount obj = new UniqueDigitsCount();
	        System.out.println(obj.uniqueDigitsCount(292));
	        System.out.println(obj.uniqueDigitsCount(1015));
	    }

}
