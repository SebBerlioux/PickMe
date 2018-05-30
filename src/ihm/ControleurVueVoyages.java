package ihm;

import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
import javax.swing.AbstractAction;

import GestionDonnees.Utilisateur;

public class ControleurVueVoyages {
	VueVoyages vue;
	Utilisateur utilisateur;
	
	public ControleurVueVoyages(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
		ArrayList<String> voyages = utilisateur.mesVoyages();
		Integer nbVoyages = utilisateur.getNbVoyages();

		Object[][] data = new Object [nbVoyages][5];
		
		for(int i =0; i < nbVoyages; i++) {
				   data[i][0] = voyages.get(0+i*7) + ">" + voyages.get(1+i*7);
				   data[i][1] = voyages.get(2+i*7);
				   data[i][2] = voyages.get(3+i*7) + " " + voyages.get(4+i*7);
				   data[i][3] = voyages.get(5+i*7);
				   data[i][4] = voyages.get(6+i*7);
		}
		
		this.vue = new VueVoyages(data);
	}
	
	public class ActionDétails extends AbstractAction implements Observer{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void update(Observable o, Object arg) {
			// TODO Auto-generated method stub
			
		}
		
	}
}
