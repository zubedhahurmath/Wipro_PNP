package collections;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;

public class CountryMapDemo {

    HashMap<String, String> M1 = new HashMap<>();

    public HashMap<String, String> saveCountryCapital(String countryName, String capital) {
        M1.put(countryName, capital);
        return M1;
    }

    public String getCapital(String countryName) {
        return M1.get(countryName);
    }

    public String getCountry(String capitalName) {
        for (Map.Entry<String, String> entry : M1.entrySet()) {
            if (entry.getValue().equalsIgnoreCase(capitalName)) {
                return entry.getKey();
            }
        }
        return null;
    }

    public HashMap<String, String> swapKeyValue() {
        HashMap<String, String> M2 = new HashMap<>();

        for (Map.Entry<String, String> entry : M1.entrySet()) {
            M2.put(entry.getValue(), entry.getKey());
        }

        return M2;
    }

    public ArrayList<String> getCountryList() {
        ArrayList<String> list = new ArrayList<>();

        for (String country : M1.keySet()) {
            list.add(country);
        }

        return list;
    }

    public static void main(String[] args) {

        CountryMapDemo obj = new CountryMapDemo();

        obj.saveCountryCapital("India", "Delhi");
        obj.saveCountryCapital("Japan", "Tokyo");
        obj.saveCountryCapital("USA", "Washington");
        obj.saveCountryCapital("Australia", "Canberra");

        System.out.println(obj.M1);
        System.out.println(obj.getCapital("India"));
        System.out.println(obj.getCountry("Tokyo"));
        System.out.println(obj.swapKeyValue());
        System.out.println(obj.getCountryList());
    }
}