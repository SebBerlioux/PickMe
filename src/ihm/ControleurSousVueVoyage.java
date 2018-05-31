package ihm;

import java.awt.event.ActionEvent;
import java.util.Observable;
import java.util.Observer;

import javax.swing.AbstractAction;


public class ControleurSousVueVoyage implements Observer{
	SousVueVoyage vue;
	ModelSousVueVoyage model;
	int id;

	public ControleurSousVueVoyage(ModelSousVueVoyage model, int id) {
		this.vue = new SousVueVoyage();
		this.model = model;
		this.id = id;
		
		this.vue.txtTrajet.setText(this.model.getTrajet(this.id));
		this.vue.txtDate.setText(this.model.getDate(this.id));
		this.vue.txtConducteur.setText(this.model.getConducteur(this.id));
		this.vue.txtPrix.setText(this.model.getPrix(this.id));
		this.vue.txtEtat.setText(this.model.getEtat(this.id));
		
		this.model.addObserver(this);
	}

	public class ActionReserver extends AbstractAction{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub 
		}

	}

	@Override
	public void update(Observable o, Object arg) {
		//code si on veut update quand le model est edité (quand on fait une modif d'un des voyages)
	}
}
