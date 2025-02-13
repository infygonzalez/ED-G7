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
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class ViajesyEventos extends JFrame {
	
	//------------------ VARIABLES DE CLASE ---------------------

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable tablaviajes;
	private JTable tablaeventos;
	private DefaultTableModel modelotablav;
	private Viaje viajeseleccionado;
	private static ArrayList<Viaje> viajes = new ArrayList<Viaje>();
	private static ArrayList<Evento> eventos = new ArrayList<Evento>();
	private static ArrayList<Pais> paises = new ArrayList<Pais>();	
	private DefaultTableModel modeloviaje;
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
		Agencia agencia = ControladorA.agenciaSesion;
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
		
		JButton botonoferta = new JButton("Generar Oferta");
		botonoferta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				generarOfertaCliente();
			}
		});
		botonoferta.setFont(new Font("Century Gothic", Font.BOLD, 11));
		botonoferta.setBounds(94, 362, 128, 23);
		contentPane.add(botonoferta);
		
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
		                String idViaje = tablaviajes.getValueAt(row, 6).toString(); 
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
		
		String[] columnas = {"Nombre", "TipoViaje", "Fecha Ini", "Fecha Fin", "Duracion","PaisDes", "idViaje"};
		modelotablav = new DefaultTableModel(columnas, 0);
		tablaviajes.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
					"Nombre", "TipoViaje", "Fecha Ini", "Fecha Fin", "Duracion","PaisDes","idViaje"
			}
		));
		
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
		btnNewButton_4_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int filaSeleccionada = tablaeventos.getSelectedRow();

		        if (filaSeleccionada != -1) { 
		            String idEvento = (String) tablaeventos.getValueAt(filaSeleccionada, 0);
		            ControladorA.borrarEventos(idEvento);

		            DefaultTableModel modelo = (DefaultTableModel) tablaeventos.getModel();
		            modelo.removeRow(filaSeleccionada); 
		        } else {
		            JOptionPane.showMessageDialog(null, "Selecciona un evento para eliminar.");
		        }
			}
		});
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
		modeloviaje = (DefaultTableModel) tablaviajes.getModel();
		paises = ControladorA.mostrarPaises();
		viajes = ControladorA.buscarViajes(paises, agencia);
		
		 System.out.println("Cantidad de viajes encontrados: " + viajes.size());
		    if (viajes.isEmpty()) {
		        System.out.println("No se encontraron viajes para la agencia: " + agencia.getId());
		    }
		modeloviaje.setRowCount(0);
		for(Viaje v : viajes) {
			modeloviaje.addRow(new Object[] {
					v.getNombre(),
					v.getTipo(),
					v.getFechaInc(),
					v.getFechaFin(),
					v.getDuracion(),
					v.getPais().getNombre(),
					v.getId()
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
	
	
	private void generarOfertaCliente() {
	    int filaSeleccionada = tablaviajes.getSelectedRow();
	    if (filaSeleccionada == -1) {
	        JOptionPane.showMessageDialog(null, "Por favor, selecciona un viaje para generar la oferta.");
	        return;
	    }

	    // Obtener los datos del viaje seleccionado
	    String nombreViaje = modeloviaje.getValueAt(filaSeleccionada, 0).toString();
	    String tipoViaje =  modeloviaje.getValueAt(filaSeleccionada, 1).toString();
	    String fechaInicioStr = modeloviaje.getValueAt(filaSeleccionada, 2).toString(); // Fecha como String
	    String fechaFinStr = modeloviaje.getValueAt(filaSeleccionada, 3).toString();   // Fecha como String
	    String paisDestino =  modeloviaje.getValueAt(filaSeleccionada, 5).toString();
	    String idViaje = modeloviaje.getValueAt(filaSeleccionada, 6).toString();

	    SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd"); // Formato de la fecha
	    formato.setLenient(false); // No permite fechas inválidas

	    try {
	        java.util.Date fechaInicioUtil = formato.parse(fechaInicioStr);
	        java.util.Date fechaFinUtil = formato.parse(fechaFinStr);

	        // Convertir a java.sql.Date (opcional si necesitas usar SQL)
	        java.sql.Date fechaInicio = new java.sql.Date(fechaInicioUtil.getTime());
	        java.sql.Date fechaFin = new java.sql.Date(fechaFinUtil.getTime());

	        // Calcular la duración del viaje en días
	        long diff = fechaFin.getTime() - fechaInicio.getTime();
	        int duracion = (int) (diff / (1000 * 60 * 60 * 24)); // Convertir de milisegundos a días

	        // Construir el contenido de la oferta
	        StringBuilder oferta = new StringBuilder();
	        oferta.append("*************************************\n");
	        oferta.append("       *** OFERTA DE VIAJE ***       \n");
	        oferta.append("*************************************\n\n");
	        oferta.append("📌 Nombre del Viaje: " + nombreViaje + "\n");
	        oferta.append("✈ Tipo de Viaje: " + tipoViaje + "\n");
	        oferta.append("📅 Duración: " + duracion + " días\n");
	        oferta.append("📆 Fecha de Inicio: " + fechaInicioStr + "\n");
	        oferta.append("📆 Fecha de Fin: " + fechaFinStr + "\n");
	        oferta.append("🌍 Destino: " + paisDestino + "\n\n");
	        oferta.append("🎭 Eventos incluidos:\n");

	        // Obtener los eventos relacionados con el viaje
	        DefaultTableModel modelEventos = (DefaultTableModel) tablaeventos.getModel();
	        for (int i = 0; i < modelEventos.getRowCount(); i++) {
	            String nombreEvento = (String) modelEventos.getValueAt(i, 1);
	            String tipoEvento = (String) modelEventos.getValueAt(i, 3);
	            double precioEvento = Double.parseDouble(modelEventos.getValueAt(i, 2).toString());
	            oferta.append("   ➤ " + nombreEvento + " (" + tipoEvento + ") - 💰 Precio: " + precioEvento + "€\n");
	        }

	        oferta.append("\n-------------------------------------\n");
	        oferta.append("✅ ¡No dejes pasar esta oportunidad!\n");
	        oferta.append("-------------------------------------\n");

	        try {
	            // Guardar la oferta en un archivo de texto
	            FileWriter writer = new FileWriter("Oferta_" + nombreViaje.replace(" ", "_") + ".txt");
	            writer.write(oferta.toString());
	            writer.close();
	            JOptionPane.showMessageDialog(null, "✅ Oferta generada exitosamente en un archivo de texto.");
	        } catch (IOException e) {
	            JOptionPane.showMessageDialog(null, "❌ Error al generar la oferta: " + e.getMessage());
	            e.printStackTrace();
	        }

	    } catch (ParseException e) {
	        JOptionPane.showMessageDialog(null, "❌ Error al convertir las fechas. Verifica el formato (yyyy-MM-dd).");
	        e.printStackTrace();
	    }
	}

	
	
	
	
}
