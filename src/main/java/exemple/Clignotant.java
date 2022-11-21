package exemple;

import bandeau.Bandeau;

public class Clignotant extends Effet {



    public void animate(Bandeau bd){
        String message =bd.getMessage();
        bd.setMessage("");
        bd.sleep(1000);
        bd.setMessage(message);
    }

    public Clignotant(){

    }
}
