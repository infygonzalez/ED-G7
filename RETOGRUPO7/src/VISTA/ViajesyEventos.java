package VISTA;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

import CONTROLADOR.ControladorA;
import Connector.MySqlConnector;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import Modelo.*;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.sql.Connection;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class ViajesyEventos extends JFrame {
	
	//------------------ VARIABLES DE CLASE ---------------------

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable tablaviajes;
	private JTable tablaeventos;
	private DefaultTableModel modelotablav;
	
	private static ArrayList<Viaje> viajes = new ArrayList<Viaje>();
	private static ArrayList<Evento> eventos = new ArrayList<Evento>();
	private static ArrayList<Pais> paises = new ArrayList<Pais>();	
	// -----------------------------------------------------------

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViajesyEventos frame = new ViajesyEventos();
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
	public ViajesyEventos() {
		Agencia agencia = ControladorA.obtenerAgenciaId("2").get(0);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 703, 461);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("VIAJES");
		lblNewLabel.setFont(new Font("Century Gothic", Font.BOLD, 13));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(252, 30, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("EVENTOS");
		lblNewLabel_1.setFont(new Font("Century Gothic", Font.BOLD, 13));
		lblNewLabel_1.setBounds(252, 203, 59, 14);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Nuevo Viaje");
		btnNewButton.setFont(new Font("Century Gothic", Font.BOLD, 11));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cambiaraNuevoViaje();
			}
		});
		btnNewButton.setBounds(559, 88, 128, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Nuevo Evento");
		btnNewButton_1.setFont(new Font("Century Gothic", Font.BOLD, 11));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cambiaraNuevoEvento();
			}
		});
		btnNewButton_1.setBounds(559, 269, 128, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Generar Oferta");
		btnNewButton_2.setFont(new Font("Century Gothic", Font.BOLD, 11));
		btnNewButton_2.setBounds(94, 362, 128, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Desconectar");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cambiaraLogin();
			}
		});
		btnNewButton_3.setFont(new Font("Century Gothic", Font.BOLD, 11));
		btnNewButton_3.setBounds(350, 362, 128, 23);
		contentPane.add(btnNewButton_3);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(94, 55, 380, 103);
		contentPane.add(scrollPane);
		
		tablaviajes = new JTable();
		scrollPane.setViewportView(tablaviajes);
		tablaviajes.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
		    @Override
		    public void valueChanged(ListSelectionEvent e) {

		        if (!e.getValueIsAdjusting()) {
		            int row = tablaviajes.getSelectedRow();

		            if (row != -1) { 
		                String idViaje = tablaviajes.getValueAt(row, 0).toString(); 
		                String nombreViaje = tablaviajes.getValueAt(row, 3).toString();
		                String descripcion = tablaviajes.getValueAt(row, 4).toString();
		     
		                      
		                ViajesyEventos.eventos = ControladorA.obtenerEventos(Integer.parseInt(idViaje));
		        		cargarEventosEnLaTabla();

		                
		            }
		        }
		    }
		});

		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(95, 228, 380, 103);
		contentPane.add(scrollPane_1);
		
		//**********************************
		
		String[] columnas = {"ID", "IdAgencia", "codPais", "Nombre", "Descripcion", "TipoViaje", "Fecha Ini", "Fecha Fin", "Duracion","PaisDes","ServiciosNoInc"};
		modelotablav = new DefaultTableModel(columnas, 0);
		tablaviajes.setModel(modelotablav);
		
		cargarViajesEnLaTabla(agencia);
		
		//********************************
		
		
		tablaeventos = new JTable();
		scrollPane_1.setViewportView(tablaeventos);
		String[] columnasEventos = {"ID", "Nombre", "Precio", "Tipo"};
		modelotablav = new DefaultTableModel(columnasEventos, 0);
		tablaeventos.setModel(modelotablav);
		
		JButton botoneliminar = new JButton("X");
		botoneliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int filaSeleccionada = tablaviajes.getSelectedRow();

		        if (filaSeleccionada != -1) { 
		            String idViaje = (String) tablaviajes.getValueAt(filaSeleccionada, 0);
		            ControladorA.borrarViajes(idViaje);

		            DefaultTableModel modelo = (DefaultTableModel) tablaviajes.getModel();
		            modelo.removeRow(filaSeleccionada); 
		        } else {
		            JOptionPane.showMessageDialog(null, "Selecciona un viaje para eliminar.");
		        }
			}
		});
		botoneliminar.setBackground(new Color(0, 255, 0));
		botoneliminar.setBounds(484, 88, 51, 38);
		contentPane.add(botoneliminar);
		
		JButton btnNewButton_4_1 = new JButton("X");
		btnNewButton_4_1.setBackground(Color.GREEN);
		btnNewButton_4_1.setBounds(484, 269, 51, 38);
		contentPane.add(btnNewButton_4_1);
		

		
	}
	
	public void cambiaraLogin() {
		Login lg = new Login();
		lg.setVisible(true);
		this.setVisible(false);
	}
	public void cambiaraNuevoViaje(){
		NuevoViaje n = new NuevoViaje();
		n.setVisible(true);
		this.setVisible(false);
	}
	public void cambiaraNuevoEvento() {
		NuevoEvento ne = new NuevoEvento();
		ne.setVisible(true);
		this.setVisible(false);
	}
	
	public void cargarViajesEnLaTabla(Agencia agencia) {
		DefaultTableModel modelo = (DefaultTableModel) tablaviajes.getModel();
		paises = ControladorA.mostrarPaises();
		viajes = ControladorA.buscarViajes(paises, agencia);
		
		 System.out.println("Cantidad de viajes encontrados: " + viajes.size());
		    if (viajes.isEmpty()) {
		        System.out.println("No se encontraron viajes para la agencia: " + agencia.getNombre());
		    }
		modelo.setRowCount(0);
		for(Viaje v : viajes) {
			modelo.addRow(new Object[] {
					v.getId(),
					v.getAgencia().getNombre(),
					v.getPais().getCodPais(),
					v.getNombre(),
					v.getDescrip(),
					v.getTipo(),
					v.getFechaInc(),
					v.getFechaFin(),
					v.getDuracion(),
					v.getPais().getNombre()
			});
		}
	}
	
	public void cargarEventosEnLaTabla() {
		 System.out.println("Cantidad de eventos encontrados: " + eventos.size());
		    if (eventos.isEmpty()) {
		        System.out.println("No se encontraron eventos");
		    }
		DefaultTableModel modelo = (DefaultTableModel) tablaeventos.getModel();
		modelo.setRowCount(0);
		for(Evento v : eventos) {
			modelo.addRow(new Object[] {
					v.getId(),
					v.getNombre(),
					v.getPrecio(),
					v.getTipo(),
			});
		}
	}
}
