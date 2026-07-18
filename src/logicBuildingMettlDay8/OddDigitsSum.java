package logicBuildingMettlDay8;

public class OddDigitsSum {
	public int oddDigitsSum(int input1)
    {
        int sum = 0;

        while(input1 > 0)
        {
            int digit = input1 % 10;

            if(digit % 2 != 0)
                sum += digit;

            input1 /= 10;
        }

        return sum;
    }

    public static void main(String[] args)
    {
        OddDigitsSum obj = new OddDigitsSum();
        System.out.println(obj.oddDigitsSum(9625));
        System.out.println(obj.oddDigitsSum(2134));
    }

}
