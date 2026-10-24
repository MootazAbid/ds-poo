package ds;

public class Parrain extends Personne {
	private static int camp=0;
	private int idParrain;
	private int nombreEnfantsParraines;
	private Enfant[] mesEnfants;
	
	public Parrain(String nom , String prenom ,int age) {
		super(nom , prenom , age);
		camp++;
		idParrain=camp;
		nombreEnfantsParraines=0;
		mesEnfants=new Enfant[100];
	}
	public Enfant getEnfant(int i) {
	    return mesEnfants[i];
	}
	public void ajouterEnfant(Enfant enfant) {
		if(nombreEnfantsParraines<100) {
		mesEnfants[nombreEnfantsParraines]=enfant;
		nombreEnfantsParraines++;
	}else {
		System.out.println("le nbr max est atteint");
	}
	}
	public int getnbreEnfantsParraines() {
		return nombreEnfantsParraines;
	    }
	@Override
	public void afficherInfos() {
		super.afficherInfos();
		System.out.println("id parrain:" + idParrain);
		System.out.println("nombre d'enfants parraines:" + nombreEnfantsParraines );
		for (int i = 0; i < nombreEnfantsParraines; i++){
			mesEnfants[i].afficherInfos();
			System.out.println("-----------");}	
	}
}
