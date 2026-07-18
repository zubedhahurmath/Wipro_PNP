package logicBuildingMettlDay5;

public class CountOddNumbers {
	public int countOddNumbers(int input1, int input2, int input3, int input4, int input5)
    {
        int count = 0;

        if(input1 % 2 != 0) count++;
        if(input2 % 2 != 0) count++;
        if(input3 % 2 != 0) count++;
        if(input4 % 2 != 0) count++;
        if(input5 % 2 != 0) count++;

        return count;
    }

    public static void main(String[] args)
    {
        CountOddNumbers obj = new CountOddNumbers();
        System.out.println(obj.countOddNumbers(12, 17, 19, 14, 115));
        System.out.println(obj.countOddNumbers(15, 0, -12, 19, 28));
    }

}
