package entree_sortie;
import GestionDonnees.*;

public class Main {
  public static void main(String[] args) {
    
	 Utilisateur user = new Utilisateur("Andrieux","Romain","0649736894","romandrieux29@gmail.com","red589z","Camion","lent","concentre");
	 Utilisateur user2 = new Utilisateur("Marjault","Antoine","0649736894","romandrieux29@gmail.com","red589z","Camion","lent","concentre");
	 
	 EcritureFichier ecriture = new EcritureFichier();
	 LectureFichier lecture = new LectureFichier();
	 
	 ecriture.writeUser(user);
	 ecriture.writeUser(user2);
	 
	 lecture.read("users.txt");

  }
}
	 
