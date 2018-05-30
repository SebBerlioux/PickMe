package entree_sortie;
import java.util.ArrayList;

import GestionDonnees.*;

public class Main {
  public static void main(String[] args) {
    
	 Utilisateur user = new Utilisateur("Andrieux","Romain","0649736894","romandrieux29@gmail.com","red589z","Camion","lent","concentre");
	 Utilisateur user2 = new Utilisateur("Mario","Luigi","0649736894","romandrieux29@gmail.com","red589z","Camion","lent","concentre");

	 user.creerVoyage("Nantes","08/08/2008","15:56",6);
	 
	 //System.out.println(lecture.readUser("users.txt"));
	 //System.out.println(lecture.readTrip("trips.txt"));
	 
	 //System.out.println("res = " + user.rechercherTrajet("Brest", "Paris", "03/07/2018"));
	 //user2.reserver(trip2, "Brest", "Paris");
	 //System.out.println("res = " + user.rechercherTrajet("Brest", "Paris", "03/07/2018"));
	 
	 //System.out.println(lecture.readTrip("trips.txt"));
  }
}
	 
