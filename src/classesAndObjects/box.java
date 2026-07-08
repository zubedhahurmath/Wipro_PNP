package classesAndObjects;

public class box {
	double width;
    double height;
    double depth;
    box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
    double getVolume() {
        return width * height * depth;
    }
    public static void main(String[] args) {
        box box = new box(5.0, 4.0, 3.0);

        System.out.println("Width : " + box.width);
        System.out.println("Height: " + box.height);
        System.out.println("Depth : " + box.depth);
        System.out.println("Volume of Box = " + box.getVolume());
    }
}
