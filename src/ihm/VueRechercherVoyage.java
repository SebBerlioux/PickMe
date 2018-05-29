package ihm;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class VueRechercherVoyage extends JPanel{
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
		
		public VueRechercherVoyage() {
			this.gauche = new JPanel();
			this.droite = new JPanel();
			
			//layouts
			gauche.setLayout(new GridBagLayout());
			GridBagConstraints c1 = new GridBagConstraints();
			droite.setLayout(new GridBagLayout());
			GridBagConstraints c2 = new GridBagConstraints();
			
			//panel gauche
			this.depart = new JLabel("D�part: ");
			this.date = new JLabel("Date: ");
			this.heureDepart = new JLabel("Heure de d�part: ");
			this.nbPlace = new JLabel("Nombre de place(s): ");
			this.boxDepart = new JTextField(10);
			this.txtFDate1 = new JTextField(2);
			this.txtFDate2 = new JTextField(2);
			this.txtFDate3 = new JTextField(4);
			this.txtFHeure1 = new JTextField(2);
			this.txtFHeure2 = new JTextField(2);
			this.txtFPlace = new JTextField(2);
			
			//panel droite
			this.villeEtape = new JLabel("Ville �tape: ");
			this.heureArrivee = new JLabel("Heure d'arriv�e: ");
			this.lieuRdv = new JLabel("Lieu de rendez-vous: ");
			this.prix = new JLabel("Prix: ");
			this.txtVilleEtape = new JTextField(10);
			this.txtHeure = new JTextField(2);
			this.txtMinute = new JTextField(2);
			this.txtLieuRdv = new JTextField(10);
			this.txtPrix = new JTextField(2);
			this.boutonAjouter = new JButton("Ajouter");
			this.boutonTerminer = new JButton("Terminer");
			
			boxDepart.setEditable(true);
			txtFDate1.setEditable(true);
			txtFDate2.setEditable(true);
			txtFDate3.setEditable(true);
			txtFHeure1.setEditable(true);
			txtFHeure2.setEditable(true);
			txtFPlace.setEditable(true);
			
			//ajout des champs du panel gauche
			c1.gridx = 0;
			c1.gridy = 0;
			gauche.add(depart, c1);
			c1.gridx = 1;
			c1.gridy = 0;
			gauche.add(boxDepart, c1);
			c1.gridx = 0;
			c1.gridy = 1;
			gauche.add(date, c1);
			c1.gridx = 1;
			c1.gridy = 1;
			gauche.add(txtFDate1, c1);
			c1.gridx = 2;
			c1.gridy = 1;
			gauche.add(txtFDate2, c1);
			c1.gridx = 3;
			c1.gridy = 1;
			gauche.add(txtFDate3, c1);
			c1.gridx = 0;
			c1.gridy = 2;
			gauche.add(heureDepart, c1);
			c1.gridx = 1;
			c1.gridy = 2;
			gauche.add(txtFHeure1, c1);
			c1.gridx = 2;
			c1.gridy = 2;
			gauche.add(txtFHeure2, c1);
			c1.gridx = 0;
			c1.gridy = 3;
			gauche.add(nbPlace, c1);
			c1.gridx = 1;
			c1.gridy = 3;
			gauche.add(txtFPlace, c1);
			
			
			//ajout des champs du panel gauche
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
			
			this.add(gauche);
			this.add(droite);
		}
}

