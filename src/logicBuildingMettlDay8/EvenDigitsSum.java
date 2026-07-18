package logicBuildingMettlDay8;

public class EvenDigitsSum {
	public int evenDigitsSum(int input1)
    {
        int sum = 0;

        while(input1 > 0)
        {
            int digit = input1 % 10;

            if(digit % 2 == 0)
                sum += digit;

            input1 /= 10;
        }

        return sum;
    }

    public static void main(String[] args)
    {
        EvenDigitsSum obj = new EvenDigitsSum();
        System.out.println(obj.evenDigitsSum(9625));
        System.out.println(obj.evenDigitsSum(2134));
    }

}
