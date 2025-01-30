package VISTA;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.SystemColor;
import java.awt.GridLayout;
import javax.swing.border.LineBorder;

public class Login extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField textField;
    private JPasswordField passwordField;

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
        panellogin.setBounds(0, 127, 647, 193);
        contentPane.add(panellogin);
        panellogin.setLayout(null);
        
        JLabel lblNewLabel = new JLabel("Nombre agencia");
        lblNewLabel.setBackground(Color.MAGENTA);
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setBounds(0, 11, 125, 63);
        panellogin.add(lblNewLabel);
        
        textField = new JTextField();
        textField.setBounds(129, 25, 109, 34);
        panellogin.add(textField);
        textField.setColumns(10);
        
        JLabel lblNewLabel_1 = new JLabel("Contraseña");
        lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_1.setBackground(new Color(0, 0, 0));
        lblNewLabel_1.setBounds(0, 92, 125, 57);
        panellogin.add(lblNewLabel_1);
        
        passwordField = new JPasswordField();
        passwordField.setBounds(129, 102, 109, 34);
        panellogin.add(passwordField);
        
        JButton btnNewButton = new JButton("Iniciar sesión");
        btnNewButton.setBounds(429, 25, 125, 39);
        panellogin.add(btnNewButton);
        
        JButton btnNewButton_1 = new JButton("Nueva agencia");
        btnNewButton_1.setBounds(429, 101, 125, 39);
        panellogin.add(btnNewButton_1);
        
        JLabel labelimg = new JLabel("New label");
        labelimg.setIcon(new ImageIcon("imagenesRETO/IMGlogin.jpg"));
        labelimg.setBounds(0, 0, 647, 422);
        contentPane.add(labelimg);


        

    }
}