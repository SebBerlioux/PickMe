package ihm;

import java.awt.Component;
import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;

public class VueVoyages extends JFrame{
	
	public JTable myTable;
	public String[] columnsNames = {"Trajet", "Date", "Conducteur", "Prix", "Etat", "Détails"};
	public Object[][] data = {{"xxx","xxx","xxx","xxx","xxx"},{"xxx","xxx","xxx","xxx","xxx"}};
	public JButton button = new JButton();
			
	public VueVoyages() {
		this.myTable = new JTable(data, columnsNames);
		
		myTableModel model = new myTableModel();
		myTable.setModel(model);
		myTable.getColumn("Détails").setCellRenderer(new ButtonRenderer());
		myTable.getColumn("Détails").setCellEditor(new ButtonEditor(new JCheckBox()));
		
		add(new JScrollPane(myTable));
	}

	class ButtonRenderer extends JButton implements TableCellRenderer {

		public ButtonRenderer() {
			setOpaque(true);
		}

		public Component getTableCellRendererComponent(JTable table, Object value, 
				boolean isSelected, boolean hasFocus, int row, int column) {
			button.setText("Détails");
			return button;
		}

	}

	class ButtonEditor extends DefaultCellEditor {
	
		public ButtonEditor(JCheckBox checkbox) {
			super(checkbox);
		}

		public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
			button.setText("Détails");
			return button;
		}
	}

	public class myTableModel extends DefaultTableModel {
	
		JButton button=new JButton();

		public myTableModel() {
			super(data,columnsNames);
		}

		public boolean isCellEditable(int row,int cols) {		
			return true;
		}

	}         
}