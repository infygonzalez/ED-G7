package VISTA;

import javax.swing.JPanel;
import javax.swing.JLabel;

public class Login extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public Login() {
		setLayout(null);
		
		JPanel VentanaLogin = new JPanel();
		VentanaLogin.setBounds(0, 0, 450, 300);
		add(VentanaLogin);
		VentanaLogin.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ha funcionado");
		lblNewLabel.setBounds(98, 98, 166, 91);
		VentanaLogin.add(lblNewLabel);

	}
}
