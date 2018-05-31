package GestionDonnees;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * @author Sébastien & Romain
 *
 * Class Etape permettant de créer une étape du voyage entre deux villes
 */
public class Etape implements Serializable{

	protected String villeD;
	protected String villeA;
	protected Integer prix;
	protected Integer nbPlace;
	protected String lieuRdv;
	protected String heureDepart;
	protected String heureArriveeVilleA;
	protected ArrayList<Utilisateur> passagers;
	
	public Etape() {} //constructeur par défaut
	
	/**
	 * @param villeD 
	 * 			ville départ de l'étape
	 * @param villeA 
	 * 			ville arrivée de l'étape
	 * @param prix
	 * 			prix de l'étape
	 * @param nbPlace
	 * 			nombre de place disponible sur l'état
	 * @param lieuRdv
	 * 			lieu de rendez-vous
	 * @param heureDepart
	 * 			heure de départ du voyage
	 * @param heureArriveeVilleA
	 * 			heure d'arrivée estimée
	 */
	public Etape(String villeD, String villeA, Integer prix, Integer nbPlace, String lieuRdv, String heureDepart, String heureArriveeVilleA) {
		this.villeD = villeD;
		this.villeA = villeA;
		this.prix = prix;
		this.nbPlace = nbPlace;
		this.lieuRdv = lieuRdv;
		this.heureDepart = heureDepart;
		this.heureArriveeVilleA = heureArriveeVilleA;
		this.passagers = new ArrayList<Utilisateur>();
	}
	
	public Integer getNbPlace() {
		return this.nbPlace;
	}
	
	public String getVilleD() {
		return this.villeD;
	}
	
	public String getVilleA() {
		return this.villeA;
	}
	
	public Integer getPrix() {
		return this.prix;
	}
	
	public String getLieuRdv() {
		return this.lieuRdv;
	}
	
	public String getHeureDepart() {
		return this.heureDepart;
	}
	
	public String getHeureArrivee() {
		return this.heureArriveeVilleA;
	}
	
	public ArrayList<Utilisateur> getPassagers(){
		return this.passagers;
	}
	
	/**
	 * @param user
	 * 
	 * ajoute un passager à la liste de passager du voyage
	 */
	public void addPassager(Utilisateur user) {
		this.passagers.add(user);
	}
	
	public String toString(){
	    return "[Ville de départ: " + this.villeD + ", " + "Ville d'arrivée: " + this.villeA + ", " + "Prix: " + this.prix + ", " + "Nombre de places: " + this.nbPlace + ", " + "Lieu de rendez-vous: " + this.lieuRdv + ", " + "Heure de départ: " + this.heureDepart + ", " + "Heure d'arrivée: " + this.heureArriveeVilleA + ", " + "Passagers: " + this.passagers + "]";
	  }
	
	@Override
	public boolean equals(Object o){
		Etape etape = (Etape)o;
		// Une étape est identifiée par sa ville de départ et sa ville d'arrivée
		if(this.villeD.equals(etape.getVilleD()) &&
				this.villeA.equals(etape.getVilleA()))
			return true;
		else {
			return false;
		}
	}
}
