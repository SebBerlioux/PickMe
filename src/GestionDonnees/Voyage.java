package GestionDonnees;

import java.util.ArrayList;

public class Voyage {
	
	private String date;
	private Integer prix;
	private ArrayList<Etape> trajet;
	private Utilisateur conducteur;

	public Voyage(String date, ArrayList<Etape> trajet, Utilisateur conducteur) {
		this.date = date;
		this.trajet = trajet;
		this.conducteur = conducteur;
		this.prix = 0;
	}
	
	public void getVoyage() {
		System.out.println("Voyage du " + this.date + " :");
		System.out.println("De " + this.trajet.get(0).villeD + " vers " + this.trajet.get(this.trajet.size()-1).villeA);
		System.out.println("Prix: " + getPrixTotal() + "€");
	}
	
	public String getDepart() {
		return this.trajet.get(0).villeD;
	}
	
	public String getArrivee() {
		System.out.println(this.trajet.get(trajet.size()-1).villeA);
		return this.trajet.get(trajet.size()-1).villeA;
	}
	
	public String getDate() {
		return this.date;
	}
	
	public Utilisateur getConducteur() {
		return this.conducteur;
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
		// ici on est à la villeD
		// on fais la somme des prix des etapes jusqu'à la villeA
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
	 * Ajoute un passager sur toutes les étapes de son trajet.
	 * On fournit en paramètre l'utilisateur ainsi que son étape de départ et d'arrivée
	 */
	public void addPassager(Utilisateur user, Etape etapeDepart, Etape etapeArrivee) {
		int i = 0;
		Etape tmp = this.trajet.get(0);
		while(tmp != etapeDepart) {
			i++;
			tmp = this.trajet.get(i);
		}
		
		// ici tmp == etapeDepart
		
		boolean placeDispo = true;
		Etape tmp2 = tmp;
		int j = i;
		// on regarde sur tout le trajet demandé s'il reste de la place à chaque étape
		
		if(etapeDepart != etapeArrivee) { // cas où il y a plusieurs étapes
			while((tmp != etapeArrivee) && placeDispo) {
				if(tmp.nbPlace == 0) { // si une etape du trajet est pleine, on ne peut pas reserver
					placeDispo = false;
				}else {
					i++;
					tmp = this.trajet.get(i);
				}
			}
		}else { // cas où il n'y a qu'une seule étape
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
			}else {
				tmp2.addPassager(user);
				tmp2.nbPlace--;
			}
				
			System.out.println("Place réservée !");
		}else {
			System.out.println("Désolé, il n'y a plus de place disponible sur le trajet demandé !");
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
					System.out.println("Utilisateur " + this.trajet.get(i).passagers.get(j).getNom() + " a été supprimé du voyage !");
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
}
