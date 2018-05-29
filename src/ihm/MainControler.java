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
		
		//Ajout de toutes les vues et les lier au cardlayout
	Vue1 vue1 = new Vue1();
		Vue2 vue2 = new Vue2();
		this.mainView.pane.add(vue1,"Vue1");
		this.mainView.pane.add(vue2,"Vue2");
		
		//On lie les actions au menu
		this.mainView.rechercherVoyage.addActionListener(rechercherVoyage);
		this.mainView.creerVoyage.addActionListener(creerVoyage);
		
	}
	
	public class ActionRechercherVoyage extends AbstractAction {

		@Override
		public void actionPerformed(ActionEvent e) {
			mainView.layout.show(mainView.pane, "Vue1");
		}
}
	
	public class ActionCreerVoyage extends AbstractAction {

		@Override
		public void actionPerformed(ActionEvent e) {
			mainView.layout.show(mainView.pane, "Vue2");
		}
}
	
}
