import GLOOP.*;


import javax.media.opengl.GL;

public class Kugel{

    public GLKugel  kugel;
    private Box dieBox;
    private Spielfeld feld;

    private double radius;
    private boolean istAktiv;
    private double vX, vZ;
    private Kugelfangen kugelfangen;


    public Kugel() {
        kugel = new GLKugel(0,39,0,19);

    }
    public void randomBewege(){


         if (kugel.gibX() > -425 && kugel.gibX()<425 && kugel.gibZ() < 425 && kugel.gibZ() > -425){
         kugel.verschiebe(Math.random(),0,Math.random());
        }



    }
    public void verschiebe(double a, double b, double c){
        kugel.verschiebe(a,b,c);
    }
}
