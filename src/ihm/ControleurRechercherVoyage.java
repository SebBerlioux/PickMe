package ihm;

import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
import javax.swing.AbstractAction;
import GestionDonnees.Utilisateur;
import GestionDonnees.Voyage;

/**
 * Controleur gérant la vue VueRechercherVoyage
 * @author Antoine
 *
 */

public class ControleurRechercherVoyage {
	VueRechercherVoyage vue;
	Utilisateur utilisateur;
	
	/**
     * Constructeur ControleurRechercherVoyage.
     * 
     * @param utilisateur
     *            Utilisateur connecté actuellement
     */

	public ControleurRechercherVoyage(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
		this.vue = new VueRechercherVoyage();
		
		ActionRechercher rechercher = new ActionRechercher();
		this.vue.boutonRechercher.setAction(rechercher);
		this.vue.boutonRechercher.setText("Rechercher");

	}
	

	public class ActionRechercher extends AbstractAction {

		@Override
		public void actionPerformed(ActionEvent e) {
			ArrayList<Voyage> voyagesTrouves = new ArrayList<Voyage>();
			voyagesTrouves = utilisateur.rechercherTrajet(vue.txtDepart.getText(), vue.txtDestination.getText(), vue.txtDateJour.getText()+"/ "+vue.txtDateMois.getText()+"/ "+vue.txtDateAnnee.getText());
			
			ArrayList<String> champs = utilisateur.champsRechercher(voyagesTrouves);
			
			Object[][] data = new Object [voyagesTrouves.size()][7];
			
			for(int i =0; i < voyagesTrouves.size(); i++) {
					   data[i][0] = champs.get(0+i*7);
					   data[i][1] = champs.get(1+i*7);
					   data[i][2] = champs.get(2+i*7);
					   data[i][3] = champs.get(3+i*7);
					   data[i][4] = champs.get(4+i*7);
					   data[i][5] = champs.get(5+i*7);
					   data[i][6] = champs.get(6+i*7);
			}
			
			vue.addVueDroite(data);
		}

	}
}

