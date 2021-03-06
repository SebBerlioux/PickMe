package ihm;

import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

import javax.swing.AbstractAction;

import GestionDonnees.Utilisateur;

/**
 * Controleur g�rant une session utilisateur. Se charge de cr�er toutes les vues et controleurs associ�s de sorte � g�n�rer tout l'interface
 * @author Antoine
 *
 */

public class MainControler{
	Utilisateur utilisateur;
	MainView mainView;
	ControleurRechercherVoyage controleurRechercherVoyage;
	ControleurCreationVoyage controleurCreationVoyage;
	ControleurVueVoyages controleurVueVoyages;
	
	/**
     * Constructeur du MainControler.
     * 
     * @param utilisateur
     *            	Utilisateur connect� actuellement
     */
	
	public MainControler(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
		this.mainView = new MainView();
		
		this.mainView.setTitle("PickMe - Bienvenue " + utilisateur.getPrenom() + " " + utilisateur.getNom() + " !"); 
		
		//Cr�ation des actions
		ActionRechercherVoyage rechercherVoyage = new ActionRechercherVoyage();
		ActionCreerVoyage creerVoyage = new ActionCreerVoyage();
		ActionMesVoyages mesVoyages = new ActionMesVoyages();
		ActionExit exit = new ActionExit();
		
		
		//Ajout de toutes les vues des controleurs et les lier au cardlayout
		controleurRechercherVoyage = new ControleurRechercherVoyage(utilisateur);
		controleurCreationVoyage = new ControleurCreationVoyage(utilisateur);
		controleurVueVoyages = new ControleurVueVoyages(utilisateur);
		this.mainView.pane.add(controleurRechercherVoyage.vue,"Rechercher voyage");
		this.mainView.pane.add(controleurCreationVoyage.vue,"Creation voyage");
		this.mainView.pane.add(controleurVueVoyages.vue,"Mes voyages");
		
		//On lie les actions au menu
		this.mainView.rechercherVoyage.addActionListener(rechercherVoyage);
		this.mainView.creerVoyage.addActionListener(creerVoyage);
		this.mainView.mesVoyages.addActionListener(mesVoyages);
		this.mainView.exit.addActionListener(exit);
	}
	
	public class ActionRechercherVoyage extends AbstractAction {

		@Override
		public void actionPerformed(ActionEvent e) {
			mainView.layout.show(mainView.pane, "Rechercher voyage");
		}
}
	
	public class ActionCreerVoyage extends AbstractAction {

		@Override
		public void actionPerformed(ActionEvent e) {
			controleurCreationVoyage.init();
			mainView.layout.show(mainView.pane, "Creation voyage");
		}
}
	
	public class ActionMesVoyages extends AbstractAction {

		@Override
		public void actionPerformed(ActionEvent e) {
			mainView.layout.show(mainView.pane, "Mes voyages");
		}
}
	
	public class ActionExit extends AbstractAction {

		@Override
		public void actionPerformed(ActionEvent e) {
			System.exit(0);
		}
}
	
}
