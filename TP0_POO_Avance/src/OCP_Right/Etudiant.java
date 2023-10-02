package OCP_Right;

public class Etudiant implements Personne {
    public final String nom;
    public final String prenom;
    public final String domaine;

    Etudiant(String nom, String prenom, String domaine) {
        this.nom = nom;
        this.prenom = prenom;
        this.domaine = domaine;
    }

    @Override
    public void sePresenter() {
        System.out.println("Etudiant: " + nom + " " + prenom + " étudiant en " + domaine);
    }
}
