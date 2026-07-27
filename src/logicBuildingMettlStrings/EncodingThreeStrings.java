package logicBuildingMettlStrings;

public class EncodingThreeStrings {
	static String[] splitString(String str) {
        int len = str.length();
        int q = len / 3;
        int r = len % 3;
        int front = q;
        int middle = q;
        int end = q;
        if (r == 1) {
            middle++;
        } else if (r == 2) {
            front++;
            end++;
        }
        String first = str.substring(0, front);
        String second = str.substring(front, front + middle);
        String third = str.substring(front + middle);
        return new String[] { first, second, third };
    }
    static String toggleCase(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isUpperCase(ch))
                result += Character.toLowerCase(ch);
            else
                result += Character.toUpperCase(ch);
        }
        return result;
    }
    public static void main(String[] args) {
        String input1 = "John";
        String input2 = "Johny";
        String input3 = "Janardhan";
        String[] s1 = splitString(input1);
        String[] s2 = splitString(input2);
        String[] s3 = splitString(input3);
        String output1 = s1[0] + s2[0] + s3[0];
        String output2 = s1[1] + s2[1] + s3[1];
        String output3 = s1[2] + s2[2] + s3[2];
        output3 = toggleCase(output3);
        System.out.println("Output1 = " + output1);
        System.out.println("Output2 = " + output2);
        System.out.println("Output3 = " + output3);
    }
}
