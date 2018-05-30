package ihm;

import javax.swing.JPanel;

import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;


public class VueCreationVoyage extends JPanel {

	//panel gauche
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
	public JPanel gauche;
	public JPanel droite;
	public JButton boutonSuivant;

	//panel droite
	public JLabel villeEtape;
	public JLabel heureArrivee;
	public JLabel lieuRdv;
	public JLabel prix;
	public JTextField txtVilleEtape;
	public JTextField txtHeure;
	public JTextField txtMinute;
	public JTextField txtLieuRdv;
	public JTextField txtPrix;
	public JButton boutonAjouter;
	public JButton boutonTerminer;

	public VueCreationVoyage() {
		this.gauche = new JPanel();
		this.droite = new JPanel();

		//layouts
		gauche.setLayout(new GridBagLayout());
		GridBagConstraints c1 = new GridBagConstraints();
		droite.setLayout(new GridBagLayout());
		GridBagConstraints c2 = new GridBagConstraints();

		//panel gauche
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
		this.boutonSuivant = new JButton();

		//panel droite
		this.villeEtape = new JLabel("Ville étape: ");
		this.heureArrivee = new JLabel("Heure d'arrivée: ");
		this.lieuRdv = new JLabel("Lieu de rendez-vous: ");
		this.prix = new JLabel("Prix: ");
		this.txtVilleEtape = new JTextField(10);
		this.txtHeure = new JTextField(2);
		this.txtMinute = new JTextField(2);
		this.txtLieuRdv = new JTextField(10);
		this.txtPrix = new JTextField(2);
		this.boutonAjouter = new JButton();
		this.boutonTerminer = new JButton();

		boxDepart.setEditable(true);
		txtFDate1.setEditable(true);
		txtFDate2.setEditable(true);
		txtFDate3.setEditable(true);
		txtFHeure1.setEditable(true);
		txtFHeure2.setEditable(true);
		txtFPlace.setEditable(true);

		//ajout des champs du panel gauche
		gauche.add(depart);
		gauche.add(boxDepart);
		gauche.add(date);
		gauche.add(txtFDate1);
		gauche.add(txtFDate2);
		gauche.add(txtFDate3);
		gauche.add(heureDepart);
		gauche.add(txtFHeure1);
		gauche.add(txtFHeure2);
		gauche.add(nbPlace);
		gauche.add(txtFPlace);
		//gauche.add(boutonSuivant);


		//ajout des champs du panel droit
		c2.gridx = 0;
		c2.gridy = 0;
		droite.add(villeEtape, c2);
		c2.gridx = 1;
		c2.gridy = 0;
		droite.add(txtVilleEtape, c2);
		c2.gridx = 0;
		c2.gridy = 1;
		droite.add(heureArrivee, c2);
		c2.gridx = 1;
		c2.gridy = 1;
		droite.add(txtHeure, c2);
		c2.gridx = 2;
		c2.gridy = 1;
		droite.add(txtMinute, c2);
		c2.gridx = 0;
		c2.gridy = 2;
		droite.add(lieuRdv, c2);
		c2.gridx = 1;
		c2.gridy = 2;
		droite.add(txtLieuRdv, c2);
		c2.gridx = 0;
		c2.gridy = 3;
		droite.add(prix, c2);
		c2.gridx = 1;
		c2.gridy = 3;
		droite.add(txtPrix, c2);
		c2.gridx = 1;
		c2.gridy = 4;
		droite.add(boutonAjouter, c2);
		c2.gridx = 1;
		c2.gridy = 5;
		droite.add(boutonTerminer, c2);

		gauche.setBorder(BorderFactory.createEtchedBorder());
		droite.setBorder(BorderFactory.createEtchedBorder());
		
		droite.setVisible(false);

		this.add(gauche);
		this.add(boutonSuivant);
		this.add(droite);
	}
}
