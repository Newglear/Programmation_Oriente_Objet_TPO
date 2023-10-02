package OCP_Right;

import java.util.ArrayList;
import java.util.List;

public class Cours {
    public String nom, salle;
    public List<Etudiant> listeEtudiants = new ArrayList<>();
    public Professeur professeur;

    Cours(String nom, String salle, Professeur professeur) {
        this.nom = nom;
        this.salle = salle;
        this.professeur = professeur;
    }

    public void addEtudiant(Etudiant etudiant) {
        listeEtudiants.add(etudiant);
    }

}
