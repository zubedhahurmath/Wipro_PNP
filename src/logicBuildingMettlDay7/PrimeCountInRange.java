package logicBuildingMettlDay7;

public class PrimeCountInRange {
	public int primeCountInRange(int input1, int input2)
    {
        int count = 0;

        for(int i = input1; i <= input2; i++)
        {
            boolean prime = true;

            if(i < 2)
                prime = false;

            for(int j = 2; j <= Math.sqrt(i); j++)
            {
                if(i % j == 0)
                {
                    prime = false;
                    break;
                }
            }

            if(prime)
                count++;
        }

        return count;
    }

    public static void main(String[] args)
    {
        PrimeCountInRange obj = new PrimeCountInRange();
        System.out.println(obj.primeCountInRange(2, 20));
        System.out.println(obj.primeCountInRange(700, 725));
    }

}
