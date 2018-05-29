package ihm;

import javax.swing.JPanel;
import javax.swing.BoxLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;


public class VueCreationVoyage extends JPanel {
	
	public JLabel depart;
	public JLabel date;
	public JLabel heureDepart;
	public JLabel nbPlace;
	public JTextField boxDepart;
	public JTextField txtFDate1;
	public JTextField txtFDate2;
	public JTextField txtFDate3;
	public JTextField txtFHeure1;
	public JTextField txtFHeure2;
	public JTextField txtFPlace;
	public JButton boutton;
	
	public VueCreationVoyage() {
		this.depart = new JLabel("Départ: ");
		this.date = new JLabel("Date: ");
		this.heureDepart = new JLabel("Heure de départ: ");
		this.nbPlace = new JLabel("Nombre de place(s): ");
		this.boxDepart = new JTextField(10);
		this.txtFDate1 = new JTextField(2);
		this.txtFDate2 = new JTextField(2);
		this.txtFDate3 = new JTextField(4);
		this.txtFHeure1 = new JTextField(2);
		this.txtFHeure2 = new JTextField(2);
		this.txtFPlace = new JTextField(2);
		this.boutton = new JButton("Suivant");
		
		boxDepart.setEditable(true);
		txtFDate1.setEditable(true);
		txtFDate2.setEditable(true);
		txtFDate3.setEditable(true);
		txtFHeure1.setEditable(true);
		txtFHeure2.setEditable(true);
		txtFPlace.setEditable(true);
		
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		JPanel panel4 = new JPanel();
		
		panel1.add(depart);
		panel1.add(boxDepart);
		
		panel2.add(date);
		panel2.add(txtFDate1);
		panel2.add(txtFDate2);
		panel2.add(txtFDate3);
		
		panel3.add(heureDepart);
		panel3.add(txtFHeure1);
		panel3.add(txtFHeure2);
		
		panel4.add(nbPlace);
		panel4.add(txtFPlace);
		
		this.add(panel1);
		this.add(panel2);
		this.add(panel3);
		this.add(panel4);
		this.add(boutton);
	}
}
