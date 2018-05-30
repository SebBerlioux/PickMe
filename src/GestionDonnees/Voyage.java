package GestionDonnees;

import java.util.ArrayList;
import java.io.Serializable;

public class Voyage implements Serializable {
	
	private String date;
	private Integer prix;
	private ArrayList<Etape> trajet;
	private Utilisateur conducteur;
	
	public Voyage() {} //constructeur par d�faut
	
	public Voyage(String date, ArrayList<Etape> trajet, Utilisateur conducteur) {
		this.date = date;
		this.trajet = trajet;
		this.conducteur = conducteur;
		this.prix = 0;
	}
	
	public void getVoyage() {
		System.out.println("Voyage du " + this.date + " :");
		System.out.println("De " + this.trajet.get(0).villeD + " vers " + this.trajet.get(this.trajet.size()-1).villeA);
		System.out.println("Prix: " + getPrixTotal() + "�");
	}
	
	public String getDepart() {
		return this.trajet.get(0).villeD;
	}
	
	public String getArrivee() {
		//System.out.println(this.trajet.get(trajet.size()-1).villeA);
		return this.trajet.get(trajet.size()-1).villeA;
	}
	
	public String getDate() {
		return this.date;
	}
	
	public ArrayList<Etape> getTrajet(){
		return this.trajet;
	}
	
	public Utilisateur getConducteur() {
		return this.conducteur;
	}
	
	public Integer getPrix() {
		return this.prix;
	}
	
	public Integer getPrixTotal() {
		for(Etape etape : this.trajet) {
			this.prix = this.prix + etape.prix;
		}
		return this.prix;
	}
	
	public Integer getPrixEtape(Etape etape) {
		return etape.prix;
	}
	
	public Integer getPrix(String villeD, String villeA) {
		Integer res = 0;
		Etape tmp = this.trajet.get(0);
		int i = 0;
		while(tmp.villeD != villeD) {
			i++;
			tmp = this.trajet.get(i);
		}
		// ici on est � la villeD
		// on fais la somme des prix des etapes jusqu'� la villeA
		do{
			res += tmp.prix;
			tmp = this.trajet.get(i);
			i++;
		}while(tmp.villeA != villeA);
		System.out.println(res);
		return res;
	}
	
	public Integer getNbPlacesTotales() {
		Integer res = 0;
		for(Etape etape : this.trajet) {
			res = res + etape.nbPlace;
		}
		return res;
	}
	
	
	/*
	 * Ajoute un passager sur toutes les �tapes de son trajet.
	 * On fournit en param�tre l'utilisateur ainsi que son �tape de d�part et d'arriv�e
	 */
	public void addPassager(Utilisateur user, Etape etapeDepart, Etape etapeArrivee) {
		int i = 0;
		Etape tmp = this.trajet.get(i);
		while(tmp != etapeDepart) {
			i++;
			tmp = this.trajet.get(i);
		}
		
		// ici tmp == etapeDepart
		
		boolean placeDispo = true;
		Etape tmp2 = tmp;
		int j = i;
		// on regarde sur tout le trajet demand� s'il reste de la place � chaque �tape
		
		if(etapeDepart != etapeArrivee) { // cas o� il y a plusieurs �tapes
			while((tmp != etapeArrivee) && placeDispo) {
				if(tmp.nbPlace == 0) { // si une etape du trajet est pleine, on ne peut pas reserver
					placeDispo = false;
				}else {
					i++;
					tmp = this.trajet.get(i);
				}
			}
		}else { // cas o� il n'y a qu'une seule �tape
			if(tmp.nbPlace == 0) {
				placeDispo = false;
			}
		}
		
		// ici on sait si le client peut reserver son trajet ou pas
		if(placeDispo) {
			if(etapeDepart != etapeArrivee) {
				while(tmp2 != etapeArrivee) {
					tmp2.addPassager(user);
					tmp2.nbPlace--;
					j++;
					tmp2 = this.trajet.get(j);
				}
				// enfin il faut aussi ajouter le passager sur la derni�re �tape du trajet
				tmp2.addPassager(user);
				tmp2.nbPlace--;
			}else {
				tmp2.addPassager(user);
				tmp2.nbPlace--;
			}
				
			System.out.println("Place r�serv�e !");
		}else {
			System.out.println("D�sol�, il n'y a plus de place disponible sur le trajet demand� !");
		}
	}
	
	/*
	 * supprime un utilisateur de tous les trajets
	 */
	public void removePassager(Utilisateur user) {
		for(int i = 0; i<this.trajet.size(); i++) {
			Utilisateur tmp;
			for(int j = 0; j<this.trajet.get(i).passagers.size(); j++) {
				tmp = this.trajet.get(i).passagers.get(j);
				if(tmp == user) {
					System.out.println("Utilisateur " + this.trajet.get(i).passagers.get(j).getNom() + " a �t� supprim� du voyage !");
					this.trajet.get(i).passagers.remove(j);
					this.trajet.get(i).nbPlace++;
				}
			}
		}
	}
	
	// Affiche les passagers d'un voyage
	public void getPassagers() {
		for(int i = 0; i<this.trajet.size(); i++) {
			for(int j = 0; j<this.trajet.get(i).passagers.size(); j++) {
				System.out.println(this.trajet.get(i).passagers.get(j).getNom());
			}
		}
	}
	
	public String getEtapeDepart(Etape etape) {
		return etape.getVilleD();
	}
	
	public String getEtapeArrivee(Etape etape) {
		return etape.getVilleA();
	}
	
	public ArrayList<Etape> getEtapesDA(String villeD, String villeA){
		ArrayList<Etape> listeEtapes = new ArrayList<Etape>();
		int i = 0;
		Etape tmp = this.trajet.get(i);
		
		while(!tmp.getVilleD().equals(villeD)) {
			i++;
			tmp = this.trajet.get(i);
		}
		// ici on est � la villeD
		// on ajoute l'�tape dans la liste
		listeEtapes.add(tmp);
		while(!tmp.getVilleA().equals(villeA)) {
			tmp = this.trajet.get(i);
			i++;
		}
		// ici on est � la villeA
		// on ajoute l'�tape dans la liste
		// il se peut qu'on ajoute 2 fois la m�me �tape dans la liste si le trajet contient qu'une seule �tape
		listeEtapes.add(tmp);
		return listeEtapes;
	}
	
	public String toString(){
	    return "Date: " + this.date + "\n" + "Trajet: " + this.trajet + "\n" + "Conducteur: " + this.conducteur + "Prix: " + this.prix + "\n" ;
	  }
	
	@Override
	public boolean equals(Object o){
		Voyage trip = (Voyage)o;
		
		if(this.date.equals(trip.getDate()) &&
				this.trajet.equals(trip.getTrajet()) &&
				this.conducteur.equals(trip.getConducteur()) &&
				this.prix.equals(trip.getPrix()))
			return true;
		else {
			return false;
		}
	}

}
