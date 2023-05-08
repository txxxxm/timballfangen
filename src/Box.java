import GLOOP.*;

import javax.media.opengl.GL;

public class Box{
    private GLQuader quader;
    private Spielfeld feld;
    private double vX,vZ;
    private double breite, tiefe;

    public Box() {
        quader = new GLQuader(0,0,0,50,40,50);
        quader.setzePosition(0,35,0);
        quader.setzeFarbe(10,4,2);

    }
    public void bewegeLinks(){
        if(quader.gibX()>-425){
            quader.verschiebe(-2.5,0,0);

        }
    }

    public void bewegeRechts(){
        if(quader.gibX()<425){
            quader.verschiebe(2.5,0,0);

        }
    }

    public void bewegeUnten(){
        if(quader.gibZ()<425){
            quader.verschiebe(0,0,2.5);

        }
    }

    public void bewegeOben(){
        if(quader.gibZ()>-425){
            quader.verschiebe(0,0,-2.5);

        }
    }

    public double gibX(){
        return quader.gibX();}

    public double gibY(){
        return quader.gibY();}

    public double gibZ(){
        return quader.gibZ();}
}

