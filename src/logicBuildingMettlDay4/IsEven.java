package logicBuildingMettlDay4;



class IsEven
{
    public int isEven(int input1)
    {
        if(input1 % 2 == 0)
            return 2;
        else
            return 1;
    }

    public static void main(String[] args)
    {
        IsEven obj = new IsEven();
        System.out.println(obj.isEven(10));
    }
}