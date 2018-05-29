package GestionDonnees;

import java.io.Serializable;
import java.util.ArrayList;

public class Etape implements Serializable{

	protected String villeD;
	protected String villeA;
	protected Integer prix;
	protected Integer nbPlace;
	protected String lieuRdv;
	protected String heureDepart;
	protected String heureArriveeVilleA;
	protected ArrayList<Utilisateur> passagers;
	
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
	
	public String getHeureDepart() {
		return this.heureDepart;
	}
	
	public String getHeureArrivee() {
		return this.heureArriveeVilleA;
	}
	
	public void addPassager(Utilisateur user) {
		this.passagers.add(user);
	}
	
	public String toString(){
	    return "Ville de départ: " + this.villeD + "\n" + "Ville d'arrivée: " + this.villeA + "\n" + "Prix: " + this.prix + "\n" + "Nombre de places: " + this.nbPlace + "\n" + "Lieu de rendez-vous: " + this.lieuRdv + "\n" + "Heure de départ: " + this.heureDepart + "\n" + "Heure d'arrivée: " + this.heureArriveeVilleA + "\n" + "Passagers: " + this.passagers + "\n";
	  } 
}
