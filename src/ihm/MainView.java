package ihm;

import java.awt.CardLayout;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MainView extends JFrame{
	JMenuBar menuBar = new JMenuBar();
	JMenuItem rechercherVoyage = new JMenuItem("Rechercher un voyage");
	JMenuItem creerVoyage = new JMenuItem("Créer un voyage");
	JMenuItem mesVoyages = new JMenuItem("Mes voyages");
	JMenuItem exit = new JMenuItem("exit");
	Container pane;
	CardLayout layout;
	
	public MainView() {
    	layout = new CardLayout();
    	setLayout(layout);
    	pane = this.getContentPane();
		
		menuBar.add(rechercherVoyage);
		menuBar.add(creerVoyage);
		menuBar.add(mesVoyages);
		menuBar.add(exit);
			
		this.setJMenuBar(menuBar); 
        setJMenuBar(menuBar);    
        this.setSize(new Dimension(800,500));
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
		this.setVisible(true);
	}

}
