package VISTA;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class NuevoViaje extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NuevoViaje frame = new NuevoViaje();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public NuevoViaje() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton Volveratras = new JButton("Volver atras");
		Volveratras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cambiaraViajesyEventos();
			}
		});
		Volveratras.setBounds(169, 173, 125, 23);
		contentPane.add(Volveratras);
	}

	public void cambiaraViajesyEventos() {
		ViajesyEventos nuevov = new ViajesyEventos();
		nuevov.setVisible(true);
		this.setVisible(false);
		
	}
}
