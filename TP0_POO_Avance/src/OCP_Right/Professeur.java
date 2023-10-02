package OCP_Right;

import java.util.ArrayList;
import java.util.List;

public class Professeur implements Personne {
    public String nom, prenom, bureau;
    public List<Cours> listeCours = new ArrayList<>();

    Professeur(String nom, String prenom, String bureau) {
        this.nom = nom;
        this.prenom = prenom;
        this.bureau = bureau;
    }

    @Override
    public void sePresenter() {
        System.out.print("Professeur: " + nom + " " + prenom + " dans le bureau " + bureau);
        System.out.print("Enseigne les cours suivants:");
        coursEnseigne();
    }

    public void addCours(Cours cours) {
        listeCours.add(cours);
    }

     void coursEnseigne(){
        // return a concatenated string of all the cours.nom
        listeCours.forEach(cours -> System.out.print(cours.nom + " "));
         System.out.println("\n");
    }
}
