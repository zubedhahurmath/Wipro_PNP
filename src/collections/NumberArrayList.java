package collections;
import java.util.ArrayList;
public class NumberArrayList {
	public static void main(String[] args) {
        ArrayList<Number> list = new ArrayList<>();

        list.add(10);
        list.add(20.5f);
        list.add(30.75);
        list.add(100L);
        list.add((short)5);
        list.add((byte)2);

        for (Number n : list) {
            System.out.println(n);
        }
    }

}
