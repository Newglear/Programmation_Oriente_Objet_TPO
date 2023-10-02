package OCP_Wrong;

public class Main {
    public static void main(String[] args) {
        Etudiant etudiant = new Etudiant("Gwenael","Robert", "Informatique et Mathématiques");
        Professeur professeur = new Professeur( "Jean", "Doe", "P1-1698");
        Personnel personnel = new Personnel( "Pierre", "Dupont", "P1-1698", "Comptabilite");

        Presenter(professeur);
        Presenter(personnel);
        Presenter(etudiant);
    }

    public static void Presenter(Object o){
        if(o instanceof Etudiant){
            var etudiant = (Etudiant) o;
            System.out.println("Etudiant: " + etudiant.nom + " " + etudiant.prenom + " étudiant en " + etudiant.domaine);
        }
        if(o instanceof Professeur){
            var professeur = (Professeur) o;
            System.out.println("Professeur: " + professeur.nom + " " + professeur.prenom + " dans le bureau " + professeur.bureau);
        }
        if(o instanceof Personnel){
            var personnel = (Personnel) o;
            System.out.println("Membre du personnel: " + personnel.nom + " " + personnel.prenom + " dans le bureau " + personnel.bureau + " s'occupe de " + personnel.domaine);
        }
    }
}
