package VISTA;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.toedter.calendar.JCalendar;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Calendar;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import com.toedter.calendar.JDateChooser;

import CONTROLADOR.ControladorA;
import Modelo.Aerolinea;
import Modelo.Aeropuerto;
import Modelo.Evento;
import Modelo.Vuelo;

import javax.swing.event.PopupMenuListener;
import javax.swing.event.PopupMenuEvent;

public class NuevoEvento extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtEvento;
	private JDateChooser datecfechIda;
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
	private JLabel lblfecSal;
	private JLabel lblDesc;
	private ControladorA controlador;
	private JTextField txtprecio;
	private JButton btnbuscarViaje;
	private JButton btnBuscarV;
	private JComboBox<String> cmbAeroOrigen;
	private JComboBox <String> cmbAeroVuelta;
	private JComboBox cmbvueloorigenv;
	private JComboBox cmbvuelovuelta;
	private JLabel lblaeroO;
	private JLabel lblaeroV;
	
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
		
		
		JCalendar calendar = new JCalendar();
	    int año = calendar.getCalendar().get(Calendar.YEAR);
	    int mes = calendar.getCalendar().get(Calendar.MONTH);
	    int dia = calendar.getCalendar().get(Calendar.DAY_OF_MONTH);
	    String fecha = dia+"-"+mes+"-"+año;
	    System.out.print(fecha);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 703, 461);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
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
					btnbuscarViaje.setVisible(true);
				} else {
					vueloV.setVisible(false);
					lblPrecio.setVisible(true);
				}
			}
		});
		tipoTrayecto.setModel(new DefaultComboBoxModel(new String[] {"Ida", "Ida y Vuelta"}));
		tipoTrayecto.setBounds(135, 0, 133, 22);
		vuelo.add(tipoTrayecto);
		
		lblAeropuertoO = new JLabel("Aeropuerto origen");
		lblAeropuertoO.setBounds(29, 44, 113, 14);
		vuelo.add(lblAeropuertoO);
		
		lblAeropuertoV = new JLabel("Aeropuerto vuelta");
		lblAeropuertoV.setBounds(29, 73, 113, 14);
		vuelo.add(lblAeropuertoV);
		
		lblfechaIda = new JLabel("Fecha Ida");
		lblfechaIda.setBounds(29, 98, 79, 14);
		vuelo.add(lblfechaIda);
		
		lblcodV = new JLabel("Código vuelo");
		lblcodV.setBounds(29, 123, 79, 25);
		vuelo.add(lblcodV);
		
		lblAero = new JLabel("Aerolinea");
		lblAero.setBounds(29, 159, 59, 14);
		vuelo.add(lblAero);
		
		lblPrecio = new JLabel("Precio");
		lblPrecio.setBounds(29, 184, 59, 14);
		vuelo.add(lblPrecio);
		
		lblHorario = new JLabel("Horario salida");
		lblHorario.setBounds(29, 209, 79, 14);
		vuelo.add(lblHorario);
		
		lblDuracion = new JLabel("Duración");
		lblDuracion.setBounds(29, 234, 59, 14);
		vuelo.add(lblDuracion);
		
		txtCodV = new JTextField();
		txtCodV.setBounds(135, 125, 133, 20);
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
		
		datecfechIda = new JDateChooser();
		datecfechIda.setBounds(135, 98, 133, 20);
		vuelo.add(datecfechIda);
		
		btnbuscarViaje = new JButton("Buscar Viaje");
		btnbuscarViaje.setBounds(503, 81, 140, 55);
		vuelo.add(btnbuscarViaje);
		
		cmbAeroOrigen = new JComboBox<>();
		cmbAeroOrigen.addPopupMenuListener(new PopupMenuListener() {
			public void popupMenuCanceled(PopupMenuEvent e) {
			}
			public void popupMenuWillBecomeInvisible(PopupMenuEvent e) {
			}
			public void popupMenuWillBecomeVisible(PopupMenuEvent e) {
				cargarAeropuertos();
				cargarAeropuertosDestino();
			}
		});
		cmbAeroOrigen.setBounds(135, 40, 133, 22);
		vuelo.add(cmbAeroOrigen);
		
		cmbAeroVuelta = new JComboBox<>();
		cmbAeroVuelta.addPopupMenuListener(new PopupMenuListener() {
			public void popupMenuCanceled(PopupMenuEvent e) {
			}
			public void popupMenuWillBecomeInvisible(PopupMenuEvent e) {
			}
			public void popupMenuWillBecomeVisible(PopupMenuEvent e) {
				cargarAeropuertos();
				cargarAeropuertosDestino();

			}
		});
		cmbAeroVuelta.setBounds(135, 69, 133, 22);
		vuelo.add(cmbAeroVuelta);
		
		vueloV = new JPanel();
		vueloV.setBounds(278,11,407,264);
		vuelo.add(vueloV);
		vueloV.setLayout(null);
		vueloV.setVisible(false);
		
		lblfechaV = new JLabel("Fecha vuelta");
		lblfechaV.setBounds(10, 11, 77, 14);
		vueloV.add(lblfechaV);
		
		lblcodVueloV = new JLabel("Código vuelo");
		lblcodVueloV.setBounds(10, 46, 77, 14);
		vueloV.add(lblcodVueloV);
		
		lblAeroV = new JLabel("Aeorlinea vuelta");
		lblAeroV.setBounds(10, 71, 93, 14);
		vueloV.add(lblAeroV);
		
		lblprecioT = new JLabel("Precio total");
		lblprecioT.setBounds(10, 114, 77, 14);
		vueloV.add(lblprecioT);
		
		lblhorarioV = new JLabel("Horario vuelta");
		lblhorarioV.setBounds(10, 139, 77, 14);
		vueloV.add(lblhorarioV);
		
		lblNewLabel_2 = new JLabel("Duración vuelta");
		lblNewLabel_2.setBounds(10, 174, 77, 14);
		vueloV.add(lblNewLabel_2);
		
		txtcodVueloV = new JTextField();
		txtcodVueloV.setBounds(113, 43, 82, 20);
		vueloV.add(txtcodVueloV);
		txtcodVueloV.setColumns(10);
		
		txtaeroV = new JTextField();
		txtaeroV.setBounds(113, 71, 86, 20);
		vueloV.add(txtaeroV);
		txtaeroV.setColumns(10);
		
		txtprecioT = new JTextField();
		txtprecioT.setBounds(109, 111, 86, 20);
		vueloV.add(txtprecioT);
		txtprecioT.setColumns(10);
		
		txthorarioV = new JTextField();
		txthorarioV.setBounds(109, 136, 86, 20);
		vueloV.add(txthorarioV);
		txthorarioV.setColumns(10);
		
		txtduracionV = new JTextField();
		txtduracionV.setBounds(109, 171, 86, 20);
		vueloV.add(txtduracionV);
		txtduracionV.setColumns(10);
		
		JDateChooser datecfecV = new JDateChooser();
		datecfecV.setBounds(110, 11, 105, 21);
		vueloV.add(datecfecV);
		
		btnBuscarV = new JButton("Buscar Viaje");
		btnBuscarV.setBounds(224, 77, 137, 47);
		vueloV.add(btnBuscarV);
		
		lblaeroO = new JLabel("Aeorpuerto origen");
		lblaeroO.setBounds(10, 199, 93, 25);
		vueloV.add(lblaeroO);
		
		lblaeroV = new JLabel("Aeropuerto vuelta");
		lblaeroV.setBounds(204, 203, 93, 14);
		vueloV.add(lblaeroV);
		
		cmbvueloorigenv = new JComboBox();
		cmbvueloorigenv.addPopupMenuListener(new PopupMenuListener() {
			public void popupMenuCanceled(PopupMenuEvent e) {
			}
			public void popupMenuWillBecomeInvisible(PopupMenuEvent e) {
			}
			public void popupMenuWillBecomeVisible(PopupMenuEvent e) {
				cargarAeropuertosVueltaOrigen();
				cargarAeropuertosVuelta();
			}
		});
		cmbvueloorigenv.setBounds(106, 202, 93, 18);
		vueloV.add(cmbvueloorigenv);
		
		cmbvuelovuelta = new JComboBox();
		cmbvuelovuelta.addPopupMenuListener(new PopupMenuListener() {
			public void popupMenuCanceled(PopupMenuEvent e) {
			}
			public void popupMenuWillBecomeInvisible(PopupMenuEvent e) {
			}
			public void popupMenuWillBecomeVisible(PopupMenuEvent e) {
				cargarAeropuertosVueltaOrigen();
				cargarAeropuertosVuelta();
			}
		});
		cmbvuelovuelta.setBounds(295, 201, 112, 20);
		vueloV.add(cmbvuelovuelta);
		vuelo.setVisible(false);
		
		JLabel lblEvento = new JLabel("Nombre evento");
		lblEvento.setBounds(43, 42, 81, 23);
		contentPane.add(lblEvento);
		
		txtEvento = new JTextField();
		txtEvento.setBounds(135, 43, 133, 20);
		contentPane.add(txtEvento);
		txtEvento.setColumns(10);
		
		JButton btnvolverAtras = new JButton("Volver atras");
		btnvolverAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cambiaraViajesyEventos();
			}
		});
		btnvolverAtras.setBounds(375, 381, 123, 30);
		contentPane.add(btnvolverAtras);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setBounds(151, 381, 99, 30);
		contentPane.add(btnGuardar);
		
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
		
		
		
		otros = new JPanel();
		otros.setBounds(0, 101, 687, 321);
		contentPane.add(otros);
		otros.setLayout(null);
		
		lblDesc = new JLabel("Descripción");
		lblDesc.setBounds(38, 0, 85, 44);
		otros.add(lblDesc);
		
		JTextArea txtDesc = new JTextArea();
		txtDesc.setBounds(133, 11, 145, 47);
		otros.add(txtDesc);
		
		JLabel lblprecio = new JLabel("Precio");
		lblprecio.setBounds(39, 72, 98, 31);
		otros.add(lblprecio);
		
		txtprecio = new JTextField();
		txtprecio.setBounds(135, 65, 129, 39);
		otros.add(txtprecio);
		txtprecio.setColumns(10);
		
		JLabel lblfec = new JLabel("Fecha ");
		lblfec.setBounds(42, 128, 68, 25);
		otros.add(lblfec);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(133, 128, 138, 25);
		otros.add(dateChooser);
		
		alojamiento = new JPanel();
		alojamiento.setBounds(0, 101, 687, 321);
		contentPane.add(alojamiento);
		alojamiento.setLayout(null);
		alojamiento.setVisible(false);
		
		
		lblNombreE = new JLabel("Nuevo Evento");
		lblNombreE.setBounds(42, 0, 95, 32);
		alojamiento.add(lblNombreE);
		
		txtNombreE = new JTextField();
		txtNombreE.setBounds(132, 0, 137, 26);
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
		lblPrecioA.setBounds(42, 103, 95, 24);
		alojamiento.add(lblPrecioA);
		
		txtPrecioA = new JTextField();
		txtPrecioA.setBounds(132, 106, 86, 21);
		alojamiento.add(txtPrecioA);
		txtPrecioA.setColumns(10);
		
		JLabel lblfecEnt = new JLabel("Fecha entrada");
		lblfecEnt.setBounds(37, 141, 86, 32);
		alojamiento.add(lblfecEnt);
		
		lblfecSal = new JLabel("Fecha salida");
		lblfecSal.setBounds(380, 141, 100, 32);
		alojamiento.add(lblfecSal);
		
		JDateChooser datecfecEnt = new JDateChooser();
		datecfecEnt.setBounds(132, 141, 137, 32);
		alojamiento.add(datecfecEnt);
		
		JDateChooser datecfecSal = new JDateChooser();
		datecfecSal.setBounds(496, 141, 113, 32);
		alojamiento.add(datecfecSal);
		
		JButton btnBuscarAlo = new JButton("Buscar Alojamiento");
		btnBuscarAlo.setBounds(358, 60, 148, 47);
		alojamiento.add(btnBuscarAlo);
		otros.setVisible(false);
		
		
	}
	
	public void cambiaraViajesyEventos() {
		ViajesyEventos v1 = new ViajesyEventos();
		v1.setVisible(true);
		this.setVisible(false);
	}
	
	private void cargarAeropuertos() {
		ArrayList<Aeropuerto> aeropuertos = ControladorA.mostrarNombreAeropuerto();
		cmbAeroOrigen.removeAllItems();
		
		for(Aeropuerto aeropuerto : aeropuertos) {
			cmbAeroOrigen.addItem(aeropuerto.getCodigoaero() + "-" + aeropuerto.getNombre());
		}
	}
	private void cargarAeropuertosDestino() {
		ArrayList<Aeropuerto> aeropuertos = ControladorA.mostrarNombreAeropuerto();
		cmbAeroVuelta.removeAllItems();
		
		for(Aeropuerto aeropuerto : aeropuertos) {
			cmbAeroVuelta.addItem(aeropuerto.getCodigoaero() + "-" + aeropuerto.getNombre());
		}
	}
	
	private void cargarAeropuertosVueltaOrigen() {
		ArrayList<Aeropuerto> aeropuertos = ControladorA.mostrarNombreAeropuerto();
		cmbvueloorigenv.removeAllItems();
		
		for(Aeropuerto aeropuerto : aeropuertos) {
			cmbvueloorigenv.addItem(aeropuerto.getCodigoaero() + "-" + aeropuerto.getNombre());
		}
	}
	private void cargarAeropuertosVuelta() {
		ArrayList<Aeropuerto> aeropuertos = ControladorA.mostrarNombreAeropuerto();
		cmbvuelovuelta.removeAllItems();
		
		for(Aeropuerto aeropuerto : aeropuertos) {
			cmbvuelovuelta.addItem(aeropuerto.getCodigoaero() + "-" + aeropuerto.getNombre());
		}
	}
	private void insertarEvento() {
		Evento nuevoEvento = new Evento();
		nuevoEvento.setNombre(txtEvento.getText());
		nuevoEvento.setTipo((String) tipoEvento.getSelectedItem());
		
		String comboresponse = cmbAeroOrigen.getSelectedItem().toString();
		String parte = comboresponse.split("-")[0].trim();
		Aeropuerto a1 = ControladorA.obtenerIdAeropuerto(parte).get(0);
		
	}
	
	private void insertarVueloIda() {
		
		Aeropuerto a1 = new Aeropuerto();
		Aerolinea aero = new Aerolinea();
		

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
