package ds;

public class Personne {
	private String nom;
	private String prenom;
	private int age;
	
	public Personne(String nom,String prenom , int age) {
		this.nom=nom;
		this.prenom=prenom;
		setAge(age);
	}
	public void setAge(int age) {
		if (age>0) {
			this.age=age;
		}else { this.age=1;}
		}
	
    public void afficherInfos() {
    	System.out.println("nom :"+ nom);
    	System.out.println("prenom:"+ prenom);
    	System.out.println("age:"+ age);
    	}
     
    }
