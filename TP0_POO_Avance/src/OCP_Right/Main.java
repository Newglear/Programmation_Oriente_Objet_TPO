package OCP_Right;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Personne p = new Etudiant("Robert", "Gwenael", "Informatique et Mathématiques");
        Personne p2 = new Professeur("Jean", "Doe", "P1-1698");
        Personne p3 = new Personnel("Pierre", "Dupont", "P1-1698", "Comptabilite");

        ((Professeur) p2).addCours(new Cours("Cours 1", "Salle 1", (Professeur) p2));

        p.sePresenter();
        p2.sePresenter();
        p3.sePresenter();
    }


}
