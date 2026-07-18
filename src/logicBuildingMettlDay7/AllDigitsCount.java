package logicBuildingMettlDay7;

public class AllDigitsCount {
	public int allDigitsCount(int input1)
    {
        int count = 0;

        while(input1 > 0)
        {
            count++;
            input1 /= 10;
        }

        return count;
    }

    public static void main(String[] args)
    {
        AllDigitsCount obj = new AllDigitsCount();
        System.out.println(obj.allDigitsCount(292));
        System.out.println(obj.allDigitsCount(1015));
    }


}
