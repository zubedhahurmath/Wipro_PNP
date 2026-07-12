package interfaceNewFeatures;

public interface FourWheeler {

    default void message() {
        System.out.println("Inside FourWheeler");
    }
}