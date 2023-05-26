import GLOOP.*;


import javax.media.opengl.GL;

public class Kugel{

    public GLKugel  kugel;
    public GLTafel tafel, tafel2;
    private Box dieBox;
    private Spielfeld feld;

    private double radius;
    private boolean istAktiv;
     double vX, vZ;
    double h = 0;
    private Kugelfangen kugelfangen;
    double q = Math.random()*2.5-Math.random()*2.5;
    double w = Math.random()*2.5-Math.random()*2.5;
    double u = 3;
    public Kugel(Box pBox) {
        kugel = new GLKugel(0,39,0,19);
        dieBox = pBox;

    }
    public void randomBewege(){
        vX = q;
        vZ = w;


        if(this.getroffen()){kugel.setzeSichtbarkeit(false);
       u = u-1;


        }
        if(u==0){

            tafel2 = new GLTafel(200,100,0,400,200);
            tafel2.setzeText("Gewonnen!",10);}







            kugel.verschiebe(vX,0,vZ);
            if (kugel.gibX()  <= -400 || kugel.gibX()  >= 400||kugel.gibZ()  <= -400 || kugel.gibZ()  >= 400) {
                vX = -vX;


                vZ = -vZ;
            }
        kugel.verschiebe(vX,0,vZ);




    }
    public void verschiebe(double a, double b, double c){
        kugel.verschiebe(a,b,c);
    }

    public boolean getroffen(){
        double abstand = Math.sqrt(
                Math.pow(dieBox.gibX()-kugel.gibX(),2)+
                        Math.pow(dieBox.gibY()-kugel.gibY(),2)+
                        Math.pow(dieBox.gibZ()-kugel.gibZ(),2)
        );

        if(abstand<25) {return true;
        }else return false;
    }

}
