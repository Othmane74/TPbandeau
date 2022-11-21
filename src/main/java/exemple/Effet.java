package exemple;

import bandeau.Bandeau;

import java.util.*;

public abstract class Effet {
    List<Scenario> Scenarios= new ArrayList<Scenario>();

    public abstract void animate(Bandeau bd);
}
