package entree_sortie;
import GestionDonnees.*;

import java.io.*;
import java.util.ArrayList;

public class LectureFichier {
	
	public void read(String filename) {
		
	    ObjectInputStream ois = null;;
	    FileInputStream fis = null;
	    BufferedInputStream bis = null;
	    File file = null;
	    ArrayList<Utilisateur> liste = new ArrayList<Utilisateur>();
	    
	    try {
	      file = new File(filename);
	      fis = new FileInputStream(file);
	      bis = new BufferedInputStream(fis);
	      ois = new ObjectInputStream(bis);
	      
	      
	      try{
	    	  while((liste.add((Utilisateur)ois.readObject())))
	    		  liste.add((Utilisateur)ois.readObject());
	      }
	      catch(EOFException e) {  
	      }
		  
	      for(Utilisateur user : liste) {
	    	  System.out.println(user);
		  }
	    }
	    catch (ClassNotFoundException e) {
	        e.printStackTrace();
	    }
	    catch(FileNotFoundException e) {
	    	e.printStackTrace();
	    }
	    catch(IOException e) {
	    	e.printStackTrace();
	    }
	    finally {
	    	try {
	            ois.close();
	            fis.close();
	        }
	    	catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	}
}
