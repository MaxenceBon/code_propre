package ex1;

import java.util.Date;

/**Classe qui permet de renseigner le siret, le nom, l'adresse et la date de création d'une entreprise
 * @author Maxence
 *
 */
public class Entreprise {

	
	/**
	 * @param siret entier
	 * @param nom string
	 * @param adresse string
	 * @param dateCreation date
	 * @param CAPITAL_Max entier final
	 */	
	private int siret;
	private String nom;
	private String adresse;
	private Date dateCreation;
	
	public static final int CAPITAL_MAX = 3000000;
	
	
	/**Permet d'afficher le statut de l'entreprise
	 */	
	public void afficherStatut(){
		
	}

	/** Getter pour siret
	 * @return the siret
	 */
	public int getSiret() {
		return siret;
	}

	/** Setter pour siret
	 * @param siret the siret to set
	 */
	public void setSiret(int siret) {
		this.siret = siret;
	}

	/** Getter pour nom
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/** Setter pour nom
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/** Getter pour adresse
	 * @return the adresse
	 */
	public String getAdresse() {
		return adresse;
	}

	/** Setter pour adresse
	 * @param adresse the adresse to set
	 */
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	/** Getter pour dateCreation
	 * @return the dateCreation
	 */
	public Date getDateCreation() {
		return dateCreation;
	}

	/** Setter pour dateCreation
	 * @param dateCreation the dateCreation to set
	 */
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	/** Getter pour capitalMax
	 * @return the capitalMax
	 */
	public static int getCapitalMax() {
		return CAPITAL_MAX;
	}
	
	
	
}
