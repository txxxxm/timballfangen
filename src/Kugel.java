import GLOOP.*;


import javax.media.opengl.GL;

public class Kugel{

    public GLKugel  kugel;
    private Box dieBox;
    private Spielfeld feld;

    private double radius;
    private boolean istAktiv;
     double vX, vZ;
    private Kugelfangen kugelfangen;
    double q = Math.random()*2.5-Math.random()*2.5;
    double w = Math.random()*2.5-Math.random()*2.5;

    public Kugel() {
        kugel = new GLKugel(0,39,0,19);

    }
    public void randomBewege(){
        vX = q;
        vZ = w;
        double h = 0;

         kugel.verschiebe(vX,0,vZ);
        if(h==0) {
            if (kugel.gibX() - 19 < -425 || kugel.gibX() - 19 > 425) {
                vX = -1 * vX;
            }
            if (kugel.gibZ() - 19 < -425 || kugel.gibZ() - 19 > 425) {
                vZ = vZ * -1;
            }
        }


     kugel.verschiebe(vX,0,vZ);

    }
    public void verschiebe(double a, double b, double c){
        kugel.verschiebe(a,b,c);
    }
}
