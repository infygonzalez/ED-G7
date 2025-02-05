package VISTA;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import CONTROLADOR.ControladorA;
import Connector.MySqlConnector;

import javax.swing.JLabel;
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
import java.awt.event.ActionEvent;

public class ViajesyEventos extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable tablaviajes;
	private JTable table_1;
	private DefaultTableModel modelotablav;

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
		btnNewButton.setBounds(531, 87, 128, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Nuevo Evento");
		btnNewButton_1.setFont(new Font("Century Gothic", Font.BOLD, 11));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cambiaraNuevoEvento();
			}
		});
		btnNewButton_1.setBounds(531, 268, 128, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Generar Oferta");
		btnNewButton_2.setFont(new Font("Century Gothic", Font.BOLD, 11));
		btnNewButton_2.setBounds(94, 362, 128, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Desconectar");
		btnNewButton_3.setFont(new Font("Century Gothic", Font.BOLD, 11));
		btnNewButton_3.setBounds(350, 362, 128, 23);
		contentPane.add(btnNewButton_3);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(94, 55, 380, 103);
		contentPane.add(scrollPane);
		
		tablaviajes = new JTable();
		scrollPane.setViewportView(tablaviajes);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(95, 228, 380, 103);
		contentPane.add(scrollPane_1);
		
		String[] columnas = {"ID", "IdAgencia", "codPais", "Nombre", "Descripcion", "TipoViaje", "Fecha Ini", "Fecha Fin", "Duracion","PaisDes","ServiciosNoInc"};
		modelotablav = new DefaultTableModel(columnas, 0);
		tablaviajes.setModel(modelotablav);
		table_1 = new JTable();
		scrollPane_1.setViewportView(table_1);
		
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
		modelo.setRowCount(0);
		ArrayList<Pais> paises = ControladorA.mostrarPaises();
		ArrayList<Viaje> viajes = ControladorA.mostrarViajes(paises, agencia);
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
}
