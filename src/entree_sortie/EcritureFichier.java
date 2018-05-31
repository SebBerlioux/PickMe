package entree_sortie;
import GestionDonnees.*;

import java.io.*;
import java.util.ArrayList;

/**
 * @author Romain
 *
 */
public class EcritureFichier {
	
	/**
	 * @param user
	 */
	public void writeUser(Utilisateur user){
		
		boolean b = true;
		LectureFichier lecture = new LectureFichier();
		ArrayList<Utilisateur> listeUsers = new ArrayList<Utilisateur>();
		
		try {
			listeUsers = lecture.readUser("users.txt");
			for(int i=0; i<listeUsers.size();i++) {
				if(listeUsers.get(i).equals(user))
					b = false;
			}
		}
		catch(NullPointerException e) {}
		
		
		if(b) {
			ObjectOutputStream oos = null;
			FileOutputStream fos = null;
			File f = new File("users.txt");
		 
			try {
				if(f.exists()){
					fos = new FileOutputStream(f,true);
					oos = new AppendObjectOutputStream(fos);
				}
				else{
					fos = new FileOutputStream(f);
					oos = new ObjectOutputStream(fos);
				}
				oos.writeObject(user);
			}
			catch (FileNotFoundException e) {
			    e.printStackTrace();
			}
			catch (IOException e) {
				e.printStackTrace();
			}
			finally {
				try {
					oos.close();
					fos.close();
				}
				catch (IOException e) {
	                e.printStackTrace();
	            }
			}
		}

	}
	
	/**
	 * @param user
	 */
	public void overWriteUser(Utilisateur user){
		
		ObjectOutputStream oos = null;
		FileOutputStream fos = null;
		File f = new File("users.txt");
	 
		try {
			fos = new FileOutputStream(f);
			oos = new ObjectOutputStream(fos);
			oos.writeObject(user);
		}
		catch (FileNotFoundException e) {
		    e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				oos.close();
				fos.close();
			}
			catch (IOException e) {
                e.printStackTrace();
            }
		}
	}
	
	/**
	 * @param trip
	 */
	public void writeTrip(Voyage trip){
		
		boolean b = true;
		LectureFichier lecture = new LectureFichier();
		ArrayList<Voyage> listeTrips = new ArrayList<Voyage>();

		try {
			listeTrips = lecture.readTrip("trips.txt");
			for(int i=0; i<listeTrips.size();i++) {
				if(listeTrips.get(i).equals(trip))
					b = false;
			}
		}
		catch(NullPointerException e) {}
		
		
		if(b) {
			ObjectOutputStream oos = null;
			FileOutputStream fos = null;
			File f = new File("trips.txt");
		 
			try {
				if(f.exists()){
					fos = new FileOutputStream(f,true);
					oos = new AppendObjectOutputStream(fos);
				}
				else{
					fos = new FileOutputStream(f);
					oos = new ObjectOutputStream(fos);
				}
				oos.writeObject(trip);
			}
			catch (FileNotFoundException e) {
			    e.printStackTrace();
			}
			catch (IOException e) {
				e.printStackTrace();
			}
			finally {
				try {
					oos.close();
					fos.close();
				}
				catch (IOException e) {
	                e.printStackTrace();
	            }
			}
		}
	}
	
	/**
	 * @param trip
	 */
	public void overWriteTrip(Voyage trip){
		
		ObjectOutputStream oos = null;
		FileOutputStream fos = null;
		File f = new File("trips.txt");
	 
		try {
			fos = new FileOutputStream(f);
			oos = new ObjectOutputStream(fos);
			oos.writeObject(trip);
		}
		catch (FileNotFoundException e) {
		    e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				oos.close();
				fos.close();
			}
			catch (IOException e) {
                e.printStackTrace();
            }
		}
	}
	
	
	/**
	 * @param nom
	 * @param prenom
	 * @param tel
	 * @param email
	 * @param mdp
	 * @param typeVehicule
	 * @param typeConduite
	 * @param comportementAuVolant
	 */
	public void creerUtilisateur(String nom, String prenom, String tel, String email, String mdp, String typeVehicule, String typeConduite, String comportementAuVolant) {
		Utilisateur user = new Utilisateur(nom, prenom, tel, email, mdp, typeVehicule, typeConduite, comportementAuVolant);
		writeUser(user);
	}
	
}
