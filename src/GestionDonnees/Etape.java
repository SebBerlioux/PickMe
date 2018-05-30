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
	
	public Etape() {} //constructeur par défaut
	
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
	
	public void addPassager(Utilisateur user) {
		this.passagers.add(user);
	}
	
	public String toString(){
	    return "Ville de départ: " + this.villeD + ", " + "Ville d'arrivée: " + this.villeA + ", " + "Prix: " + this.prix + ", " + "Nombre de places: " + this.nbPlace + ", " + "Lieu de rendez-vous: " + this.lieuRdv + ", " + "Heure de départ: " + this.heureDepart + ", " + "Heure d'arrivée: " + this.heureArriveeVilleA + ", " + "Passagers: " + this.passagers;
	  }
	
	@Override
	public boolean equals(Object o){
		Etape etape = (Etape)o;
		
		if(this.villeD.equals(etape.getVilleD()) &&
				this.villeA.equals(etape.getVilleA()) &&
				this.prix.equals(etape.getPrix()) &&
				this.nbPlace.equals(etape.getNbPlace()) && 
				this.lieuRdv.equals(etape.getLieuRdv()) &&
				this.heureDepart.equals(etape.getHeureDepart()) &&
				this.heureArriveeVilleA.equals(etape.getHeureArrivee()) &&
				this.passagers.equals(etape.getPassagers()))
			return true;
		else {
			return false;
		}
	}
}
