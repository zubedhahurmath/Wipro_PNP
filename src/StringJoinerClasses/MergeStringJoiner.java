package StringJoinerClasses;
import java.util.StringJoiner;

public class MergeStringJoiner {
	public static void main(String[] args) {

        StringJoiner s1 = new StringJoiner("-");
        s1.add("Hyderabad");
        s1.add("Delhi");
        s1.add("Mumbai");

        StringJoiner s2 = new StringJoiner("-");
        s2.add("Chennai");
        s2.add("Bangalore");
        s2.add("Kolkata");

        StringJoiner merge1 = new StringJoiner("-");
        merge1.merge(s1);
        merge1.merge(s2);

        System.out.println("s1 merged to s2:");
        System.out.println(merge1);

        StringJoiner merge2 = new StringJoiner("-");
        merge2.merge(s2);
        merge2.merge(s1);

        System.out.println("\ns2 merged to s1:");
        System.out.println(merge2);
    }

}
