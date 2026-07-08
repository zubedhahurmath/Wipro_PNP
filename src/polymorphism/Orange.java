package polymorphism;

public class Orange extends Fruit {

    public Orange() {
        super("Orange", "Sour", "Medium");
    }

    @Override
    public void eat() {
        System.out.println("Fruit Name : " + name);
        System.out.println("Taste      : Sour");
        System.out.println("Size       : " + size);
    }

    public static void main(String[] args) {

        Apple apple = new Apple();
        Orange orange = new Orange();

        System.out.println("Apple Details:");
        apple.eat();

        System.out.println();

        System.out.println("Orange Details:");
        orange.eat();
    }
}