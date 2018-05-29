package entree_sortie;

import java.util.ArrayList;
import java.io.Serializable;

public class Utilisateur implements Serializable{
	
	private String nom;
	private String prenom;
	private String tel;
	private String email;
	private String mdp;
	private String typeVehicule;
	private String typeConduite;
	private String comportementAuVolant;
	private ArrayList<Utilisateur> listeNoire;
	private Integer nbSignalement;


	public Utilisateur(String nom, String prenom, String tel, String email, String mdp, String typeVehicule, String typeConduite, String comportementAuVolant) {
		this.nom = nom;
		this.prenom = prenom;
		this.tel = tel;
		this.email = email;
		this.mdp = mdp;
		this.typeVehicule = typeVehicule;
		this.typeConduite = typeConduite;
		this.comportementAuVolant = comportementAuVolant;
		this.listeNoire = new ArrayList<Utilisateur>();
		this.nbSignalement = 0;
	}
	
	  public String toString(){
		    return "Nom: " + this.nom + "\n" + "Prenom: " + this.prenom + "\n" + "Tel: " + this.tel + "\n" + "Email: " + this.email + "\n" + "Mdp: " + this.mdp + "\n" + "Type de véhicule: " + this.typeVehicule + "\n" + "Type de conduite: " + this.typeConduite + "\n" + "Comportement au volant: " + this.comportementAuVolant + "\n" + "Liste noire: " + this.listeNoire + "\n" + "Nombre de signalements: " + this.nbSignalement + "\n";
		  } 
}