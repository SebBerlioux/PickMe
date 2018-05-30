package ihm;

import java.awt.event.ActionEvent;
import java.util.Observable;
import java.util.Observer;
import javax.swing.AbstractAction;

public class ControleurSousVueRechercherVoyage {
	SousVueRechercherVoyage vue;

	public ControleurSousVueRechercherVoyage() {
		this.vue = new SousVueRechercherVoyage();
	}

	public class ActionReserver extends AbstractAction{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub 
		}

	}
}
