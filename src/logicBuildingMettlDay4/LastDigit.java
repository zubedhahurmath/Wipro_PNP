package logicBuildingMettlDay4;


class LastDigit
{
    public int lastDigitof(int input1)
    {
        return Math.abs(input1 % 10);
    }

    public static void main(String[] args)
    {
        LastDigit obj = new LastDigit();
        System.out.println(obj.lastDigitof(197));
    }
}