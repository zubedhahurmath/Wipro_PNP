package collections;

public class DigitCountDemo {
	 public static void main(String[] args) {

	        DigitCountInterface d = DigitCount::digitCount;

	        System.out.println(d.digitCount(123456));
	    }

}
