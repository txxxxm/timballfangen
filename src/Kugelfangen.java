import GLOOP.*;
public class Kugelfangen {
    private GLEntwicklerkamera kamera;
    private GLLicht licht;
    private GLHimmel himmel;
    private GLTastatur tastatur;

    private Box dieBox;
    private Kugel[] kugel;

    public Kugelfangen() {
        kamera = new GLEntwicklerkamera();
        kamera.setzePosition(0, 500, 800);

        licht = new GLLicht();
        himmel = new GLHimmel("src/img/Sterne.jpg");
        tastatur = new GLTastatur();

        Spielfeld spielfeld = new Spielfeld(1000, 1000);
        kugel = new Kugel[3];

        for (int i=0;i< kugel.length;i++){

            kugel[i] = new Kugel();

            int x = (int) (Math.random() * 425 - 200 );

            int z = (int) (Math.random() * 425 - 200);
            kugel[i].verschiebe(x, 0, z * i);

        }
        dieBox = new Box();
        fuehreAus();

    }

    public void fuehreAus() {
        while (!tastatur.esc()) {
            if (tastatur.links()) {
                dieBox.bewegeLinks();
            }
            if (tastatur.rechts()) {
                dieBox.bewegeRechts();
            }
            if (tastatur.oben()) {
                dieBox.bewegeOben();
            }
            if (tastatur.unten()) {
                dieBox.bewegeUnten();
            }
             for(int i =0; i< kugel.length;i++){kugel[i].randomBewege();}
            Sys.warte();
        }
    }
}

