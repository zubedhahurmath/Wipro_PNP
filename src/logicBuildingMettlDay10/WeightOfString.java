package logicBuildingMettlDay10;

public class WeightOfString {
	public int weightOfString(String input1, int input2)
    {
        int weight = 0;

        input1 = input1.toLowerCase();

        for(int i = 0; i < input1.length(); i++)
        {
            char ch = input1.charAt(i);

            if(ch >= 'a' && ch <= 'z')
            {
                if(input2 == 0)
                {
                    if(ch!='a' && ch!='e' && ch!='i' && ch!='o' && ch!='u')
                        weight += ch - 'a' + 1;
                }
                else
                {
                    weight += ch - 'a' + 1;
                }
            }
        }

        return weight;
    }

    public static void main(String[] args)
    {
        WeightOfString obj = new WeightOfString();

        System.out.println(obj.weightOfString("Hello World!!", 0));
        System.out.println(obj.weightOfString("Hello World!!", 1));
        System.out.println(obj.weightOfString("All Zebras are Black & White!!", 0));
        System.out.println(obj.weightOfString("All Zebras are Black & White!!", 1));
    }


}
