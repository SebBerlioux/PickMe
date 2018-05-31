package ihm;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * @author S�bastien
 *
 * Sous vue g�rant l'affichage des voayges de l'utilisateur
 */
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
		this.trajet = new JLabel("D�part: ");
		this.date = new JLabel("Date: ");
		this.conducteur = new JLabel("Conducteur: ");
		this.prix = new JLabel("Prix: ");
		this.etat = new JLabel("Etat: ");
		this.boutonDetails = new JButton("D�tails");
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
