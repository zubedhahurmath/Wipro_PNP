package strings;

public class FirstTwoChars {
	public static void main(String[] args) {

        String str = "Wipro";

        String firstTwo = str.substring(0, 2);
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            result = result + firstTwo;
        }

        System.out.println(result);
    }

}
