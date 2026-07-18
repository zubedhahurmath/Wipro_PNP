package logicBuildingMettlDay10;

public class MostFrequentDigit {
	public int mostFrequentDigit(int input1, int input2, int input3, int input4)
    {
        int[] freq = new int[10];

        int[] arr = {input1, input2, input3, input4};

        for(int num : arr)
        {
            while(num > 0)
            {
                freq[num % 10]++;
                num /= 10;
            }
        }

        int maxFreq = 0;
        int result = 0;

        for(int i = 0; i <= 9; i++)
        {
            if(freq[i] > maxFreq || (freq[i] == maxFreq && i > result))
            {
                maxFreq = freq[i];
                result = i;
            }
        }

        return result;
    }

    public static void main(String[] args)
    {
        MostFrequentDigit obj = new MostFrequentDigit();

        System.out.println(obj.mostFrequentDigit(123, 234, 345, 673));
        System.out.println(obj.mostFrequentDigit(123, 456, 345, 5043));
        System.out.println(obj.mostFrequentDigit(1203, 7624, 2046, 1052));
        System.out.println(obj.mostFrequentDigit(1203, 7624, 2046, 1002));
    }

}
