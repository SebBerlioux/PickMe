package ihm;

import javax.swing.JTable;

public class VueVoyages{
	
	public JTable myTable;
	public String[] columnsNames = {"Trajet", "Date", "Conducteur", "Prix", "Etat", "D�tails"};
	public Object[][] data;
			
	public VueVoyages() {
		this.myTable = new JTable(data, columnsNames);
	}
	
}
