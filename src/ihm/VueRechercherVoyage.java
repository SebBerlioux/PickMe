package ihm;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class VueRechercherVoyage extends JPanel{
		public JPanel gauche;
		public JPanel milieu;
		public JPanel droite;
	
		//panel gauche
		public JLabel depart;
		public JLabel destination;
		public JLabel date;
		public JTextField txtDepart;
		public JTextField txtDestination;
		public JTextField txtDateJour;
		public JTextField txtDateMois;
		public JTextField txtDateAnnee;
		public JButton boutonRechercher;
		
		//panel droite rien -> on ajoutera les vues graces au mainControlerRechercherVoyages

		
		public VueRechercherVoyage() {
			this.gauche = new JPanel();
			this.droite = new JPanel();
			this.milieu = new JPanel();
			
			//layouts
			gauche.setLayout(new GridBagLayout());
			GridBagConstraints c1 = new GridBagConstraints();
			milieu.setLayout(new GridBagLayout());
			GridBagConstraints c2 = new GridBagConstraints();
			droite.setLayout(new GridBagLayout());
			GridBagConstraints c3 = new GridBagConstraints();
			
			//panel gauche
			this.depart = new JLabel("Départ: ");
			this.destination = new JLabel("Destination: ");
			this.date = new JLabel("Date: ");
			this.txtDepart = new JTextField(10);
			this.txtDestination = new JTextField(10);
			this.txtDateJour = new JTextField(2);
			this.txtDateMois = new JTextField(2);
			this.txtDateAnnee = new JTextField(4);
			this.boutonRechercher = new JButton("Rechercher");
			
			//panel droite
			
			
			//ajout des champs du panel gauche
			c1.gridx = 0;
			c1.gridy = 0;
			gauche.add(depart, c1);
			c1.gridx = 1;
			c1.gridy = 0;
			gauche.add(txtDepart, c1);
			c1.gridx = 0;
			c1.gridy = 1;
			gauche.add(destination, c1);
			c1.gridx = 1;
			c1.gridy = 1;
			gauche.add(txtDestination, c1);
			c1.gridx = 0;
			c1.gridy = 2;
			gauche.add(date, c1);
			c1.gridx = 1;
			c1.gridy = 2;
			gauche.add(txtDateJour, c1);
			c1.gridx = 2;
			c1.gridy = 2;
			gauche.add(txtDateMois, c1);
			c1.gridx = 3;
			c1.gridy = 2;
			gauche.add(txtDateAnnee, c1);
			c1.gridx = 1;
			c1.gridy = 3;
			gauche.add(boutonRechercher, c1);
			
			
			//ajout des champs du panel gauche

			
			gauche.setBorder(BorderFactory.createEtchedBorder());
			droite.setBorder(BorderFactory.createEtchedBorder());
			
			this.add(gauche);
			this.add(milieu);
			this.add(droite);
		}
}

