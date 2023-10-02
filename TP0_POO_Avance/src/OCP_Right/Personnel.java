package OCP_Right;

public class Personnel implements Personne {
    public String nom, prenom, bureau, domaine;

    Personnel(String nom, String prenom, String bureau, String domaine) {
        this.nom = nom;
        this.prenom = prenom;
        this.bureau = bureau;
        this.domaine = domaine;
    }

    @Override
    public void sePresenter() {
        System.out.println("Membre du personnel: " + nom + " " + prenom + " dans le bureau " + bureau + " s'occupe de " + domaine);
    }

}
