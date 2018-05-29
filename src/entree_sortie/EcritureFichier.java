package entree_sortie;
import GestionDonnees.*;

import java.io.*;

public class EcritureFichier {
	
	public void writeUser(Utilisateur obj){
		
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
			oos.writeObject(obj);
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
	
	public void writeTrip(Voyage obj){
		
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
			oos.writeObject(obj);
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
