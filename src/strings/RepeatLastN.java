package strings;

public class RepeatLastN {
	public static void main(String[] args) {

        String str = "Wipro";
        int n = 3;

        String last = str.substring(str.length() - n);

        String result = "";

        for (int i = 0; i < n; i++) {
            result = result + last;
        }

        System.out.println(result);
    }

}
