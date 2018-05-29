package ihm;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Vue1 extends JPanel{
	JLabel vue1;
	JPanel container;
	
	public Vue1() {
		vue1 = new JLabel();
		container = new JPanel();
		container.setBackground(Color.BLACK);
		
		vue1.setText("Vue 1");
		container.add(vue1);
		
		this.add(container);
		this.setSize(new Dimension(100,100));
	}

}