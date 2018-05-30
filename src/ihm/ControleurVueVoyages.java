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

		Object[][] data = new Object [voyages.size()][5];
		
		for(int i =0; i < utilisateur.mesVoyages().size(); i++) {
			   data[i][0] = voyages.get(0) + ">" + voyages.get(1);
			   data[i][1] = voyages.get(2);
			   data[i][2] = voyages.get(3) + " " + voyages.get(4);
			   data[i][3] = voyages.get(5);
			   data[i][4] = voyages.get(6);
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
