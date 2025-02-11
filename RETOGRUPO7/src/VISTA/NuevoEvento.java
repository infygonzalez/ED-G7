package VISTA;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class NuevoEvento extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JComboBox tipoEvento;
	private JPanel alojamiento;
	private JPanel vuelo;
	private JPanel otros;
	private JPanel vueloV;
	private JComboBox tipoTrayecto;
	private JLabel lblAeropuertoO;
	private JLabel lblAeropuertoV;
	private JLabel lblfechaIda;
	private JLabel lblcodV;
	private JLabel lblAero;
	private JLabel lblPrecio;
	private JLabel lblHorario;
	private JLabel lblDuracion;
	private JTextField txtCodV;
	private JTextField txtAero;
	private JTextField txtPrecio;
	private JTextField txtHorario;
	private JTextField txtDuracion;
	private JLabel lblfechaV;
	private JLabel lblcodVueloV;
	private JLabel lblAeroV;
	private JLabel lblprecioT;
	private JLabel lblhorarioV;
	private JLabel lblNewLabel_2;
	private JTextField txtcodVueloV;
	private JTextField txtaeroV;
	private JTextField txtprecioT;
	private JTextField txthorarioV;
	private JTextField txtduracionV;
	private JLabel lblNombreE;
	private JTextField txtNombreE;
	private JLabel lbltipoH;
	private JTextField txtCiudad;
	private JLabel lblPrecioA;
	private JTextField txtPrecioA;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NuevoEvento frame = new NuevoEvento();
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
	
	
	public NuevoEvento() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 703, 461);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nombre viaje");
		lblNewLabel.setBounds(43, 42, 81, 23);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(135, 43, 133, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Tipo de evento");
		lblNewLabel_1.setBounds(42, 76, 72, 14);
		contentPane.add(lblNewLabel_1);
		
		tipoEvento = new JComboBox();
		tipoEvento.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(tipoEvento.getSelectedItem().equals("Vuelo")) {
					panelVuelo(vuelo);
					vuelo.setVisible(true);
				} else {
					vuelo.setVisible(false);
				}
				
				if(tipoEvento.getSelectedItem().equals("Alojamiento")) {
					panelAlojamiento(alojamiento);
					alojamiento.setVisible(true);
				} else {
					alojamiento.setVisible(false);
				}
				
				if(tipoEvento.getSelectedItem().equals("Otros")) {
					panelOtros(otros);
					otros.setVisible(true);
				} else {
					otros.setVisible(false);
				}
			}
		});
		tipoEvento.setModel(new DefaultComboBoxModel(new String[] {"", "Vuelo", "Alojamiento", "Otros"}));
		tipoEvento.setBounds(135, 74, 133, 22);
		contentPane.add(tipoEvento);
		
		
		
		
		vuelo = new JPanel();
		vuelo.setBounds(0, 101, 766, 321);
		contentPane.add(vuelo);
		vuelo.setLayout(null);
		
		JLabel lblTrayecto = new JLabel("Trayecto");
		lblTrayecto.setBounds(42, -11, 66, 44);
		vuelo.add(lblTrayecto);
		
		tipoTrayecto = new JComboBox();
		tipoTrayecto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(tipoTrayecto.getSelectedItem().equals("Ida y Vuelta")) {
					panelVueloVuelta(vueloV);
					vueloV.setVisible(true);
					lblPrecio.setVisible(false);
				} else {
					vueloV.setVisible(false);
					lblPrecio.setVisible(true);
				}
			}
		});
		tipoTrayecto.setModel(new DefaultComboBoxModel(new String[] {"", "Ida", "Ida y Vuelta"}));
		tipoTrayecto.setBounds(135, 0, 133, 22);
		vuelo.add(tipoTrayecto);
		
		JButton btnNewButton_1 = new JButton("Guardar");
		btnNewButton_1.setBounds(180, 287, 126, 23);
		vuelo.add(btnNewButton_1);
		
		lblAeropuertoO = new JLabel("Aeropuerto origen");
		lblAeropuertoO.setBounds(42, 44, 100, 14);
		vuelo.add(lblAeropuertoO);
		
		lblAeropuertoV = new JLabel("Aeropuerto vuelta");
		lblAeropuertoV.setBounds(42, 73, 100, 14);
		vuelo.add(lblAeropuertoV);
		
		lblfechaIda = new JLabel("Fecha Ida");
		lblfechaIda.setBounds(42, 98, 66, 14);
		vuelo.add(lblfechaIda);
		
		lblcodV = new JLabel("Código vuelo");
		lblcodV.setBounds(42, 123, 66, 14);
		vuelo.add(lblcodV);
		
		lblAero = new JLabel("Aerolinea");
		lblAero.setBounds(42, 159, 46, 14);
		vuelo.add(lblAero);
		
		lblPrecio = new JLabel("Precio");
		lblPrecio.setBounds(42, 184, 46, 14);
		vuelo.add(lblPrecio);
		
		lblHorario = new JLabel("Horario salida");
		lblHorario.setBounds(42, 209, 66, 14);
		vuelo.add(lblHorario);
		
		lblDuracion = new JLabel("Duración");
		lblDuracion.setBounds(42, 234, 46, 14);
		vuelo.add(lblDuracion);
		
		txtCodV = new JTextField();
		txtCodV.setBounds(135, 120, 133, 20);
		vuelo.add(txtCodV);
		txtCodV.setColumns(10);
		
		txtAero = new JTextField();
		txtAero.setBounds(135, 156, 133, 20);
		vuelo.add(txtAero);
		txtAero.setColumns(10);
		
		txtPrecio = new JTextField();
		txtPrecio.setBounds(135, 181, 86, 20);
		vuelo.add(txtPrecio);
		txtPrecio.setColumns(10);
		
		txtHorario = new JTextField();
		txtHorario.setBounds(135, 206, 86, 20);
		vuelo.add(txtHorario);
		txtHorario.setColumns(10);
		
		txtDuracion = new JTextField();
		txtDuracion.setBounds(135, 231, 86, 20);
		vuelo.add(txtDuracion);
		txtDuracion.setColumns(10);
		
		vueloV = new JPanel();
		vueloV.setBounds(314,11,371,264);
		vuelo.add(vueloV);
		vueloV.setLayout(null);
		vueloV.setVisible(false);
		
		lblfechaV = new JLabel("Fecha vuelta");
		lblfechaV.setBounds(10, 29, 77, 14);
		vueloV.add(lblfechaV);
		
		lblcodVueloV = new JLabel("Código vuelo");
		lblcodVueloV.setBounds(10, 59, 77, 14);
		vueloV.add(lblcodVueloV);
		
		lblAeroV = new JLabel("Aeorlinea vuelta");
		lblAeroV.setBounds(10, 95, 93, 14);
		vueloV.add(lblAeroV);
		
		lblprecioT = new JLabel("Precio total");
		lblprecioT.setBounds(10, 131, 77, 14);
		vueloV.add(lblprecioT);
		
		lblhorarioV = new JLabel("Horario vuelta");
		lblhorarioV.setBounds(10, 163, 77, 14);
		vueloV.add(lblhorarioV);
		
		lblNewLabel_2 = new JLabel("Duración vuelta");
		lblNewLabel_2.setBounds(10, 191, 77, 14);
		vueloV.add(lblNewLabel_2);
		
		txtcodVueloV = new JTextField();
		txtcodVueloV.setBounds(109, 56, 86, 20);
		vueloV.add(txtcodVueloV);
		txtcodVueloV.setColumns(10);
		
		txtaeroV = new JTextField();
		txtaeroV.setBounds(109, 92, 86, 20);
		vueloV.add(txtaeroV);
		txtaeroV.setColumns(10);
		
		txtprecioT = new JTextField();
		txtprecioT.setBounds(109, 128, 86, 20);
		vueloV.add(txtprecioT);
		txtprecioT.setColumns(10);
		
		txthorarioV = new JTextField();
		txthorarioV.setBounds(109, 160, 86, 20);
		vueloV.add(txthorarioV);
		txthorarioV.setColumns(10);
		
		txtduracionV = new JTextField();
		txtduracionV.setBounds(109, 188, 86, 20);
		vueloV.add(txtduracionV);
		txtduracionV.setColumns(10);
		
		JButton btnNewButton = new JButton("Volver atras");
		btnNewButton.setBounds(459, 286, 126, 23);
		vuelo.add(btnNewButton);
		btnNewButton.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cambiaraViajesyEventos();
			}
		});
		vuelo.setVisible(false);
		
		alojamiento = new JPanel();
		alojamiento.setBounds(0, 101, 687, 321);
		contentPane.add(alojamiento);
		alojamiento.setLayout(null);
		alojamiento.setVisible(false);
		
		
		lblNombreE = new JLabel("Nuevo Evento");
		lblNombreE.setBounds(42, 0, 95, 32);
		alojamiento.add(lblNombreE);
		
		txtNombreE = new JTextField();
		txtNombreE.setBounds(132, 11, 137, 15);
		alojamiento.add(txtNombreE);
		txtNombreE.setColumns(10);
		
		lbltipoH = new JLabel("Tipo de habitación");
		lbltipoH.setBounds(42, 43, 113, 21);
		alojamiento.add(lbltipoH);
		
		JComboBox combotipoH = new JComboBox();
		combotipoH.setModel(new DefaultComboBoxModel(new String[] {"DB", "DUI", "SIN", "TPL"}));
		combotipoH.setBounds(160, 37, 109, 33);
		alojamiento.add(combotipoH);
		
		JLabel lblCIudad = new JLabel("Ciudad");
		lblCIudad.setBounds(42, 71, 95, 32);
		alojamiento.add(lblCIudad);
		
		txtCiudad = new JTextField();
		txtCiudad.setBounds(132, 75, 137, 28);
		alojamiento.add(txtCiudad);
		txtCiudad.setColumns(10);
		
		lblPrecioA = new JLabel("Precio");
		lblPrecioA.setBounds(42, 103, 95, 21);
		alojamiento.add(lblPrecioA);
		
		txtPrecioA = new JTextField();
		txtPrecioA.setBounds(132, 106, 86, 21);
		alojamiento.add(txtPrecioA);
		txtPrecioA.setColumns(10);
		
		
		
		otros = new JPanel();
		otros.setBounds(0, 133, 776, 443);
		contentPane.add(otros);
		otros.setLayout(null);
		otros.setVisible(false);
	}
	public void cambiaraViajesyEventos() {
		ViajesyEventos nuevov = new ViajesyEventos();
		nuevov.setVisible(true);
		this.setVisible(false);
		
	}
	public void panelVuelo(JPanel vuelo) {
		
		
	}
	public void panelVueloVuelta(JPanel vueloV) {
		
	}
public void panelAlojamiento(JPanel alojamiento) {
		
		
	}
public void panelOtros(JPanel otros) {
	
	
}
}
