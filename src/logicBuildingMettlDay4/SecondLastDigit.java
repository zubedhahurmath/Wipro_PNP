package logicBuildingMettlDay4;


class SecondLastDigit
{
    public int secondLastDigitof(int input1)
    {
        if(Math.abs(input1) < 10)
            return -1;

        return Math.abs((input1 / 10) % 10);
    }

    public static void main(String[] args)
    {
        SecondLastDigit obj = new SecondLastDigit();
        System.out.println(obj.secondLastDigitof(197));
    }
}