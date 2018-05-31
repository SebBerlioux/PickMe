package ihm;

import java.awt.event.ActionEvent;
import java.util.Observable;
import java.util.Observer;
import javax.swing.AbstractAction;

/**
 * Controleur gérant la sous vue SousVueRechercherVoyage, qui permet d'afficher un voyage de dans une liste de résultat d'une recherche
 * @author Antoine
 *
 */

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
