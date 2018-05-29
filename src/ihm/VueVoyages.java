package ihm;

import javax.swing.JPanel;
import javax.swing.JTable;

public class VueVoyages extends JPanel{
	
	public JTable myTable;
	public String[] columnsNames = {"Trajet", "Date", "Conducteur", "Prix", "Etat", "Détails"};
	public Object[][] data = {{"bite","bite","bite","bite","bite","bite"}};
			
	public VueVoyages() {
		this.myTable = new JTable(data, columnsNames);
		this.add(myTable);
		}
	
}
