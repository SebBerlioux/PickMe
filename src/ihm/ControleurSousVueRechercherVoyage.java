package ihm;

import java.awt.event.ActionEvent;
import java.util.Observable;
import java.util.Observer;
import javax.swing.AbstractAction;

public class ControleurSousVueRechercherVoyage {
	SousVueRechercherVoyage vue;
	ModelSousVueRechercher model;

	public ControleurSousVueRechercherVoyage(ModelSousVueRechercher model) {
		this.vue = new SousVueRechercherVoyage();
		this.model = model;
	}

	public class ActionReserver extends AbstractAction{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub 
		}

	}
}
