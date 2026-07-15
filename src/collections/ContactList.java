package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ContactList {

    public static void main(String[] args) {

        HashMap<String, Integer> contacts = new HashMap<>();

        contacts.put("Rahul", 987654321);
        contacts.put("Priya", 912345678);
        contacts.put("Amit", 998877665);
        contacts.put("Sneha", 987123456);

        String name = "Priya";

        if (contacts.containsKey(name)) {
            System.out.println(name + " exists.");
        } else {
            System.out.println(name + " does not exist.");
        }

        int phone = 998877665;

        if (contacts.containsValue(phone)) {
            System.out.println(phone + " exists.");
        } else {
            System.out.println(phone + " does not exist.");
        }

        Iterator<Map.Entry<String, Integer>> iterator = contacts.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}