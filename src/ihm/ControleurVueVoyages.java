package ihm;

import java.awt.event.ActionEvent;
import java.util.Observable;
import java.util.Observer;
import javax.swing.AbstractAction;

public class ControleurVueVoyages {
	VueVoyages vue;
	
	public ControleurVueVoyages(Object[][] data) {
		this.vue = new VueVoyages(data);
	}
	
	public class ActionBouton extends AbstractAction implements Observer{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void update(Observable o, Object arg) {
			// TODO Auto-generated method stub
			
		}
		
	}
}
