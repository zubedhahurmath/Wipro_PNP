package logicBuildingMettlDay6;

public class NthFibonacci {
	public int nthFibonacci(int input1)
    {
        if(input1 == 1)
            return 0;
        if(input1 == 2)
            return 1;

        int a = 0;
        int b = 1;
        int c = 0;

        for(int i = 3; i <= input1; i++)
        {
            c = a + b;
            a = b;
            b = c;
        }

        return b;
    }

    public static void main(String[] args)
    {
        NthFibonacci obj = new NthFibonacci();
        System.out.println(obj.nthFibonacci(1));
        System.out.println(obj.nthFibonacci(5));
        System.out.println(obj.nthFibonacci(10));
    }

}
