package VISTA;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SpinnerDateModel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

import java.util.ArrayList;
import java.util.Date;
import javax.swing.event.ChangeListener;

import CONTROLADOR.ControladorA;
import Modelo.Pais;

import javax.swing.event.ChangeEvent;
import javax.swing.event.PopupMenuListener;
import javax.swing.event.PopupMenuEvent;
import javax.swing.JTextArea;

public class NuevoViaje extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtViaje;
	private JSpinner fechaInicio;
	private JSpinner fechaFin;
	private JTextField txtDias;
	private JComboBox <String> comboBoxPais;

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
		setBounds(100, 100, 703, 461);
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
		Volveratras.setBounds(447, 215, 125, 23);
		contentPane.add(Volveratras);
		
		JLabel lblNombreViaje = new JLabel("Nombre viaje");
		lblNombreViaje.setBounds(46, 11, 85, 31);
		contentPane.add(lblNombreViaje);
		
		JLabel lblTipoDeViaje = new JLabel("Tipo de viaje");
		lblTipoDeViaje.setBounds(46, 53, 85, 31);
		contentPane.add(lblTipoDeViaje);
		
		JLabel lblInicioViaje = new JLabel("Inicio viaje");
		lblInicioViaje.setBounds(46, 95, 85, 31);
		contentPane.add(lblInicioViaje);
		fechaInicio = new JSpinner(new SpinnerDateModel());
		
		
        fechaInicio.setEditor(new JSpinner.DateEditor(fechaInicio, "dd/MM/yyyy"));
        fechaInicio.setBounds(141, 98, 200, 25);
        fechaInicio.setValue(new Date());
		
		
		JLabel lblFinViaje = new JLabel("Fin viaje");
		lblFinViaje.setBounds(46, 137, 85, 31);
		contentPane.add(lblFinViaje);
		fechaFin = new JSpinner(new SpinnerDateModel());
        fechaFin.setEditor(new JSpinner.DateEditor(fechaFin, "dd/MM/yyyy"));
        fechaFin.setBounds(141, 140, 200, 25);
        fechaFin.setValue(new Date());
        
		JLabel lblDias = new JLabel("Días");
		lblDias.setBounds(46, 172, 85, 31);
		contentPane.add(lblDias);
		
		JLabel lblPas = new JLabel("País");
		lblPas.setBounds(46, 211, 85, 31);
		contentPane.add(lblPas);
		
		comboBoxPais = new JComboBox<>();
	    comboBoxPais.setBounds(141, 214, 109, 25);
	    contentPane.add(comboBoxPais);
		
		JLabel lblDescripcin = new JLabel("Descripción");
		lblDescripcin.setBounds(46, 256, 85, 31);
		contentPane.add(lblDescripcin);
		
		JLabel lblServiciosNoInc = new JLabel("Servicios no inc.");
		lblServiciosNoInc.setBounds(46, 331, 85, 31);
		contentPane.add(lblServiciosNoInc);
		
		txtViaje = new JTextField();
		txtViaje.setBounds(141, 16, 125, 20);
		contentPane.add(txtViaje);
		txtViaje.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Novios", "Senior", "Grupos", "Grandes Viajes (destinos exóticos)", "Combinado (vuelo + hotel)", "Escapadas", "Familias con niños menores"}));
		comboBox.setBounds(141, 57, 125, 22);
		contentPane.add(comboBox);
		
		txtDias = new JTextField();
		txtDias.setBounds(141, 177, 86, 20);
		txtDias.setEditable(false);
		contentPane.add(txtDias);
		txtDias.setColumns(10);
		
		
		
		
		fechaInicio.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				calculoDias();
			}
		});
		
		fechaFin.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				calculoDias();
			}
		});
		
		comboBoxPais.addPopupMenuListener(new PopupMenuListener() {
			public void popupMenuCanceled(PopupMenuEvent e) {
			}
			public void popupMenuWillBecomeInvisible(PopupMenuEvent e) {
			}
			public void popupMenuWillBecomeVisible(PopupMenuEvent e) {
				cargarPais();
			}
		});
		
		
		
		contentPane.add(fechaInicio);
		contentPane.add(fechaFin);
		
		JTextArea textDesc = new JTextArea();
		textDesc.setBounds(141, 259, 166, 64);
		contentPane.add(textDesc);
		
		JTextArea textServ = new JTextArea();
		textServ.setBounds(141, 334, 166, 64);
		contentPane.add(textServ);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setBounds(447, 141, 125, 23);
		contentPane.add(btnGuardar);
	}

	
	private void calculoDias() {
		Date inicio = (Date) fechaInicio.getValue();
		Date fin = (Date) fechaFin.getValue();
		if(inicio != null && fin != null) {
			
			if(fin.before(inicio)) {
				JOptionPane.showMessageDialog(null, "La fecha fin tiene que ser posterior a la de inicio");
				return;
			}
			
		//Hacemos una conversion a milisegundos para poder obtener la fecha y restarla
			long diferenciaMilisegundos = fin.getTime() - inicio.getTime();
			long diferenciaDias = diferenciaMilisegundos / (1000 * 60 * 60 * 24);
			txtDias.setText(String.valueOf(diferenciaDias));
		}
	}
	public void cambiaraViajesyEventos() {
		ViajesyEventos nuevov = new ViajesyEventos();
		nuevov.setVisible(true);
		this.setVisible(false);
	}
	
	private void cargarPais() {
		ArrayList<Pais> paises = ControladorA.mostrarNombrePais();
		
		comboBoxPais.removeAllItems();
		
		for(Pais pais : paises) {
			comboBoxPais.addItem(pais.getNombre());
		}
	}
}