package strings;

public class CombineStrings {
	public static void main(String[] args) {

        String a = "Hello";
        String b = "World";

        String result = "";

        int min = Math.min(a.length(), b.length());

        for (int i = 0; i < min; i++) {
            result = result + a.charAt(i) + b.charAt(i);
        }

        if (a.length() > b.length()) {
            result = result + a.substring(min);
        } else if (b.length() > a.length()) {
            result = result + b.substring(min);
        }

        System.out.println(result);
    }

}
