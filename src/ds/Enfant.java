
package ds;

public class Enfant extends Personne {
    private static int cmp = 0;
    private int idEnfant;
    private String classe;
    public Enfant(String nom, String prenom, int age) {
        super(nom, prenom, age);
        cmp++;
        idEnfant = cmp;}
    public Enfant(String nom, String prenom, int age, String classe) {
        /*super(nom, prenom, age);
        cmp++;
        idEnfant = cmp;*/
    	this(nom,prenom,age);
        this.classe = classe;}
    public String getClasse() {
        return classe;}
    @Override
    public void afficherInfos() {
        super.afficherInfos();
        System.out.println("id enfant : " + idEnfant);
        System.out.println("la classe : " + classe);}
}
