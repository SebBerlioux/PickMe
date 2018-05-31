package ihm;

import java.awt.Component;
import java.awt.Dimension;

import javax.swing.BoxLayout;
import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;

public class VueVoyages extends JPanel {
	JPanel panelMain;
			
	//Constructeur
	public VueVoyages() {	
		//Vue générale
		panelMain = new JPanel();

		//vue générale
		add(panelMain);

		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
	}
        
}
