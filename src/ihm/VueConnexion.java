package ihm;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class VueConnexion extends JFrame {

	//Vue générale
	public JPanel panelConnexion, panelInscription, container;
	
	//VueConnexion
	public JLabel labelmail, mdp;
	public JTextField txtFmail, txtFmdp;
	public JButton boutonInscription, boutonConnexion;
	
	//VueInscription
	public JLabel prenom, nom, tel, mail, mdp2, vehicule, conduite, comportement;
	public JTextField txtFprenom, txtFnom, txtFtel, txtFmail2, txtFmdp2, txtFvehicule, txtFconduite, txtFcomportement;
	public JButton boutonInscription2;
	
	public VueConnexion() {
		this.panelConnexion = new JPanel();
		this.panelInscription = new JPanel();
		this.container = new JPanel();
		
		//VueConnexion
		JPanel paneltop = new JPanel();
		JPanel panelbot = new JPanel();
		
		this.labelmail = new JLabel("Email: ");
		this.mdp = new JLabel("Mot de passe: ");
		this.txtFmail = new JTextField(10);
		this.txtFmdp = new JTextField(10);
		this.boutonInscription = new JButton();
		this.boutonConnexion = new JButton();
		
		paneltop.add(labelmail);
		paneltop.add(txtFmail);
		panelbot.add(mdp);
		panelbot.add(txtFmdp);
		
		JPanel panelButton = new JPanel();
		panelButton.add(boutonConnexion);
		panelButton.add(boutonInscription);
		panelButton.setLayout(new BoxLayout(panelButton, BoxLayout.X_AXIS));
		
		this.panelConnexion.add(paneltop);
		this.panelConnexion.add(panelbot);
		this.panelConnexion.add(panelButton);
		
		this.panelConnexion.setLayout(new BoxLayout(panelConnexion, BoxLayout.Y_AXIS));
		
		container.add(panelConnexion);
		
		panelConnexion.setVisible(true);
		
		//VueInscription
		this.prenom = new JLabel("Prénom:");
		this.txtFprenom = new JTextField(10);
		this.nom = new JLabel("Nom:");
		this.txtFnom = new JTextField(10);
		this.tel = new JLabel("N° tél:");
		this.txtFtel = new JTextField(10);
		this.mail = new JLabel("Email:");
		this.txtFmail2 = new JTextField(10);
		this.mdp2 = new JLabel("Mot de passe:");
		this.txtFmdp2 = new JTextField(10);
		this.vehicule = new JLabel("Véhicule:");
		this.txtFvehicule = new JTextField(10);
		this.conduite = new JLabel("Type de conduite");
		this.txtFconduite = new JTextField(10);
		this.comportement = new JLabel("Comportement au volant:");
		this.txtFcomportement = new JTextField(10);
		
		this.boutonInscription2 = new JButton();
		
		JPanel panelprenom = new JPanel();
		panelprenom.add(prenom);
		panelprenom.add(txtFprenom);
		
		JPanel panelnom = new JPanel();
		panelnom.add(nom);
		panelnom.add(txtFnom);
		
		JPanel paneltel = new JPanel();
		paneltel.add(tel);
		paneltel.add(txtFtel);
		
		JPanel panelmail = new JPanel();
		panelmail.add(mail);
		panelmail.add(txtFmail2);
		
		JPanel panelmdp2 = new JPanel();
		panelmdp2.add(mdp2);
		panelmdp2.add(txtFmdp2);
		
		JPanel panelvehicule = new JPanel();
		panelvehicule.add(vehicule);
		panelvehicule.add(txtFvehicule);
		
		JPanel panelconduite = new JPanel();
		panelconduite.add(conduite);
		panelconduite.add(txtFconduite);
		
		JPanel panelcomportement = new JPanel();
		panelcomportement.add(comportement);
		panelcomportement.add(txtFcomportement);
		
		this.panelInscription.add(panelprenom);
		this.panelInscription.add(panelnom);
		this.panelInscription.add(paneltel);
		this.panelInscription.add(panelmail);
		this.panelInscription.add(panelmdp2);
		this.panelInscription.add(panelvehicule);
		this.panelInscription.add(panelconduite);
		this.panelInscription.add(panelcomportement);
		this.panelInscription.add(boutonInscription2);
		
		this.panelInscription.setLayout(new BoxLayout(panelInscription, BoxLayout.Y_AXIS));
		container.add(panelInscription);
		
		panelInscription.setVisible(false);
		
		//Frame
		this.add(container);
		this.setTitle("PickMe - Connexion");
		this.setSize(400, 400);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
	
}
