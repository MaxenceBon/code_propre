package ex2;

/** Représente un compte bancaire de type compte courante (type=CC) ou livret A (type=LA)
 * @author Maxence
 */
public class CompteBancaire {

	/** solde du compte */
	protected double solde;
	
	/** découvert autorisé pour les comptes courants */
	private double decouvert;
	
	
	/** type du compte, "compteCourant" ou "livretA" */
	private String type;
	
	/**
	 * @param solde
	 * @param decouvert
	 * @param type
	 */
	public CompteBancaire(String type, double solde, double decouvert) {
		super();
		this.type = type;
		this.solde = solde;
		this.decouvert = decouvert;
	}

	
	/** Ajoute un montant au solde
	 * @param montant
	 */
	public void ajouterMontant(double montant){
		this.solde += montant;
	}
	
	/** Ajoute un montant au solde
	 * @param montant
	 */
	public void debiterMontant(double montant){
		if (type.equals("compteCourant")){
			if (this.solde - montant > decouvert){
				this.solde = solde - montant;
			}	
		}
		else if (type.equals("livretA")){
			if (this.solde - montant > 0){
				this.solde = solde - montant;
			}	
		}
	}
	
	/** Getter for solde
	 * @return le solde
	 */
	public double getSolde() {
		return solde;
	}
	
	/** Setter
	 * @param solde the solde to set
	 */
	public void setSolde(double solde) {
		this.solde = solde;
	}
	/** Getter for decouvert
	 * @return le decouvert
	 */
	public double getDecouvert() {
		return decouvert;
	}
	/** Setter
	 * @param decouvert le decouvert to set
	 */
	public void setDecouvert(double decouvert) {
		this.decouvert = decouvert;
	}

	/** Getter for type
	 * @return le type
	 */
	public String getType() {
		return type;
	}
	/** Setter
	 * @param type le type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
}
