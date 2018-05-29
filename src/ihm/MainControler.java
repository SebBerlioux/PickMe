package ihm;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

public class MainControler {
	MainView mainView;
	
	public MainControler() {
		this.mainView = new MainView();
		
		//Création des actions
		ActionRechercherVoyage rechercherVoyage = new ActionRechercherVoyage();
		ActionCreerVoyage creerVoyage = new ActionCreerVoyage();
		ActionMesVoyages mesVoyages = new ActionMesVoyages();
		ActionProfil profil = new ActionProfil();
		ActionExit exit = new ActionExit();
		
		
		//Ajout de toutes les vues des controleurs et les lier au cardlayout
		
		ControleurCreationVoyage controleurCreationVoyage = new ControleurCreationVoyage();
		VueVoyages vueVoyages = new VueVoyages();
		this.mainView.pane.add(controleurCreationVoyage.vue,"Creation voyage");
		this.mainView.pane.add(vueVoyages,"Mes voyages");
		
		//On lie les actions au menu
		this.mainView.rechercherVoyage.addActionListener(rechercherVoyage);
		this.mainView.creerVoyage.addActionListener(creerVoyage);
		this.mainView.mesVoyages.addActionListener(mesVoyages);
		this.mainView.profil.addActionListener(profil);
		this.mainView.exit.addActionListener(exit);
	}
	
	public class ActionRechercherVoyage extends AbstractAction {

		@Override
		public void actionPerformed(ActionEvent e) {;
		}
}
	
	public class ActionCreerVoyage extends AbstractAction {

		@Override
		public void actionPerformed(ActionEvent e) {
			mainView.layout.show(mainView.pane, "Creation voyage");
		}
}
	
	public class ActionMesVoyages extends AbstractAction {

		@Override
		public void actionPerformed(ActionEvent e) {
			mainView.layout.show(mainView.pane, "Mes voyages");
		}
}
	
	public class ActionProfil extends AbstractAction {

		@Override
		public void actionPerformed(ActionEvent e) {
			
		}
}
	
	public class ActionExit extends AbstractAction {

		@Override
		public void actionPerformed(ActionEvent e) {
			System.exit(0);
		}
}
	
}
