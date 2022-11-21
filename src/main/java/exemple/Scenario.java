package exemple;
import bandeau.Bandeau;

import java.util.*;

public class Scenario {

    private List<Enchainement> enchainements = new ArrayList<Enchainement>();
    public Scenario() {

    }

    public void start(Bandeau bd){
   for(Enchainement ench: enchainements){
    for (int i=0;i< ench.getNbRepetition();i++){
        ench.getEffet().animate(bd);
        bd.sleep(1000);
    }
}
    }
    public void addEffet(Effet effet, int Occurences){
        Enchainement ench= new Enchainement(this,effet,Occurences);
        this.enchainements.add(ench);
    }





}
