package ex3;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

	
	/** Nom du zoo*/
	private String nom;
	
	/** Liste des types d'animaux*/
	private List<String> types;
	
	/** Liste des noms d'animaux*/
	private List<String> noms;
	
	/** Liste des comportements d'animaux*/
	private List<String> comportements;
	
	
	/**
	 * Constructeur de zoo
	 * 
	 * @param nom
	 *	Création des listes pour types, noms et comportements des animaux
	 */
	public Zoo(String nom){
		this.nom = nom;
		this.types=new ArrayList<String>();
		this.noms=new ArrayList<String>();
		this.comportements=new ArrayList<String>();
		
	}
	
	
	/**
	 * Ajouter un animal
	 * 
	 * @param nomAnimal
	 * @param typeAnimal
	 * @param comportement
	 *
	 */
	public void addAnimal(String nomAnimal, String typeAnimal, String comportement){
		types.add(typeAnimal);
		noms.add(nomAnimal);
		comportements.add(comportement);
	}
	
	
	
	/**
	 * Afficher la liste des animaux stockés dans la liste type
	 * 
	 */
	public void afficherListeAnimaux(){
		for (int i=0; i<types.size(); i++) {
			System.out.println(noms.get(i)+" "+types.get(i)+" "+comportements.get(i));
		}
	}
	
	
	
	/**
	 * Retourne la taille de la liste type
	 * @return le types.size
	 */
	public int taille() {
		return types.size();
	}

	/** Getter for nom
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/** Setter
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
}
