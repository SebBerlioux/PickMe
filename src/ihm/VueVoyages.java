package ihm;

import javax.swing.BoxLayout;
import javax.swing.JPanel;

/**
 * @author S�bastien
 *
 * Vue g�rant l'affichage de l'onglet "Mes Voyages"
 */
public class VueVoyages extends JPanel {
	JPanel panelMain;
			
	//Constructeur
	public VueVoyages() {	
		panelMain = new JPanel();

		add(panelMain);

		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
	}
        
}
