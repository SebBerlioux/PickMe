package GestionDonnees;

import java.util.ArrayList;

public class Utilisateur {
	
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
	
	/*public void newUtilisateur(Utilisateur user) {
		System.out.println("Nouvel utilisateur créé: ");
		//enregistrerNewUser(user);     partie de romain 
	}*/
	
	public void getUtilisateur() {
		System.out.println(this.nom + " " + this.prenom);
		System.out.println("tel: " + this.tel);
		System.out.println("email: " + this.email);
		System.out.println("type véhicule: " + this.typeVehicule);
		System.out.println("type conduite: " + this.typeConduite);
		System.out.println("comportement au volant: " + this.comportementAuVolant);
		System.out.println("nombre de signalement: " + this.nbSignalement);
	} 
	
	public String getNom() {
		//System.out.println(this.nom);
		return this.nom;
	}
	
	public String getPrenom() {
		return this.prenom;
	}
	
	public String getTel() {
		return this.tel;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public String getMdp() {
		return this.mdp;
	}
	
	public String getTypeVehicule() {
		return this.typeVehicule;
	}
	
	public String getTypeConduite() {
		return this.typeConduite;
	}
	
	public ArrayList<Utilisateur> getListeNoire() {
		return this.listeNoire;
	}
	
	public Integer getNbSignalement() {
		return this.nbSignalement;
	}
	
	public void ajoutListeNoire(Utilisateur user) {
		this.listeNoire.add(user);
	}
	
	public void ajoutSignalement() {
		this.nbSignalement = this.nbSignalement+1;
	}
	
}
