package collections;
import java.util.TreeSet;
import java.util.Iterator;
public class CountryTreeSet {
	TreeSet<String> T1 = new TreeSet<>();

    public TreeSet<String> saveCountryNames(String countryName) {
        T1.add(countryName);
        return T1;
    }
    public String getCountry(String countryName) {

        Iterator<String> iterator = T1.iterator();

        while (iterator.hasNext()) {
            String country = iterator.next();

            if (country.equalsIgnoreCase(countryName)) {
                return country;
            }
        }

        return null;
    }
    public static void main(String[] args) {

        CountryTreeSet obj = new CountryTreeSet();

        obj.saveCountryNames("India");
        obj.saveCountryNames("USA");
        obj.saveCountryNames("Japan");
        obj.saveCountryNames("Australia");
        obj.saveCountryNames("Canada");

        System.out.println("Countries in TreeSet:");
        System.out.println(obj.T1);

        System.out.println("\nSearching Countries:");

        System.out.println("India : " + obj.getCountry("India"));
        System.out.println("Japan : " + obj.getCountry("Japan"));
        System.out.println("Germany : " + obj.getCountry("Germany"));
    }

}
