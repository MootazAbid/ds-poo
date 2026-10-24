package ds;

public class ParrainMensuel extends Parrain {
	private double virementMensuel;
	public ParrainMensuel(String nom , String prenom , int age, double virementMensuel) {
		super(nom , prenom , age );
		this.virementMensuel=virementMensuel;
	}
	public double calculerVirementTotal() {
		 return getnbreEnfantsParraines() * virementMensuel;
	}
	public double getVirementMensuel() {
		return virementMensuel;
	}
	@Override
	public void afficherInfos() {
		super.afficherInfos();
		System.out.println("virementMensuel: "+ virementMensuel);
		System.out.println("virement total:"+ calculerVirementTotal());
	}
}
