package strings;

public class RemoveStar {
	public static void main(String[] args) {

        String str = "ab*cd";
        String result = "";

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == '*') {
                continue;
            }

            if (i > 0 && str.charAt(i - 1) == '*') {
                continue;
            }

            if (i < str.length() - 1 && str.charAt(i + 1) == '*') {
                continue;
            }

            result = result + str.charAt(i);
        }

        System.out.println(result);
    }

}
