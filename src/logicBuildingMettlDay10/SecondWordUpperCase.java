package logicBuildingMettlDay10;

public class SecondWordUpperCase {
	public String readSecondWord(String input1)
    {
        String[] words = input1.trim().split("\\s+");

        if(words.length < 2)
            return "LESS";

        return words[1].toUpperCase();
    }

    public static void main(String[] args)
    {
        SecondWordUpperCase obj = new SecondWordUpperCase();

        System.out.println(obj.readSecondWord("Wipro Technologies Bangalore"));
        System.out.println(obj.readSecondWord("Hello World"));
        System.out.println(obj.readSecondWord("Championship 2017 League"));
        System.out.println(obj.readSecondWord("Hello"));
    }

}
