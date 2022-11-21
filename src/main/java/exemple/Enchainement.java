package exemple;

import java.util.ArrayList;
import java.util.List;

public class Enchainement {
    private int nbRepetition;
    private Scenario scenario;
    private Effet effet;

public Enchainement(Scenario scenario,Effet effet, int nbRepetition){
    this.effet=effet;
    this.scenario=scenario;
    this.nbRepetition=nbRepetition;
}
public int getNbRepetition(){
    return nbRepetition;
}
    public Effet getEffet(){
        return effet;
    }

}
