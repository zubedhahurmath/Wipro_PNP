package logicBuildingMettlDay9;

public class CreatePIN {
	public int createPIN(int input1, int input2, int input3)
    {
        int unit = Math.min(input1 % 10, Math.min(input2 % 10, input3 % 10));

        int tens = Math.min((input1 / 10) % 10,
                   Math.min((input2 / 10) % 10, (input3 / 10) % 10));

        int hundreds = Math.min(input1 / 100,
                       Math.min(input2 / 100, input3 / 100));

        int maxDigit = 0;

        int[] arr = {input1, input2, input3};

        for(int num : arr)
        {
            while(num > 0)
            {
                int digit = num % 10;
                if(digit > maxDigit)
                    maxDigit = digit;
                num /= 10;
            }
        }

        return maxDigit * 1000 + hundreds * 100 + tens * 10 + unit;
    }

    public static void main(String[] args)
    {
        CreatePIN obj = new CreatePIN();

        System.out.println(obj.createPIN(123, 582, 175));
        System.out.println(obj.createPIN(190, 267, 853));
    }

}
