package ex2;

public class LivretA extends CompteBancaire {

	/** tauxRemuneration : taux de rémunération dans le cas d'un livret A */
	public double tauxRemuneration;
	
	public LivretA(String type, double solde, double tauxRemuneration) {
		super(type, solde, 0);
		this.tauxRemuneration=tauxRemuneration;
	}

	public void appliquerRemunerationAnnuelle(){
			solde =+ solde*tauxRemuneration/100;
	}
	
}
