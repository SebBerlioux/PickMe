package ihm;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

public class ControleurConnexion {
	VueConnexion vue;
	
	public ControleurConnexion() {
		this.vue = new VueConnexion();
		
		//création des actions
		ActionConnexion connexion = new ActionConnexion();
		ActionInscription inscription = new ActionInscription();
		
		//on lie les actions aux boutons
		this.vue.boutonConnexion.setAction(connexion);
		this.vue.boutonInscription.setAction(inscription);
		
		//ajout du texte aux boutons
		this.vue.boutonConnexion.setText("Connexion");
		this.vue.boutonInscription.setText("S'inscrire");
		
	}
	
	public class ActionConnexion extends AbstractAction {

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("Connexion");
		}
		
	}
	
	public class ActionInscription extends AbstractAction {

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("S'inscrire");
		}
		
	}
	
}
