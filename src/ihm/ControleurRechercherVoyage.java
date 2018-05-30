package ihm;

import java.awt.event.ActionEvent;
import java.util.Observable;
import java.util.Observer;
import javax.swing.AbstractAction;

public class ControleurRechercherVoyage {
	VueRechercherVoyage vue;

	public ControleurRechercherVoyage() {
		this.vue = new VueRechercherVoyage();

		for(int i=0; i<3; i++)
		{
			this.vue.droite.add(new ControleurSousVueRechercherVoyage().vue);
		}
	}

	public class ActionRechercher extends AbstractAction {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub

		}

	}
}

