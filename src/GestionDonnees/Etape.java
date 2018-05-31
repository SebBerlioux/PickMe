package GestionDonnees;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * @author S�bastien & Romain
 *
 * Class Etape permettant de cr�er une �tape du voyage entre deux villes
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
	
	public Etape() {} //constructeur par d�faut
	
	/**
	 * @param villeD 
	 * 			ville d�part de l'�tape
	 * @param villeA 
	 * 			ville arriv�e de l'�tape
	 * @param prix
	 * 			prix de l'�tape
	 * @param nbPlace
	 * 			nombre de place disponible sur l'�tat
	 * @param lieuRdv
	 * 			lieu de rendez-vous
	 * @param heureDepart
	 * 			heure de d�part du voyage
	 * @param heureArriveeVilleA
	 * 			heure d'arriv�e estim�e
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
	 * ajoute un passager � la liste de passager du voyage
	 */
	public void addPassager(Utilisateur user) {
		this.passagers.add(user);
	}
	
	public String toString(){
	    return "[Ville de d�part: " + this.villeD + ", " + "Ville d'arriv�e: " + this.villeA + ", " + "Prix: " + this.prix + ", " + "Nombre de places: " + this.nbPlace + ", " + "Lieu de rendez-vous: " + this.lieuRdv + ", " + "Heure de d�part: " + this.heureDepart + ", " + "Heure d'arriv�e: " + this.heureArriveeVilleA + ", " + "Passagers: " + this.passagers + "]";
	  }
	
	@Override
	public boolean equals(Object o){
		Etape etape = (Etape)o;
		// Une �tape est identifi�e par sa ville de d�part et sa ville d'arriv�e
		if(this.villeD.equals(etape.getVilleD()) &&
				this.villeA.equals(etape.getVilleA()))
			return true;
		else {
			return false;
		}
	}
}
