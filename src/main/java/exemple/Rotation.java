package exemple;

import bandeau.Bandeau;

public class Rotation extends Effet {
    private double degreRot=Math.PI;

    public void animate(Bandeau bd){
        bd.setRotation(Math.PI / 2.0f);
        bd.sleep(100);
        bd.setRotation(0.0f);
    }

    public Rotation(double degreRot){
        this.degreRot=degreRot;
    }
    public Rotation() {

    }


}
