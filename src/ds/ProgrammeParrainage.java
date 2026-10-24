package ds;


public class ProgrammeParrainage {

    public static void main(String[] args) {
        Parrain[] parrains = new Parrain[10];
        parrains[0] = new Parrain("Ali", "Ben Ali", 40);
        parrains[1] = new Parrain("Salah", "Ben Salah", 35);
        parrains[2] = new ParrainMensuel("Tounes", "Ben Tounes", 45, 100.0);
        Enfant[] enfants = new Enfant[1025];
        enfants[0] = new Enfant("Farah", "ben Farah", 10, "quatrieme annee");
        enfants[1] = new Enfant("Amel", "ben Amel", 12, "Sixieme annee");
        enfants[2] = new Enfant("Fedy", "Ben Fedy", 11, "Sixieme annee");
        enfants[3] = new Enfant("Sarra", "Ben Sarra", 9, "Troisieme annee");
        parrains[0].ajouterEnfant(enfants[0]);
        parrains[2].ajouterEnfant(enfants[1]);
        parrains[2].ajouterEnfant(enfants[2]);
        int totalEnfants = 0;
        for (int i = 0; i < 3; i++) {
            totalEnfants += parrains[i].getnbreEnfantsParraines();}
        System.out.println("nbrttl d'enfants parraines : "+ totalEnfants);
        for (int i = 0; i < 3; i++) {
            for (int j = 0;j < parrains[i].getnbreEnfantsParraines(); j++) {
                Enfant e = parrains[i].getEnfant(j);
                if ("Sixieme annee".equals(e.getClasse())) {
                    e.afficherInfos();
                    System.out.println("----------------");}}
        }
        double totalVirements = 0;
        for (int i = 0; i < 3; i++) {
            if (parrains[i].getClass()==ParrainMensuel.class) {
                ParrainMensuel pm=(ParrainMensuel) parrains[i];
                totalVirements += pm.calculerVirementTotal();}
        }
        System.out.println("Total des virements mensuels : " + totalVirements );}
}

