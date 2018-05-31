package ihm;

import java.awt.Component;

import javax.swing.BoxLayout;
import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;

public class VueVoyages extends JPanel {
<<<<<<< HEAD
	JPanel panelMain;
			
	//Constructeur
	public VueVoyages() {	
		//Vue générale
		panelMain = new JPanel();
=======
	
	public JPanel panelLeft;
	
	//VueVoyages
	public JTable myTable;
	public String[] columnsNames = {"Trajet", "Date", "Conducteur", "Prix", "Etat", "Détails"};
	public Object[][] data = new String[0][0];
	public JButton buttonDetails = new JButton();
	
	//VueVoyageConducteur
	public JTable myTableConducteur;
	public String[] columnsNamesConducteur = {"Voyageurs", "N° tel", "Ville Départ", "Heure Départ", "Destination", "Heure Arrivée", "Signaler (absence au rdv)","Liste noire"};
	public Object[][] dataConducteur;
	public JButton annuler, enregistrer;
	
	//VueVoyageVoyageur
	public JLabel labelDepart;
	public JLabel labelEtape1;
	public JLabel labelEtape2;
	public JLabel labelEtape3;
	public JLabel labelArrivee;
	public JLabel labelPrix;
	public JTable myTableVoyageur;
	public String[] columnsNamesVoyageur = {"Conducteur","N° tel","Véhicule","Conduite","Comportement","Signaler"};
	public Object[][] dataVoyageur;
	public JButton annulerVoyageur, enregistrerVoyageur;	
			
	//Constructeur
	public VueVoyages(Object[][]data) {
		this.myTable = new JTable(data, columnsNames);
		this.myTableConducteur = new JTable(dataConducteur, columnsNamesConducteur);
		this.data = data;
		
		//Vue générale
		JPanel panelRight1 = new JPanel();
		JPanel panelRight2 = new JPanel();
		this.panelLeft = new JPanel();
		
		//VueVoyage
		myTableModel model = new myTableModel();
		myTable.setModel(model);
		myTable.getColumn("Détails").setCellRenderer(new buttonDetailsRenderer());
		myTable.getColumn("Détails").setCellEditor(new buttonDetailsEditor(new JCheckBox()));
		
		panelLeft.add(new JScrollPane(myTable));
		/**/
		
		//VueVoyageConducteur
		JPanel paneltop = new JPanel();
		
		DefaultTableModel modelConducteur = new DefaultTableModel(this.dataConducteur, this.columnsNamesConducteur);
        myTableConducteur = new JTable(modelConducteur) {
        	
            @Override
            public Class getColumnClass(int column) {
                switch (column) {
                    case 0:
                        return String.class;
                    case 1:
                        return String.class;
                    case 2:
                        return String.class;
                    case 3:
                        return String.class;
                    case 4:
                        return String.class;
                    case 5:
                        return String.class;
                    case 6:
                        return Boolean.class;
                    default:
                        return Boolean.class;
                }
            }
        };
        
        paneltop.add(new JScrollPane(myTableConducteur));
        
        JPanel panelbot = new JPanel();
        
        this.annuler = new JButton("Annuler la réservation");
		this.enregistrer = new JButton("Enregistrer");
		
		panelbot.add(annuler);
		panelbot.add(enregistrer);
		
		panelbot.setLayout(new BoxLayout(panelbot, BoxLayout.LINE_AXIS));
		
		panelRight1.add(paneltop);
		panelRight1.add(panelbot);
		panelRight1.setVisible(false);
		/**/
		
		//VueVoyageVoyageur
		JPanel panelTopVoyageur = new JPanel();
		
		this.labelDepart = new JLabel("Ville Départ : ");
		this.labelEtape1 = new JLabel("Etape 1 : ");
		this.labelEtape2 = new JLabel("Etape 2 : ");
		this.labelEtape3 = new JLabel("Etape 3 : ");
		this.labelArrivee = new JLabel("Ville Arrivee : ");
		this.labelPrix = new JLabel("Prix total : ");
		
		panelTopVoyageur.add(labelDepart);
		panelTopVoyageur.add(labelEtape1);
		panelTopVoyageur.add(labelEtape2);
		panelTopVoyageur.add(labelEtape3);
		panelTopVoyageur.add(labelArrivee);
		panelTopVoyageur.add(labelPrix);
		panelTopVoyageur.setLayout(new BoxLayout(panelTopVoyageur, BoxLayout.Y_AXIS));
		
		JPanel panelBotVoyageur = new JPanel();
		
		DefaultTableModel modelVoyageur = new DefaultTableModel(this.dataVoyageur, this.columnsNamesVoyageur);
        myTableVoyageur = new JTable(modelVoyageur) {
        	
            @Override
            public Class getColumnClass(int column) {
                switch (column) {
                    case 0:
                        return String.class;
                    case 1:
                        return String.class;
                    case 2:
                        return String.class;
                    case 3:
                        return String.class;
                    case 4:
                        return String.class;
                    default:
                        return Boolean.class;
                }
            }
        };
        
        panelBotVoyageur.add(new JScrollPane(myTableVoyageur));
        
        JPanel panelVoyageur = new JPanel();
        panelVoyageur.add(panelTopVoyageur);
        panelVoyageur.add(panelBotVoyageur);
        panelVoyageur.setLayout(new BoxLayout(panelVoyageur, BoxLayout.Y_AXIS));
        
        this.annulerVoyageur = new JButton("Annuler Réservation");
        this.enregistrerVoyageur = new JButton("Enregistrer");
        
        JPanel panelBotVoyageurButtons = new JPanel();
        
        panelBotVoyageurButtons.add(annulerVoyageur);
        panelBotVoyageurButtons.add(enregistrerVoyageur);
        panelBotVoyageurButtons.setLayout(new BoxLayout(panelBotVoyageurButtons, BoxLayout.LINE_AXIS));
        
        panelRight2.add(panelTopVoyageur);
		panelRight2.add(panelBotVoyageur);
		panelRight2.add(panelBotVoyageurButtons);
		panelRight2.setLayout(new BoxLayout(panelRight2, BoxLayout.PAGE_AXIS));
		
		panelRight2.setVisible(false);
        
		//vue générale
		add(panelLeft);
		add(panelRight1);
		add(panelRight2);
		
		this.setLayout(new BoxLayout(this, BoxLayout.LINE_AXIS));
	}
>>>>>>> a090c19b1c49ea6877db403c71a19acc90b4ceb2

		//vue générale
		add(panelMain);

		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
	}
<<<<<<< HEAD
        
=======

	public class myTableModel extends DefaultTableModel {
	
		JButton buttonDetails = new JButton();

		public myTableModel() {
			super(data,columnsNames);
		}

		public boolean isCellEditable(int row,int cols) {		
			return true;
		}

	}
         
>>>>>>> a090c19b1c49ea6877db403c71a19acc90b4ceb2
}
