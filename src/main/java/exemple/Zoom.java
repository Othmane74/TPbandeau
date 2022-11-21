package exemple;

import bandeau.Bandeau;

import java.awt.*;

public class Zoom extends Effet {
    private int TailleTexte;


    public void animate(Bandeau bd) {
        for (int i = 5; i < 60; i += 5) {
            bd.setFont(new Font("Dialog", Font.BOLD, 5 + i));
            bd.sleep(100);
        }
    }

    public Zoom(int TailleTexte) {
        this.TailleTexte = TailleTexte;


    }


    public Zoom(){}
}
