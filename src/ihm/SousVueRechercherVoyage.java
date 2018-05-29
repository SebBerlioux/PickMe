package ihm;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SousVueRechercherVoyage extends JPanel{

		public JLabel depart;
		public JLabel valeurDepart;
		public JLabel heureDepart;
		public JLabel destination;
		public JLabel valeurDestination;
		public JLabel heureArrivee;
		public JLabel typeVehicule;
		public JLabel valeurTypeVehicule;
		public JLabel prix;
		public JLabel valeurPrix;
		public JLabel placesRestantes;
		public JLabel valeurPlacesRestantes;
		public JButton boutonReserver;
		
		public SousVueRechercherVoyage() {
			
			this.setLayout(new GridBagLayout());
			GridBagConstraints c1 = new GridBagConstraints();
			
			this.depart = new JLabel("Départ: ");
			this.valeurDepart = new JLabel();
			this.heureDepart = new JLabel();
			this.destination = new JLabel("Destination: ");
			this.valeurDestination = new JLabel();
			this.heureArrivee = new JLabel();
			this.typeVehicule = new JLabel("Véhicule: ");
			this.valeurTypeVehicule = new JLabel();
			this.prix = new JLabel("Prix: ");
			this.valeurPrix = new JLabel();
			this.placesRestantes = new JLabel("Place(s) restante(s): ");
			this.valeurPlacesRestantes = new JLabel();
			this.boutonReserver = new JButton("Réserver");


			c1.gridx = 0;
			c1.gridy = 0;
			this.add(depart, c1);
			c1.gridx = 1;
			c1.gridy = 0;
			this.add(valeurDepart, c1);
			c1.gridx = 2;
			c1.gridy = 0;
			this.add(heureDepart, c1);
			c1.gridx = 0;
			c1.gridy = 1;
			this.add(destination, c1);
			c1.gridx = 1;
			c1.gridy = 1;
			this.add(valeurDestination, c1);
			c1.gridx = 2;
			c1.gridy = 1;
			this.add(heureArrivee, c1);
			c1.gridx = 0;
			c1.gridy = 2;
			this.add(typeVehicule, c1);
			c1.gridx = 1;
			c1.gridy = 2;
			this.add(valeurTypeVehicule, c1);
			c1.gridx = 0;
			c1.gridy = 3;
			this.add(prix, c1);
			c1.gridx = 1;
			c1.gridy = 3;
			this.add(valeurPrix, c1);
			c1.gridx = 0;
			c1.gridy = 4;
			this.add(placesRestantes, c1);
			c1.gridx = 1;
			c1.gridy = 4;
			this.add(valeurPlacesRestantes, c1);
			c1.gridx = 1;
			c1.gridy = 5;
			this.add(boutonReserver, c1);	
			
			this.setBorder(BorderFactory.createEtchedBorder());

		}
}

