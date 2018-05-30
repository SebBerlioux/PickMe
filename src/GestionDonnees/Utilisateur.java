package GestionDonnees;

import entree_sortie.*;
import java.util.ArrayList;
import java.io.Serializable;

public class Utilisateur implements Serializable {
	
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
	protected ArrayList<Voyage> creationVoyage = new ArrayList<Voyage>(); //liste interm�diaire utilis�e lors de la cr�ation d'un voyage
	protected ArrayList<Voyage> listeVoyages;


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
		this.listeVoyages = new ArrayList<Voyage>();
	}
	
	/*public void newUtilisateur(Utilisateur user) {
		System.out.println("Nouvel utilisateur cr��: ");
		//enregistrerNewUser(user);     partie de romain 
	}*/
	
	public void getUtilisateur() {
		System.out.println(this.nom + " " + this.prenom);
		System.out.println("tel: " + this.tel);
		System.out.println("email: " + this.email);
		System.out.println("type v�hicule: " + this.typeVehicule);
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
	
	public String getComportementAuVolant() {
		return this.comportementAuVolant;
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
	
	public void supprimerListeNoire(Utilisateur user) {
		for(int i=0; i<this.listeNoire.size(); i++) {
			if(listeNoire.get(i).equals(user)) {
				listeNoire.remove(i);
			}
		}
	}
	
	public void ecrireListeNoire(ArrayList<Utilisateur> listeUser) {
		ArrayList<Utilisateur> bdd = new ArrayList<Utilisateur>(); //liste des utilisateurs pr�sents dans la base de donn�es
		
		//on lit la base de donn�es et on supprime de la bdd l'utilisateur que a �t� modifi�
		LectureFichier lecture = new LectureFichier();
		bdd = lecture.readUser("users.txt");
		for(int i=0; i<bdd.size(); i++){
			if(bdd.get(i).equals(this)) {
				bdd.remove(i);
			}
		}
		
		//on �crit le user (avec sa nouvelle liste noire) dans la bdd (en �crasant ce qu'il y a dedans)
		EcritureFichier ecriture = new EcritureFichier();
		ecriture.overWriteUser(this);

		// puis on ajoute au fichier "users.txt" les utilisateurs qui n'ont pas �t� modifi�s
		for(int i=0; i<bdd.size(); i++){
			ecriture.writeUser(bdd.get(i));
		}
	}
	
	public void ajoutSignalement(Utilisateur user) {
		user.nbSignalement = user.nbSignalement+1;
	}
	
	public void supprimerSignalement(Utilisateur user) {
		user.nbSignalement = user.nbSignalement-1;
	}
	
	public void ecrireSignalement(Utilisateur user) {
		ArrayList<Utilisateur> bdd = new ArrayList<Utilisateur>(); //liste des utilisateurs pr�sents dans la base de donn�es
		
		//on lit la base de donn�es et on supprime dans la bdd l'utilisateur que l'on va modifier
		LectureFichier lecture = new LectureFichier();
		bdd = lecture.readUser("users.txt");
		for(int i=0; i<bdd.size(); i++){
			if(bdd.get(i).equals(user)) {
				bdd.remove(i);
			}
		}
		
		//on �crit le user (avec son nouveau nombre de signalements) dans la bdd (en �crasant ce qu'il y a dedans)
		EcritureFichier ecriture = new EcritureFichier();
		ecriture.overWriteUser(user);
		
		// puis on ajoute au fichier "users.txt" les utilisateurs qui n'ont pas �t� modifi�s
		for(int i=0; i<bdd.size(); i++){
			ecriture.writeUser(bdd.get(i));
		}
	}
	
	 public String toString(){
		    return "Nom: " + this.nom + ", " + "Prenom: " + this.prenom + ", " + "Tel: " + this.tel + ", " + "Email: " + this.email + ", " + "Mdp: " + this.mdp + ", " + "Type de v�hicule: " + this.typeVehicule + ", " + "Type de conduite: " + this.typeConduite + ", " + "Comportement au volant: " + this.comportementAuVolant + ", " + "Liste noire: " + this.listeNoire + ", " + "Nombre de signalements: " + this.nbSignalement + "\n";
		  }
	 
	public ArrayList<Voyage> rechercherTrajet(String villeD, String villeA, String date){
		LectureFichier lecture = new LectureFichier();
		ArrayList<Voyage> bdd = new ArrayList<Voyage>();
		ArrayList<Voyage> res = new ArrayList<Voyage>();
		
		bdd = lecture.readTrip("trips.txt");
		
		for(int i=0; i<bdd.size(); i++){

			if(bdd.get(i).getDate().equals(date) && bdd.get(i).getDepart().equals(villeD) && bdd.get(i).getArrivee().equals(villeA)) {
				res.add(bdd.get(i));
			}
		}
		return res;
	}
	
	
	public void annulerVoyage(Voyage voyage) {
		ArrayList<Voyage> bdd = new ArrayList<Voyage>(); //liste des voyages pr�sents dans la base de donn�es
		
		//on lit la base de donn�es et on supprime dans la bdd le voyage que l'on va annuler
		LectureFichier lecture = new LectureFichier();
		bdd = lecture.readTrip("trips.txt");
		for(int i=0; i<bdd.size(); i++){
			if(bdd.get(i).equals(voyage)) {
				bdd.remove(i);
			}
		}
		
		//on �crit le voyage (avec son �tat "Annul�") dans la bdd (en �crasant ce qu'il y a dedans)
		EcritureFichier ecriture = new EcritureFichier();
		ecriture.overWriteTrip(voyage);
		
		// puis on ajoute au fichier "trips.txt" les voyages qui n'ont pas �t� modifi�s
		for(int i=0; i<bdd.size(); i++){
			ecriture.writeTrip(bdd.get(i));
		}
	}
	
	public void annulerReservation(Voyage voyage) {
		ArrayList<Voyage> bdd = new ArrayList<Voyage>(); //liste des voyages pr�sents dans la base de donn�es
		
		//on lit la base de donn�es et on supprime dans la bdd le voyage que l'on va modifier
		LectureFichier lecture = new LectureFichier();
		bdd = lecture.readTrip("trips.txt");

		for(int i=0; i<bdd.size(); i++){
			if(bdd.get(i).equals(voyage)) {
				bdd.remove(i);
			}
		}
		
		//on enl�ve le passager du voyage, on �crit le nouveau voyage dans la bdd (en �crasant ce qu'il y a dedans)
		voyage.removePassager(this);
		EcritureFichier ecriture = new EcritureFichier();
		ecriture.overWriteTrip(voyage);
		
		// puis on ajoute au fichier "trips.txt" les voyages qui n'ont pas �t� modifi�s
		for(int i=0; i<bdd.size(); i++){
			ecriture.writeTrip(bdd.get(i));
		}
	}
	
	public void creerVoyage(String villeD, String date, String heureD, Integer nbPlace) {
		//on vide la pile utilis�e pour la cr�ation de voyage
		creationVoyage.clear();
		
		Etape etape1 = new Etape();
		etape1.villeD = villeD;
		etape1.villeA = "1�re �tape";
		etape1.heureDepart = heureD;
		etape1.nbPlace = nbPlace;
		etape1.passagers = new ArrayList<Utilisateur>();
		
		Voyage voyage = new Voyage();
		voyage.date = date;
		voyage.conducteur = this;
		voyage.prix = 0;
		voyage.etat = "A venir";
		
		ArrayList<Etape> trajet = new ArrayList<Etape>();
		trajet.add(etape1);
		voyage.trajet = trajet;
		
		System.out.println(voyage);
		
		this.creationVoyage.add(voyage);
	}
	
	
	public void ajouterEtape(String villeEtape, String heureA, String lieuRdv, Integer prix) {
		Voyage voyage = this.creationVoyage.get(0);
		this.creationVoyage.clear();
		ArrayList<Etape> trajet = voyage.getTrajet();
		int taille = trajet.size();
		for(int i=0; i<taille; i++) {
			if(trajet.get(i).getVilleA().equals("1�re �tape")) {
				trajet.get(i).villeA = villeEtape;
				trajet.get(i).heureArriveeVilleA = heureA;
				trajet.get(i).lieuRdv = lieuRdv;
				trajet.get(i).prix = prix;
			}
			else {
				Etape etape = new Etape(trajet.get(i).getVilleA(), villeEtape, prix, trajet.get(i).nbPlace, lieuRdv, trajet.get(i).heureArriveeVilleA, heureA);
				trajet.add(etape);
			}
			voyage.prix = voyage.prix + trajet.get(i).prix;
		}
		voyage.trajet = trajet;
		this.creationVoyage.add(voyage);
	}
	
	public void ecrireVoyage() {
		EcritureFichier ecriture = new EcritureFichier();
		Voyage voyage = new Voyage();
		voyage = creationVoyage.get(0);
		ecriture.writeTrip(voyage);
		ecrireVoyageUser(voyage);
	}
	
	public void ecrireVoyageUser(Voyage voyage) {
		ArrayList<Utilisateur> bdd = new ArrayList<Utilisateur>(); //liste des utilisateurs pr�sents dans la base de donn�es
		
		//on lit la base de donn�es et on supprime dans la bdd l'utilisateur que l'on va modifier
		LectureFichier lecture = new LectureFichier();
		bdd = lecture.readUser("users.txt");
		for(int i=0; i<bdd.size(); i++){
			if(bdd.get(i).equals(this)) {
				bdd.remove(i);
			}
		}
		
		//on ajoute � l'utilisateur un voyage dans la bdd (en �crasant ce qu'il y a dedans)
		this.listeVoyages.add(voyage);
		EcritureFichier ecriture = new EcritureFichier();
		ecriture.overWriteUser(this);
		
		// puis on ajoute au fichier "users.txt" les utilisateurs qui n'ont pas �t� modifi�s
		for(int i=0; i<bdd.size(); i++){
			ecriture.writeUser(bdd.get(i));
		}
	}
	
	public ArrayList<String> resumeVoyage() {
		Voyage voyage = creationVoyage.get(0);
		ArrayList<String> res = new ArrayList<String>();
		res.add(voyage.getDate());
		res.add(voyage.getDepart());
		res.add(voyage.getArrivee());
		ArrayList<Etape> trajet = voyage.getTrajet();
		for(int i=0; i<trajet.size(); i++) {
			res.add(trajet.get(i).getVilleD());
			res.add(trajet.get(i).getHeureDepart());
			res.add(trajet.get(i).getLieuRdv());
			res.add(Integer.toString(trajet.get(i).getPrix()));
			res.add(Integer.toString(trajet.get(i).getNbPlace()));
		}
		res.add(Integer.toString(voyage.getPrixTotal()));
		
		res.add(this.nom);
		res.add(this.prenom);
		res.add(this.typeVehicule);
		res.add(this.typeConduite);
		res.add(this.comportementAuVolant);
		
		return res;
	}
	
	public ArrayList<String> afficherDetailsVoyage(Voyage voyage){
		ArrayList<String> res = new ArrayList<String>();
		if(this == voyage.conducteur) { // si l'utilisateur est le conducteur du voyage
			ArrayList<Etape> trajet = voyage.getTrajet();
			ArrayList<Utilisateur> listePassagers = voyage.getPassagers();
			for(int i=0; i<listePassagers.size(); i++) {
				res.add(listePassagers.get(i).getNom());
				res.add(listePassagers.get(i).getPrenom());
				res.add(listePassagers.get(i).getTel());
			}
			
			for(int i=0; i<trajet.size(); i++) {
					for(int j=0; j<trajet.get(i).getPassagers().size(); j++) {
						for(int k=0; k<listePassagers.size(); k++) {
							if(trajet.get(i).getPassagers().get(j).equals(listePassagers.get(k))){
								res.add(trajet.get(i).getVilleD());
								res.add(trajet.get(i).getHeureDepart());
								res.add(trajet.get(i).getVilleA());
								res.add(trajet.get(i).getHeureArrivee());
							}
						}
					}
			}
		}
		
		else { // si l'utilisateur est un passager du voyage
			ArrayList<Etape> trajet = voyage.getTrajet();
			res.add(trajet.get(0).getHeureDepart());
			for(int i=0; i<trajet.size(); i++) {
				res.add(trajet.get(i).getVilleD());
				res.add(trajet.get(i).getHeureDepart());
				res.add(Integer.toString(trajet.get(i).getPrix()));
			}
			res.add(trajet.get(trajet.size()-1).getHeureArrivee());
			res.add(Integer.toString(voyage.getPrixTotal()));
			res.add(voyage.getConducteur().getNom());
			res.add(voyage.getConducteur().getPrenom());
			res.add(voyage.getConducteur().getTel());
			res.add(voyage.getConducteur().getTypeVehicule());
			res.add(voyage.getConducteur().getTypeConduite());
			res.add(voyage.getConducteur().getComportementAuVolant());
		}
		
		return res;
	}

	
	public ArrayList<String> mesVoyages(){
		ArrayList<String> res = new ArrayList<String>();
		ArrayList<Voyage> listeVoyages = this.creationVoyage;
		System.out.println(creationVoyage);
		for(int i=0; i<listeVoyages.size(); i++) {
			res.add(listeVoyages.get(i).getDepart());
			res.add(listeVoyages.get(i).getArrivee());
			res.add(listeVoyages.get(i).getDate());
			res.add(listeVoyages.get(i).getConducteur().getNom());
			res.add(listeVoyages.get(i).getConducteur().getPrenom());
			res.add(Integer.toString(listeVoyages.get(i).getPrixTotal()));
			res.add(listeVoyages.get(i).getEtat());
		}
		return res;
	}
	
	public void reserver(Voyage voyage, String villeD, String villeA) {
		
		ArrayList<Voyage> bdd = new ArrayList<Voyage>(); //liste des voyages pr�sents dans la base de donn�es
		Voyage res = new Voyage(); //voyage � mettre � jour
		Etape etapeDepart = new Etape();
		Etape etapeArrivee = new Etape();
		
		//on lit la base de donn�es et on r�cup�re le voyage concern�, en le supprimant de la BDD
		LectureFichier lecture = new LectureFichier();
		bdd = lecture.readTrip("trips.txt");
		for(int i=0; i<bdd.size(); i++){
			if(bdd.get(i).equals(voyage)) {
				res = bdd.get(i);
				bdd.remove(i);
			}
		}
		
		//on ajoute le passager au trajet sur la ou les bonne(s) �tape(s)
		etapeDepart = res.getEtapesDA(villeD, villeA).get(0);
		etapeArrivee = res.getEtapesDA(villeD, villeA).get(1);
		res.addPassager(this, etapeDepart, etapeArrivee);
		
		// on �crit le voyage modifi� dans le "trips.txt" (en �crasant tout ce qu'il y avait)
		EcritureFichier ecriture = new EcritureFichier();
		ecriture.overWriteTrip(res);
		
		// on ajoute le voyage � la liste des voyages
		listeVoyages.add(res);
		
		// puis on ajoute au fichier "trips.txt" les voyages qui n'ont pas �t� modifi�s
		for(int i=0; i<bdd.size(); i++){
			ecriture.writeTrip(bdd.get(i));
		}
	}
	
	@Override
	public boolean equals(Object o){
		Utilisateur user = (Utilisateur)o;
		/* Les utilisateurs ont une adresse mail et un num�ro de t�l�phone uniques,
		 * donc on les identifie par l'un ou l'autre.
		 */
		if(this.tel.equals(user.getTel()) ||
				this.email.equals(user.getEmail()))
			return true;
		else {
			return false;
		}
	}
}
