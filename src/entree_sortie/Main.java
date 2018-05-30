package entree_sortie;
import java.util.ArrayList;

import GestionDonnees.*;

public class Main {
  public static void main(String[] args) {
	  
	  EcritureFichier ecriture = new EcritureFichier();
    
	 ecriture.creerUtilisateur("Andrieux","Romain","0649736894","romandrieux29@gmail.com","red589z","Camion","lent","concentre");
	 ecriture.creerUtilisateur("Mario","Luigi","0649746894","romandrieux28@gmail.com","red589z","Camion","lent","concentre");
	 
	 //System.out.println(lecture.readUser("users.txt"));
	 //System.out.println(lecture.readTrip("trips.txt"));
	 
	 //System.out.println("res = " + user.rechercherTrajet("Brest", "Paris", "03/07/2018"));
	 //user2.reserver(trip2, "Brest", "Paris");
	 //System.out.println("res = " + user.rechercherTrajet("Brest", "Paris", "03/07/2018"));
	 
	 //System.out.println(lecture.readTrip("trips.txt"));
  }
}
	 
