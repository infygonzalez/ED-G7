package VISTA;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.SystemColor;
import java.awt.GridLayout;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Login extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField textAgencia;
    private JPasswordField textContraseña;
    private String usu = "admingrupo7";
    private String contra = "1234";

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Login frame = new Login();
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
    public Login() {
        setTitle("Login");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 663, 461);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        JPanel panellogin = new JPanel();
        panellogin.setBorder(null);
        panellogin.setBackground(new Color(128, 128, 128));
        panellogin.setBounds(0, 118, 647, 193);
        contentPane.add(panellogin);
        panellogin.setLayout(null);
        
        JLabel lblNewLabel = new JLabel("Nombre agencia:");
        lblNewLabel.setFont(new Font("Century Gothic", Font.PLAIN, 12));
        lblNewLabel.setForeground(Color.WHITE);
        lblNewLabel.setBackground(Color.MAGENTA);
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setBounds(21, 25, 125, 63);
        panellogin.add(lblNewLabel);
        
        textAgencia = new JTextField();
        textAgencia.setBounds(156, 40, 125, 34);
        panellogin.add(textAgencia);
        textAgencia.setColumns(10);
        
        JLabel lblNewLabel_1 = new JLabel("Contraseña:");
        lblNewLabel_1.setFont(new Font("Century Gothic", Font.PLAIN, 12));
        lblNewLabel_1.setForeground(Color.WHITE);
        lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_1.setBackground(new Color(0, 0, 0));
        lblNewLabel_1.setBounds(21, 103, 125, 57);
        panellogin.add(lblNewLabel_1);
        
        textContraseña = new JPasswordField();
        textContraseña.setBounds(156, 115, 125, 34);
        panellogin.add(textContraseña);
        
        JButton btnNewButton = new JButton("Iniciar sesión");
        btnNewButton.setFont(new Font("Century Gothic", Font.PLAIN, 12));
        btnNewButton.addActionListener(new ActionListener() {
        	
        	public void actionPerformed(ActionEvent e) {
        		String usuarioIntroducido = textAgencia.getText();
        		String contraseñaIntroducida = new String (textContraseña.getPassword());
        		if(usu.equals(usuarioIntroducido) && contra.equals(contraseñaIntroducida)) {
        			cambiaraInicioSesion();
        		} else {
        			JOptionPane.showMessageDialog(null, "Las creedenciales no son correctas, vuelva a intentarlo", "WARNING_MESSAGE", JOptionPane.WARNING_MESSAGE);
        		}
        	}
        });
        btnNewButton.setBounds(384, 37, 151, 39);
        panellogin.add(btnNewButton);
        
        JButton btnNewButton_1 = new JButton("Nueva agencia");
        btnNewButton_1.setFont(new Font("Century Gothic", Font.PLAIN, 12));
        btnNewButton_1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		cambiaraNuevaA();
        	}
        });
        btnNewButton_1.setBounds(384, 112, 151, 39);
        panellogin.add(btnNewButton_1);
        
        JLabel lblimg = new JLabel("");
        lblimg.setBounds(0, 0, 647, 422);
        contentPane.add(lblimg);
        lblimg.setIcon(new ImageIcon("imgs/unnamed.jpg"));
     }
    
    public void cambiaraNuevaA() {
        	NuevaAgencia n1 = new NuevaAgencia();
        	n1.setVisible(true);
        	this.setVisible(false);
        }
    public void cambiaraInicioSesion() {
    	ViajesyEventos v1 = new ViajesyEventos();
    	v1.setVisible(true);
    	this.setVisible(false);
    }
 
}