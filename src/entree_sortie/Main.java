package entree_sortie;
import java.util.ArrayList;

import GestionDonnees.*;

public class Main {
  public static void main(String[] args) {
    
	 Utilisateur user = new Utilisateur("Andrieux","Romain","0649736894","romandrieux29@gmail.com","red589z","Camion","lent","concentre");
	 Utilisateur user2 = new Utilisateur("Marjault","Antoine","0649736894","romandrieux29@gmail.com","red589z","Camion","lent","concentre");
	 
	 Etape etape1 = new Etape("Tours","Angers", 6, 1, "placeA", "18h", "20h");
	Etape etape2 = new Etape("Angers","Nantes", 6, 1, "placeA", "18h", "20h");

	ArrayList<Etape> trajet = new ArrayList<Etape>();
	trajet.add(etape1);
	trajet.add(etape2);
	Voyage trip1 = new Voyage("15/06/2018",trajet,user);
	
	 EcritureFichier ecriture = new EcritureFichier();
	 LectureFichier lecture = new LectureFichier();
	 
	 ecriture.writeUser(user);
	 ecriture.writeUser(user2);
	 ecriture.writeTrip(trip1);
	 
	 //lecture.read("users.txt");
	 lecture.readTrip("trips.txt");

  }
}
	 
