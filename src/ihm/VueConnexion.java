package ihm;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class VueConnexion extends JPanel {

	//VueConnexion
	public JLabel labelmail, mdp;
	public JTextField txtFmail, txtFmdp;
	public JButton boutonInscription, boutonConnexion;
	
	public VueConnexion() {
		JPanel paneltop = new JPanel();
		JPanel panelbot = new JPanel();
		
		this.labelmail = new JLabel("Email: ");
		this.mdp = new JLabel("Mot de passe: ");
		this.txtFmail = new JTextField(20);
		this.txtFmdp = new JTextField(20);
		this.boutonInscription = new JButton();
		this.boutonConnexion = new JButton();
		
		paneltop.add(labelmail);
		paneltop.add(txtFmail);
		panelbot.add(mdp);
		panelbot.add(txtFmdp);
		
		paneltop.setLayout(new BoxLayout(paneltop, BoxLayout.X_AXIS));
		panelbot.setLayout(new BoxLayout(paneltop, BoxLayout.X_AXIS));
		
		add(paneltop);
		add(panelbot);
		
		JPanel panelButton = new JPanel();
		panelButton.add(boutonConnexion);
		panelButton.add(boutonInscription);
		panelButton.setLayout(new BoxLayout(panelButton, BoxLayout.X_AXIS));
		
		add(panelButton);
		
		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
	}
	
}
