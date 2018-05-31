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
	
	public ControleurVueVoyages(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
		this.utilisateur.addObserver(this);
		
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
		
		this.vue = new VueVoyages(data);
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
		ArrayList<String> voyages = this.utilisateur.mesVoyages();
		Integer nbVoyages = this.utilisateur.getNbVoyages();

		Object[][] data = new Object [nbVoyages][5];
		
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
