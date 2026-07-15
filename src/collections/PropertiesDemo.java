package collections;

import java.util.Properties;
import java.util.Iterator;
import java.util.Set;
import java.util.Map;

public class PropertiesDemo {

    public static void main(String[] args) {

        Properties p = new Properties();

        p.setProperty("Andhra Pradesh", "Amaravati");
        p.setProperty("Telangana", "Hyderabad");
        p.setProperty("Karnataka", "Bengaluru");
        p.setProperty("Tamil Nadu", "Chennai");
        p.setProperty("Maharashtra", "Mumbai");

        Set<Map.Entry<Object, Object>> set = p.entrySet();

        Iterator<Map.Entry<Object, Object>> iterator = set.iterator();

        while (iterator.hasNext()) {
            Map.Entry<Object, Object> entry = iterator.next();
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}