package priseEnMain;

/**
 *
 * @author aminiscloux
 */
public class PremierProgramme {
    private String prenom ;
    private String nom ;

    public PremierProgramme(String prenom, String nom) {
        this.prenom = prenom;
        this.nom = nom;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        PremierProgramme essai = new PremierProgramme("Anthony", null);
        System.out.println(essai.getPrenom()+", que penses-tu de Java ?");
        System.out.println("Java c'est mieux avec mon livre !");
    }

    /**
     * @return the prenom
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * @param prenom the prenom to set
     */
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    /**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }
    
}
