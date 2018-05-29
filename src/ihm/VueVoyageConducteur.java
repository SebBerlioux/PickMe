package ihm;

import java.awt.Component;
import java.awt.Dimension;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class VueVoyageConducteur extends JFrame {

	public JTable myTable;
	public String[] columnsNames = {"Voyageurs", "N° tel", "Ville Départ", "Heure Départ", "Destination", "Heure Arrivée", "Signaler (absence au rdv)","Liste noire"};
	public Object[][] data;
	public JButton annuler, enregistrer;
	
	public VueVoyageConducteur(Object[][] data) {
		this.data = data;
		
		JPanel paneltop = new JPanel();
		
		DefaultTableModel model = new DefaultTableModel(this.data, this.columnsNames);
        myTable = new JTable(model) {
        	
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
        
        paneltop.add(new JScrollPane(myTable));
        
        JPanel panelbot = new JPanel();
        
        this.annuler = new JButton("Annuler la réservation");
		this.enregistrer = new JButton("Enregistrer");
		
		annuler.setSize(new Dimension(30,30));
		enregistrer.setSize(new Dimension(30,30));
		
		panelbot.add(annuler);
		panelbot.add(enregistrer);
		
		panelbot.setLayout(new BoxLayout(panelbot, BoxLayout.LINE_AXIS));
		
		this.add(paneltop);
		this.add(panelbot);
		
		this.setLayout(new BoxLayout(getContentPane(), BoxLayout.PAGE_AXIS));
	}
	
	
}
