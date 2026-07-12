package interfaces.live;

import interfaces.Playable;
import interfaces.string.Veena;
import interfaces.wind.Saxophone;

public class Test {

    public static void main(String[] args) {
        Veena veena = new Veena();
        veena.play();

        Saxophone saxophone = new Saxophone();
        saxophone.play();

        Playable p;

        p = new Veena();
        p.play();

        p = new Saxophone();
        p.play();
    }
}