package entree_sortie;
import java.util.ArrayList;

import GestionDonnees.*;

public class Main {
  public static void main(String[] args) {
	  
	  EcritureFichier ecriture = new EcritureFichier();
    
	 ecriture.creerUtilisateur("Andrieux","Romain","0649736894","romandrieux29@gmail.com","red589z","Camion","lent","concentre");
	 ecriture.creerUtilisateur("Mario","Luigi","0649746894","romandrieux28@gmail.com","red589z","Camion","lent","concentre");
	 
	 Utilisateur user = new Utilisateur("Berlioux","Seb","555655","seb","seb","Camion","lent","concentre");
	 ecriture.writeUser(user);
	 
	 user.creerVoyage("Nantes", "4/4/4", "10:10", 4);
	 user.ajouterEtape("Brest", "45:5", "bar", 5);
	 user.ecrireVoyage();
  }
}
	 
