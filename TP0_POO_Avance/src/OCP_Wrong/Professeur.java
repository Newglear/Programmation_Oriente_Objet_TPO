package OCP_Wrong;

import java.util.ArrayList;
import java.util.List;

public class Professeur {
    public String nom, prenom, bureau;
    public List<Cours> listeCours = new ArrayList<>();

    Professeur(String nom, String prenom, String bureau) {
        this.nom = nom;
        this.prenom = prenom;
        this.bureau = bureau;
    }
}
