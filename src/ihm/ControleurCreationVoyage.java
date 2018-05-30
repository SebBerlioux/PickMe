package ihm;

import java.awt.event.ActionEvent;
import java.util.Observable;
import java.util.Observer;

import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JTextField;

import GestionDonnees.Etape;
import GestionDonnees.Utilisateur;
import GestionDonnees.Voyage;
import ihm.MainControler.ActionExit;

public class ControleurCreationVoyage {
	VueCreationVoyage vue;
	Voyage voyage;
	Utilisateur utilisateur;
	
	public ControleurCreationVoyage(Utilisateur utilisateur) {
		this.vue = new VueCreationVoyage();
		this.voyage = new Voyage();
		this.utilisateur = utilisateur;
		
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
	
	public void init() {
		vue.droite.setVisible(false);
		vue.gauche.setVisible(true);
		vue.boutonSuivant.setVisible(true);
	}
	
	public class ActionSuivant extends AbstractAction {

		@Override
		public void actionPerformed(ActionEvent e) {
			utilisateur.creerVoyage(vue.boxDepart.getText(), vue.txtFDate1.getText() + "/" + vue.txtFDate2.getText() + "/" + vue.txtFDate3.getText() , vue.txtFDate1.getText() + ":" + vue.txtFHeure2.getText(),Integer.parseInt(vue.txtFPlace.getText()));
			System.out.println("Création voyage");
			vue.droite.setVisible(true);
			vue.gauche.setVisible(false);
			vue.boutonSuivant.setVisible(false);
		}
		
	}
	
	public class ActionAjouter extends AbstractAction {

		@Override
		public void actionPerformed(ActionEvent e) {
			//enregistrement de l'étape
			utilisateur.ajouterEtape(vue.txtVilleEtape.getText(), vue.txtHeure.getText() + ":" + vue.txtMinute.getText(), vue.txtVilleEtape.getText(), Integer.parseInt(vue.txtPrix.getText()));
			
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
			utilisateur.ecrireVoyage();
			vue.droite.setVisible(false);
			vue.gauche.setVisible(true);
			vue.boutonSuivant.setVisible(true);
			System.out.println("Terminer");
		}
		
	}
}
