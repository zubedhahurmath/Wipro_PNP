package MiniProject11;

class RaceThread extends Thread {
    private static boolean raceFinished = false;
    private String runnerName;
    RaceThread(String runnerName) {
        this.runnerName = runnerName;
        setName(runnerName);
    }
    public void run() {
        for (int distance = 1; distance <= 100 && !raceFinished; distance++) {
            System.out.println(runnerName + " ran " + distance + " meters");
            if (runnerName.equals("Hare") && distance == 60) {
                try {
                    System.out.println("Hare is sleeping for 1000 milliseconds...");
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    return;
                }
            }
            if (raceFinished)
                return;
            if (distance == 100) {
                raceFinished = true;
                System.out.println("\n" + runnerName + " wins the race!");
                return;
            }
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                return;
            }
        }
    }
}
public class HareTortoiseRace {
    public static void main(String[] args) {
        RaceThread hare = new RaceThread("Hare");
        RaceThread tortoise = new RaceThread("Tortoise");
        hare.setPriority(Thread.MAX_PRIORITY);
        tortoise.setPriority(Thread.MIN_PRIORITY);
        hare.start();
        tortoise.start();
        try {
            hare.join();
            tortoise.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("\nRace Finished.");
    }
}