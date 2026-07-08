package polymorphism;

public class Square extends Shape {

    @Override
    public void draw() {
        System.out.println("Drawing Square");
    }

    @Override
    public void erase() {
        System.out.println("Erasing Square");
    }

    public static void main(String[] args) {

        Shape c = new Circle();
        Shape t = new Triangle();
        Shape s = new Square();

        c.draw();
        c.erase();

        System.out.println();

        t.draw();
        t.erase();

        System.out.println();

        s.draw();
        s.erase();
    }
}
