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
		
		//récupération des voyages de l'utilisateur
		
		//remplissage du tableau de data
		Object[][] data = new Object [size][6];
		
		
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
