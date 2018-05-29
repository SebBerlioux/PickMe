package ihm;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Vue2 extends JPanel{
	JLabel vue2;
	JPanel container;
	
	public Vue2() {
		vue2 = new JLabel();
		container = new JPanel();
		container.setBackground(Color.WHITE);
		
		vue2.setText("Vue 2");
		container.add(vue2);
		
		this.add(container);
		
	}

}