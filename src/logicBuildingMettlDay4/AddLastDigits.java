package logicBuildingMettlDay4;

class AddLastDigits
{
    public int addLastDigits(int input1, int input2)
    {
        return Math.abs(input1 % 10) + Math.abs(input2 % 10);
    }

    public static void main(String[] args)
    {
        AddLastDigits obj = new AddLastDigits();
        System.out.println(obj.addLastDigits(267, 154));
    }
}