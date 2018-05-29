package ihm;

import java.awt.event.ActionEvent;
import java.util.Observable;
import java.util.Observer;
import javax.swing.AbstractAction;

public class ControleurRechercherVoyage {
	VueRechercherVoyage vue;
	
	public ControleurRechercherVoyage() {
		this.vue = new VueRechercherVoyage();
	}
	
	public class ActionBouton extends AbstractAction implements Observer{

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

