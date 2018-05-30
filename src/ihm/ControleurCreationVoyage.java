package ihm;

import java.awt.event.ActionEvent;
import java.util.Observable;
import java.util.Observer;

import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JTextField;

import GestionDonnees.Etape;
import GestionDonnees.Voyage;
import ihm.MainControler.ActionExit;

public class ControleurCreationVoyage {
	VueCreationVoyage vue;
	Voyage voyage;
	
	public ControleurCreationVoyage() {
		this.vue = new VueCreationVoyage();
		this.voyage = new Voyage();
		
		//création des actions
		ActionSuivant suivant = new ActionSuivant();
		ActionAjouter ajouter = new ActionAjouter();
		ActionTerminer terminer = new ActionTerminer();
		
		//on lie les actions aux boutons
		this.vue.boutonSuivant.setAction(suivant);
		this.vue.boutonAjouter.setAction(ajouter);
		this.vue.boutonTerminer.setAction(terminer);
		
		//ajout du texte aux boutons
		this.vue.boutonSuivant.setText("Suivant");
		this.vue.boutonAjouter.setText("Ajouter");
		this.vue.boutonTerminer.setText("Terminer");
		
	}
	
	public class ActionSuivant extends AbstractAction {

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("Création voyage");
			vue.droite.setVisible(true);
			vue.gauche.setVisible(false);
		}
		
	}
	
	public class ActionAjouter extends AbstractAction {

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("Ajouter une étape avec lieu de départ : " + vue.txtLieuRdv.getText());
			
			//récupération des champs
			String villeD = vue.boxDepart.getText();
			String villeA = vue.txtVilleEtape.getText();
			Integer prix = Integer.parseInt(vue.txtPrix.getText());
			Integer nbPlace = Integer.parseInt(vue.txtFPlace.getText());
			String lieuRdv = vue.txtVilleEtape.getText();
			String heureDepart = vue.txtFDate1.getText() + ":" + vue.txtFHeure2.getText();
			String heureArriveeVilleA = vue.txtHeure.getText() + ":" + vue.txtMinute.getText();
			
			//enregistrement de l'étape
			Etape etape1 = new Etape(villeD, villeA, prix, nbPlace, lieuRdv, heureDepart, heureArriveeVilleA);
			System.out.print(etape1.toString());
			
			//reset des champs
			vue.txtVilleEtape.setText("");
			vue.txtHeure.setText("");
			vue.txtMinute.setText("");
			vue.txtLieuRdv.setText("");
			vue.txtPrix.setText("");
		}
		
	}
	
	public class ActionTerminer extends AbstractAction {

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("Terminer");
		}
		
	}
}
