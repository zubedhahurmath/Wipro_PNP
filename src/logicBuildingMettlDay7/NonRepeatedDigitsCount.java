package logicBuildingMettlDay7;

public class NonRepeatedDigitsCount {
	public int nonRepeatedDigitsCount(int input1)
    {
        int[] freq = new int[10];
        int temp = input1;

        while(temp > 0)
        {
            freq[temp % 10]++;
            temp /= 10;
        }

        int count = 0;

        for(int i = 0; i < 10; i++)
        {
            if(freq[i] == 1)
                count++;
        }

        return count;
    }

    public static void main(String[] args)
    {
        NonRepeatedDigitsCount obj = new NonRepeatedDigitsCount();
        System.out.println(obj.nonRepeatedDigitsCount(292));
        System.out.println(obj.nonRepeatedDigitsCount(1015));
        System.out.println(obj.nonRepeatedDigitsCount(108));
        System.out.println(obj.nonRepeatedDigitsCount(22));
    }

}
