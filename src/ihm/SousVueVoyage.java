package ihm;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.util.Observable;
import java.util.Observer;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SousVueVoyage extends JPanel{

	public JLabel trajet;
	public JLabel date;
	public JLabel conducteur;
	public JLabel prix;
	public JLabel etat;
	public JLabel txtTrajet;
	public JLabel txtDate;
	public JLabel txtConducteur;
	public JLabel txtPrix;
	public JLabel txtEtat;
	public JButton boutonDetails;

	public SousVueVoyage() {
		this.trajet = new JLabel("Départ: ");
		this.date = new JLabel("Date: ");
		this.conducteur = new JLabel("Conducteur: ");
		this.prix = new JLabel("Prix: ");
		this.etat = new JLabel("Etat: ");
		this.boutonDetails = new JButton("Détails");
		this.txtTrajet = new JLabel();
		this.txtDate = new JLabel();
		this.txtConducteur = new JLabel();
		this.txtPrix = new JLabel();
		this.txtEtat = new JLabel();
		
		this.add(trajet);
		this.add(txtTrajet);
		this.add(date);
		this.add(txtDate);
		this.add(conducteur);
		this.add(txtConducteur);
		this.add(prix);
		this.add(txtPrix);
		this.add(etat);
		this.add(txtEtat);
		this.add(boutonDetails);

		this.setBorder(BorderFactory.createEtchedBorder());

	}
}
