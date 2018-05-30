package ihm;

import java.awt.event.ActionEvent;
import java.util.ArrayList;

import javax.swing.AbstractAction;

import GestionDonnees.Utilisateur;
import entree_sortie.LectureFichier;

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
			if(connexionUtilisateur(vue.txtFmail.getText(),vue.txtFmdp.getText()) != null) //si l'utilisateur existe
			{
				MainControler controleur = new MainControler(connexionUtilisateur(vue.txtFmail.getText(),vue.txtFmdp.getText()));
			}
			else
			{
				System.out.println("Connexion echouée");
			}
		}
		
		public Utilisateur connexionUtilisateur(String email, String mdp) {
			ArrayList<Utilisateur> bdd = new ArrayList<Utilisateur>(); //liste des utilisateurs présents dans la base de données
			
			//on lit la base de données
			try {
				LectureFichier lecture = new LectureFichier();
				bdd = lecture.readUser("users.txt");
				for(int i=0; i<bdd.size(); i++){
					if(bdd.get(i).getEmail().equals(email) && bdd.get(i).getMdp().equals(mdp)) {
						return bdd.get(i);
					}
				}
			}
			catch(NullPointerException e){}

			return null;
		}
		
	}
	
	public class ActionInscription extends AbstractAction {

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("S'inscrire");
		}
		
	}
	
}
