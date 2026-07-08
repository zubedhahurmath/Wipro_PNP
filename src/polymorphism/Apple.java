package polymorphism;

public class Apple extends Fruit {

    public Apple() {
        super("Apple", "Sweet", "Medium");
    }

    @Override
    public void eat() {
        System.out.println("Fruit Name : " + name);
        System.out.println("Taste      : Sweet");
        System.out.println("Size       : " + size);
    }
}
