package collections;
import java.util.HashSet;
import java.util.Iterator;
public class CountryDemo {
	HashSet<String> H1 = new HashSet<>();
    public HashSet<String> saveCountryNames(String countryName) {
        H1.add(countryName);
        return H1;
    }
    public String getCountry(String countryName) {
        Iterator<String> iterator = H1.iterator();

        while (iterator.hasNext()) {
            String country = iterator.next();

            if (country.equalsIgnoreCase(countryName)) {
                return country;
            }
        }

        return null;
    }
    public static void main(String[] args) {

        CountryDemo obj = new CountryDemo();

        obj.saveCountryNames("India");
        obj.saveCountryNames("USA");
        obj.saveCountryNames("Japan");
        obj.saveCountryNames("Australia");

        System.out.println("Countries in HashSet:");
        System.out.println(obj.H1);

        System.out.println("\nSearching Countries:");

        System.out.println("India : " + obj.getCountry("India"));
        System.out.println("Japan : " + obj.getCountry("Japan"));
        System.out.println("Canada : " + obj.getCountry("Canada"));
    }
}
