package logicBuildingMettlDay6;

public class NthPrime {
	public int nthPrime(int input1)
    {
        int count = 0;
        int num = 1;

        while(count < input1)
        {
            num++;
            boolean prime = true;

            for(int i = 2; i <= Math.sqrt(num); i++)
            {
                if(num % i == 0)
                {
                    prime = false;
                    break;
                }
            }

            if(prime)
                count++;
        }

        return num;
    }

    public static void main(String[] args)
    {
        NthPrime obj = new NthPrime();
        System.out.println(obj.nthPrime(10));
        System.out.println(obj.nthPrime(13));
    }

}
