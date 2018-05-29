package GestionDonnees;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		Utilisateur user1 = new Utilisateur("Obama","Barack","0645231240", "barack@gmail.com","mdp","voiture","calme","concentré");
		Utilisateur user2 = new Utilisateur("Staline","Joseph","05482301502", "satline@gmail.com","fbb","voiture","calme","concentré");

		Etape etape1 = new Etape("Tours","Angers", 6, 1, "placeA", "18h", "20h");
		Etape etape2 = new Etape("Angers","Nantes", 6, 1, "placeA", "18h", "20h");

		ArrayList<Etape> trajet = new ArrayList<Etape>();
		trajet.add(etape1);
		trajet.add(etape2);
		Voyage trip1 = new Voyage("15/06/2018",trajet,user1);
		
		//trip1.addPassager(user2, etape1, etape2);
		//trip1.getPassagers();
		//trip1.removePassager(user2);
		
		//user1.getUtilisateur();
		
		//trip1.getVoyage();
		
		trip1.getPrix("Angers", "Nantes");
	}
	
	

}
