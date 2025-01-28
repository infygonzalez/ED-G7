package VISTA;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.EventQueue;
import java.awt.Panel;

public class Bienvenida extends JPanel {

	private static final long serialVersionUID = 1L;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bienvenida frame = new Bienvenida();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	/**
	 * Create the panel.
	 */
	
	public Bienvenida() {
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 450, 300);
		add(panel);
		panel.setLayout(null);
		
		JButton botonimg = new JButton("");
		botonimg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CambiarLogin();
			}
		});
		botonimg.setIcon(new ImageIcon("C:\\Users\\in1dm3-a\\Desktop\\ETHAZI GRUPO7\\img\\logo_grupo7.png"));
		botonimg.setBounds(0, 0, 450, 300);
		panel.add(botonimg);
		
		

	}
	private void CambiarLogin() {
		Login login = new Login();
		login.setVisible(true);
		this.setVisible(false);
	}
}
