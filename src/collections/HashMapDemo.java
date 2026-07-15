package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapDemo {

    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<>();

        map.put("India", "Delhi");
        map.put("Japan", "Tokyo");
        map.put("USA", "Washington");
        map.put("Australia", "Canberra");

        String key = "India";

        if (map.containsKey(key)) {
            System.out.println(key + " exists.");
        } else {
            System.out.println(key + " does not exist.");
        }

        String value = "Tokyo";

        if (map.containsValue(value)) {
            System.out.println(value + " exists.");
        } else {
            System.out.println(value + " does not exist.");
        }

        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}