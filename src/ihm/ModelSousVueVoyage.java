package ihm;

import java.util.Observable;

import javax.swing.JLabel;

public class ModelSousVueVoyage extends Observable{
	Object[][] data;
	String trajet;
	String date;
	String conducteur;
	String prix;
	String etat;
	
	public ModelSousVueVoyage(Object[][] data) {
		this.data = data;
	}
	
	public void updateData(Object[][] data) {
		this.data = data;
		this.setChanged();
		this.notifyObservers();
	}
	
	public String getTrajet(int id) {
		return (String) this.data[id][0];
	}
	
	public String getDate(int id) {
		return (String) this.data[id][1];
	}
	
	public String getConducteur(int id) {
		return (String) this.data[id][2];
	}
	
	public String getPrix(int id) {
		return (String) this.data[id][3];
	}
	
	public String getEtat(int id) {
		return (String) this.data[id][4];
	}

}