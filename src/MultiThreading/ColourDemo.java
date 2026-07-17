package MultiThreading;
import java.util.Random;

class ColourThread implements Runnable {

    String colours[] = {"white", "blue", "black", "green", "red", "yellow"};

    public void run() {

        Random random = new Random();

        while (true) {

            int index = random.nextInt(colours.length);
            System.out.println(colours[index]);

            if (colours[index].equals("red")) {
                System.out.println("Red colour found. Thread stopped.");
                break;
            }

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
public class ColourDemo {
	public static void main(String[] args) {

        Thread t = new Thread(new ColourThread());
        t.start();
    }

}
