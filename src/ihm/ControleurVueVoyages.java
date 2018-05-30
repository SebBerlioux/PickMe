package ihm;

import java.awt.event.ActionEvent;
import java.util.Observable;
import java.util.Observer;
import javax.swing.AbstractAction;

import GestionDonnees.Utilisateur;

public class ControleurVueVoyages {
	VueVoyages vue;
	Utilisateur utilisateur;
	
	public ControleurVueVoyages(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;

		Object[][] data = null; // new Object [utilisateur.mesVoyages().size()][6];
		
		/*for(int i =0; i < utilisateur.mesVoyages().size(); i++) {
			   data[i][0] = utilisateur.mesVoyages().get(0) + ">" + utilisateur.mesVoyages().get(1);
			   data[i][1] = utilisateur.mesVoyages().get(2);
			   data[i][2] = utilisateur.mesVoyages().get(3) + " " + utilisateur.mesVoyages().get(4);
			   data[i][2] = utilisateur.mesVoyages().get(5);
			   data[i][2] = utilisateur.mesVoyages().get(6);
		}*/
		
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
