package logicBuildingMettlStrings;

public class IdentifyPossibleWords {
	public static String identifyPossibleWords(String input1, String input2) {
        String[] words = input2.split(":");
        String result = "";
        for (String word : words) {
            if (word.length() != input1.length())
                continue;
            boolean match = true;
            for (int i = 0; i < input1.length(); i++) {
                char ch1 = Character.toUpperCase(input1.charAt(i));
                char ch2 = Character.toUpperCase(word.charAt(i));
                if (ch1 != '_' && ch1 != ch2) {
                    match = false;
                    break;
                }
            }
            if (match) {
                if (result.length() > 0)
                    result += ":";
                result += word.toUpperCase();
            }
        }
        if (result.length() == 0)
            return "ERROR-009";
        return result;
    }
    public static void main(String[] args) {
        String input1 = "Fi_er";
        String input2 = "Fever:filter:Filter:Fixer:Fiber:fibre:tailor:offer";
        System.out.println(identifyPossibleWords(input1, input2));
    }
}
