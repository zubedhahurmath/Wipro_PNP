package logicBuildingMettlDay6;

public class Factorial {
	public int factorial(int input1)
    {
        int fact = 1;

        for(int i = 1; i <= input1; i++)
            fact *= i;

        return fact;
    }

    public static void main(String[] args)
    {
        Factorial obj = new Factorial();
        System.out.println(obj.factorial(5));
        System.out.println(obj.factorial(4));
        System.out.println(obj.factorial(9));
    }

}
