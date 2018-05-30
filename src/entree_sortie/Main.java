package entree_sortie;
import java.util.ArrayList;

import GestionDonnees.*;

public class Main {
  public static void main(String[] args) {
    
	 Utilisateur user = new Utilisateur("Andrieux","Romain","0649736894","romandrieux29@gmail.com","red589z","Camion","lent","concentre");
	 Utilisateur user2 = new Utilisateur("Mario","Luigi","0649736894","romandrieux29@gmail.com","red589z","Camion","lent","concentre");

	 Etape etape1 = new Etape("Tours","Angers", 6, 1, "placeA", "18h", "20h");
	 Etape etape2 = new Etape("Angers","Nantes", 6, 1, "placeA", "18h", "20h");
	 Etape etape3 = new Etape("Brest","Le Mans", 6, 1, "placeA", "18h", "20h");
	 Etape etape4 = new Etape("Le Mans","Paris", 6, 1, "placeA", "18h", "20h");

	 ArrayList<Etape> trajet = new ArrayList<Etape>();
	 trajet.add(etape1);
	 trajet.add(etape2);
	 Voyage trip1 = new Voyage("15/06/2018",trajet,user);
	 
	 ArrayList<Etape> trajet2 = new ArrayList<Etape>();
	 trajet2.add(etape3);
	 trajet2.add(etape4);
	 Voyage trip2 = new Voyage("03/07/2018",trajet2,user2);
	
	 EcritureFichier ecriture = new EcritureFichier();
	 LectureFichier lecture = new LectureFichier();
	 
	 ecriture.writeUser(user);
	 ecriture.writeUser(user2);
	 ecriture.writeTrip(trip1);
	 ecriture.writeTrip(trip2);
	 
	 //System.out.println(lecture.readUser("users.txt"));
	 System.out.println(lecture.readTrip("trips.txt"));
	 
	 //System.out.println("res = " + user.rechercherTrajet("Brest", "Paris", "03/07/2018"));
	 user.reserver(trip2, "Brest", "Paris");
	 //System.out.println("res = " + user.rechercherTrajet("Brest", "Paris", "03/07/2018"));
	 
	 System.out.println(lecture.readTrip("trips.txt"));
  }
}
	 
