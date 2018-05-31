package ihm;

import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
import javax.swing.AbstractAction;

import GestionDonnees.Utilisateur;
import java.util.Observer;

public class ControleurVueVoyages implements Observer{
	VueVoyages vue;
	Utilisateur utilisateur;
	ModelSousVueVoyage model;
	
	public ControleurVueVoyages(Utilisateur utilisateur) {
		this.vue = new VueVoyages();
		
		ArrayList<String> voyages = utilisateur.mesVoyages();
		Integer nbVoyages = utilisateur.getNbVoyages();

		Object[][] data = new Object [nbVoyages][5];
		
		for(int i =0; i < nbVoyages; i++) {
				   data[i][0] = voyages.get(0+i*7) + ">" + voyages.get(1+i*7);
				   data[i][1] = voyages.get(2+i*7);
				   data[i][2] = voyages.get(3+i*7) + " " + voyages.get(4+i*7);
				   data[i][3] = voyages.get(5+i*7);
				   data[i][4] = voyages.get(6+i*7);
		}
		
		this.model = new ModelSousVueVoyage(data);
		
		for(int i=0; i<nbVoyages; i++)
		{
			this.vue.panelMain.add(new ControleurSousVueVoyage(this.model, i).vue);
		}
		
		this.utilisateur = utilisateur;
		
		this.utilisateur.addObserver(this);
	}
	
	public class ActionDetails extends AbstractAction implements Observer{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void update(Observable o, Object arg) {
			// TODO Auto-generated method stub
			
		}
		
	}

	@Override
	public void update(Observable arg0, Object arg1) {
		System.out.println("===========================UPDATE==========================");
		ArrayList<String> voyages = utilisateur.mesVoyages();
		Integer nbVoyages = utilisateur.getNbVoyages();

		Object[][] donnees = new Object [nbVoyages][5];
		
		for(int i =0; i < nbVoyages; i++) {
				donnees[i][0] = voyages.get(0+i*7) + ">" + voyages.get(1+i*7);
				donnees[i][1] = voyages.get(2+i*7);
				donnees[i][2] = voyages.get(3+i*7) + " " + voyages.get(4+i*7);
				donnees[i][3] = voyages.get(5+i*7);
				donnees[i][4] = voyages.get(6+i*7);
		}
		this.model.updateData(donnees);
		
		this.vue.panelMain.removeAll();
		
		for(int i=0; i<nbVoyages; i++)
		{
			this.vue.panelMain.add(new ControleurSousVueVoyage(this.model, i).vue);
		}
		
	}
}
