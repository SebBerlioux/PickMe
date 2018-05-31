package ihm;

import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
import javax.swing.AbstractAction;

import GestionDonnees.Utilisateur;
import GestionDonnees.Voyage;

public class ControleurRechercherVoyage {
	VueRechercherVoyage vue;
	Utilisateur utilisateur;

	public ControleurRechercherVoyage(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
		this.vue = new VueRechercherVoyage();
		
		ActionRechercher rechercher = new ActionRechercher();
		this.vue.boutonRechercher.setAction(rechercher);
		this.vue.boutonRechercher.setText("Rechercher");

		for(int i=0; i<3; i++)
		{
			this.vue.droite.add(new ControleurSousVueRechercherVoyage().vue);
		}
		
	}
	
	public void init() {
		
	}

	public class ActionRechercher extends AbstractAction {

		@Override
		public void actionPerformed(ActionEvent e) {
			ArrayList<Voyage> voyagesTrouves = utilisateur.rechercherTrajet(vue.txtDepart.getText(), vue.txtDestination.getText(), vue.txtDateJour.getText()+"/ "+vue.txtDateMois.getText()+"/ "+vue.txtDateAnnee.getText());
			vue.gauche.setVisible(false);
			vue.droite.setVisible(true);
			
		}

	}
}

