package logicBuildingMettlDay5;

public class ExactMultiple {
	public int isExactMultiple(int input1, int input2)
    {
        if(input1 == 0 || input2 == 0)
            return 3;
        else if(input1 % input2 == 0)
            return 2;
        else
            return 1;
    }

    public static void main(String[] args)
    {
        ExactMultiple obj = new ExactMultiple();
        System.out.println(obj.isExactMultiple(12, 3));
        System.out.println(obj.isExactMultiple(10, 3));
        System.out.println(obj.isExactMultiple(0, 5));
    }

}
