package logicBuildingMettlDay9;

public class TotalHillWeight {
	public int totalHillWeight(int input1, int input2, int input3)
    {
        int totalWeight = 0;
        int levelWeight = input2;

        for(int i = 1; i <= input1; i++)
        {
            totalWeight += i * levelWeight;
            levelWeight += input3;
        }

        return totalWeight;
    }

    public static void main(String[] args)
    {
        TotalHillWeight obj = new TotalHillWeight();

        System.out.println(obj.totalHillWeight(5, 10, 2));
        System.out.println(obj.totalHillWeight(4, 1, 5));
    }

}
