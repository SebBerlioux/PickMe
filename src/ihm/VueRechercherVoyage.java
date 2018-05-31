package ihm;

import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;

import ihm.VueVoyages.buttonDetailsEditor;
import ihm.VueVoyages.buttonDetailsRenderer;
import ihm.VueVoyages.myTableModel;

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
		public JTable myTable;
		public String[] columnsNames = {"Départ", "Destination", "Heure départ", "Heure arrivée", "Prix", "Véhicule", "Nb de places restantes", "Détails"};
		public Object[][] data;
		public JButton buttonDetails = new JButton();
		

		
		public VueRechercherVoyage() {
			
			this.gauche = new JPanel();
			
			//layouts
			gauche.setLayout(new GridBagLayout());
			GridBagConstraints c1 = new GridBagConstraints();
			GridBagConstraints c2 = new GridBagConstraints();
			
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
			
			//ajout des champs du panel gauche
			c1.gridx = 0;
			c1.gridy = 0;
			gauche.add(depart);
			c1.gridx = 1;
			c1.gridy = 0;
			gauche.add(txtDepart);
			c1.gridx = 0;
			c1.gridy = 1;
			gauche.add(destination);
			c1.gridx = 1;
			c1.gridy = 1;
			gauche.add(txtDestination);
			c1.gridx = 0;
			c1.gridy = 2;
			gauche.add(date);
			c1.gridx = 1;
			c1.gridy = 2;
			gauche.add(txtDateJour);
			c1.gridx = 2;
			c1.gridy = 2;
			gauche.add(txtDateMois);
			c1.gridx = 3;
			c1.gridy = 2;
			gauche.add(txtDateAnnee);
			c1.gridx = 1;
			c1.gridy = 3;
			
			gauche.setBorder(BorderFactory.createEtchedBorder());
			
			this.add(gauche);
			this.add(boutonRechercher);
		}
		
		public void addVueDroite(Object[][] data) {
			System.out.println("droite");
			this.droite = new JPanel();
			droite.setLayout(new BoxLayout(droite, BoxLayout.Y_AXIS));
			this.data = data;
			this.myTable = new JTable(data, columnsNames);
			
			myTableModel model = new myTableModel();
			myTable.setModel(model);
			myTable.getColumn("Détails").setCellRenderer(new buttonDetailsRenderer());
			myTable.getColumn("Détails").setCellEditor(new buttonDetailsEditor(new JCheckBox()));
			
			droite.add(new JScrollPane(myTable));
			droite.setBorder(BorderFactory.createEtchedBorder());
			this.add(droite);
			droite.setVisible(true);
		}
		
		public class myTableModel extends DefaultTableModel {
			
			JButton buttonDetails = new JButton();

			public myTableModel() {
				super(data,columnsNames);
			}

			public boolean isCellEditable(int row,int cols) {		
				return true;
			}

		}
		
		class buttonDetailsRenderer extends JButton implements TableCellRenderer {

			public buttonDetailsRenderer() {
				setOpaque(true);
			}

			public Component getTableCellRendererComponent(JTable table, Object value, 
					boolean isSelected, boolean hasFocus, int row, int column) {
				buttonDetails.setText("Détails");
				return buttonDetails;
			}

		}
		
		class buttonDetailsEditor extends DefaultCellEditor {
			
			public buttonDetailsEditor(JCheckBox checkbox) {
				super(checkbox);
			}

			public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
				buttonDetails.setText("Détails");
				return buttonDetails;
			}
		}
}

