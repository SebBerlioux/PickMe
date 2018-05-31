package ihm;

import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
import javax.swing.AbstractAction;
import javax.swing.JTable;

import GestionDonnees.Utilisateur;
import java.util.Observer;

public class ControleurVueVoyages implements Observer{
	VueVoyages vue;
	Utilisateur utilisateur;
	ModelSousVueVoyage model;
	
	public ControleurVueVoyages(Utilisateur utilisateur) {
<<<<<<< HEAD
		this.vue = new VueVoyages();
=======
		this.utilisateur = utilisateur;
		this.utilisateur.addObserver(this);
>>>>>>> a090c19b1c49ea6877db403c71a19acc90b4ceb2
		
		ArrayList<String> voyages = utilisateur.mesVoyages();
		Integer nbVoyages = utilisateur.getNbVoyages();
		Object[][] data = new Object [nbVoyages][5];
		if(nbVoyages != 0) {
			System.out.println("nbVoyages:" + nbVoyages);
			
			for(int i =0; i < nbVoyages; i++) {
			   data[i][0] = voyages.get(0+i*7) + ">" + voyages.get(1+i*7);
			   data[i][1] = voyages.get(2+i*7);
			   data[i][2] = voyages.get(3+i*7) + " " + voyages.get(4+i*7);
			   data[i][3] = voyages.get(5+i*7);
			   data[i][4] = voyages.get(6+i*7);
			}
			try {
				this.vue.data = data;
			}catch(NullPointerException e){
			}
		}
		
		this.model = new ModelSousVueVoyage(data);
		
		for(int i=0; i<nbVoyages; i++)
		{
			this.vue.panelMain.add(new ControleurSousVueVoyage(this.model, i).vue);
		}
		
		this.utilisateur = utilisateur;
		
		this.utilisateur.addObserver(this);
	}
	
	public class ActionDétails extends AbstractAction implements Observer{

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
<<<<<<< HEAD
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
=======
		ArrayList<String> voyages = this.utilisateur.mesVoyages();
		Integer nbVoyages = this.utilisateur.getNbVoyages();

		Object[][] data = new Object [nbVoyages][5];
>>>>>>> a090c19b1c49ea6877db403c71a19acc90b4ceb2
		
		for(int i =0; i < nbVoyages; i++) {
				   data[i][0] = voyages.get(0+i*7) + ">" + voyages.get(1+i*7);
				   data[i][1] = voyages.get(2+i*7);
				   data[i][2] = voyages.get(3+i*7) + " " + voyages.get(4+i*7);
				   data[i][3] = voyages.get(5+i*7);
				   data[i][4] = voyages.get(6+i*7);
		}
		this.vue.removeAll();
		this.vue.data = data;
		//this.vue = new VueVoyages(this.vue.data);
		this.vue.revalidate();
		this.vue.repaint(this.vue.getGraphics());
		this.vue.updateUI();
	}
}
