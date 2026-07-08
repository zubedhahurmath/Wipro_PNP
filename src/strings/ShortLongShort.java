package strings;

public class ShortLongShort {
	public static void main(String[] args) {

        String a = "Hi";
        String b = "Hello";

        if (a.length() < b.length()) {
            System.out.println(a + b + a);
        } else {
            System.out.println(b + a + b);
        }
    }


}
