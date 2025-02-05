package VISTA;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import CONTROLADOR.ControladorA;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import Modelo.*;
import java.awt.Font;

public class NuevaAgencia extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtnombre;
	private JTextField txtColor;
	private Color colorseleccionado;
	private JTextField textField;
	private JLabel lblcontra;
	private JButton botonCancelar;
	private JButton botonguardar;
	private JLabel lbllogo;
	private JComboBox comboBox;
	private JLabel lbltipoA;
	private JComboBox listaemple;
	private JLabel lblnumemple;
	private JPanel panelcolor;
	private JLabel lblcolor;
	private JLabel lblnombre;
	private JTextField txtContra;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NuevaAgencia frame = new NuevaAgencia();
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
	public NuevaAgencia() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 330);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblnombre = new JLabel("Nombre de la agencia:");
		lblnombre.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		lblnombre.setBounds(10, 14, 144, 20);
		contentPane.add(lblnombre);
		
		txtnombre = new JTextField();
		txtnombre.setBounds(157, 14, 151, 20);
		contentPane.add(txtnombre);
		txtnombre.setColumns(10);
		
		lblcolor = new JLabel("Color de marca:");
		lblcolor.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		lblcolor.setBounds(10, 45, 144, 20);
		contentPane.add(lblcolor);
		
		panelcolor = new JPanel();
		panelcolor.setBounds(316, 45, 29, 20);
		contentPane.add(panelcolor);
		panelcolor.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        
		txtColor = new JTextField();
		txtColor.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				String color = txtColor.getText().trim();
				try {
				if(color.matches("#[0-9-fA-F]{6}")) {
					panelcolor.setBackground(Color.decode(color));
				}
				}catch(Exception ignored) {}
			}
		});
		
		txtColor.setBounds(157, 45, 86, 20);
		contentPane.add(txtColor);
		txtColor.setColumns(10);
		
		lblnumemple = new JLabel("Número de empleados:");
		lblnumemple.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		lblnumemple.setBounds(10, 89, 144, 20);
		contentPane.add(lblnumemple);
		
		listaemple = new JComboBox();
		listaemple.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		listaemple.setModel(new DefaultComboBoxModel(new String[] {"Entre 2 y 10 empleados", "Entre 10 y 100 empleados", "Entre 100 y 1000 empleados"}));
		listaemple.setBounds(157, 86, 163, 27);
		contentPane.add(listaemple);
		
		lbltipoA = new JLabel("Tipo de Agencia:");
		lbltipoA.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		lbltipoA.setBounds(10, 127, 144, 20);
		contentPane.add(lbltipoA);
		
		comboBox = new JComboBox();
		comboBox.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"mayorista", "minorista", "mayorista-minorista"}));
		comboBox.setBounds(157, 124, 128, 27);
		contentPane.add(comboBox);
		
		lbllogo = new JLabel("Logo:");
		lbllogo.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		lbllogo.setBounds(10, 171, 144, 20);
		contentPane.add(lbllogo);
		
		textField = new JTextField();
		textField.setBounds(157, 171, 151, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		botonguardar = new JButton("Guardar");
		botonguardar.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		botonguardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				insertarAgencia(txtnombre.getText(), txtColor.getText(), String.valueOf(listaemple.getSelectedItem()), String.valueOf(comboBox.getSelectedItem()), textField.getText(), txtContra.getText() );
				
			}
		});
		botonguardar.setBounds(65, 246, 89, 23);
		contentPane.add(botonguardar);
		
		botonCancelar = new JButton("Cancelar");
		botonCancelar.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		botonCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				volveraInicioSesion();
			}
		});
		botonCancelar.setBounds(256, 246, 89, 23);
		contentPane.add(botonCancelar);
		
		lblcontra = new JLabel("Contraseña:");
		lblcontra.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		lblcontra.setBounds(10, 202, 144, 20);
		contentPane.add(lblcontra);
		
		txtContra = new JTextField();
		txtContra.setBounds(157, 202, 151, 20);
		contentPane.add(txtContra);
		txtContra.setColumns(10);
		
		
	}
	public void volveraInicioSesion() {
		Login lg = new Login();
		lg.setVisible(true);
		this.setVisible(false);
	}
	public void insertarAgencia(String nombre, String color, String empleados, String tipoAgencia, String logo, String contraseña) {
		Agencia a1 = new Agencia();
		a1.setNombre(nombre);
		a1.setLogo(logo);
		a1.setColor(color);
		a1.setEmpleados(empleados);
		a1.setTipoAgencia(tipoAgencia);
		a1.setContraseña(contraseña);
		ControladorA.insertarAgencia(a1);
		
		if (nombre.isEmpty() || color.isEmpty() || logo.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Todos los campos son obligatorios.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if (!color.matches("#[0-9a-fA-F]{6}")) {
            JOptionPane.showMessageDialog(this, "El color debe estar en formato hexadecimal (#RRGGBB).", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
	}
	
}
