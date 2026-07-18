package logicBuildingMettlDay4;


class IsOdd
{
    public int isOdd(int input1)
    {
        if(input1 % 2 != 0)
            return 2;
        else
            return 1;
    }

    public static void main(String[] args)
    {
        IsOdd obj = new IsOdd();
        System.out.println(obj.isOdd(7));
    }
}