package logicBuildingMettlStrings;

public class GetCodeThroughStrings {
	public static int getCodeThroughStrings(String input1) {
        String[] words = input1.split(" ");
        int totalLength = 0;
        for (String word : words) {
            totalLength += word.length();
        }
        while (totalLength >= 10) {
            int sum = 0;
            while (totalLength > 0) {
                sum += totalLength % 10;
                totalLength = totalLength / 10;
            }
            totalLength = sum;
        }
        return totalLength;
    }
    public static void main(String[] args) {
        String input = "Wipro Technologies";
        int result = getCodeThroughStrings(input);
        System.out.println("PIN = " + result);
    }
}
