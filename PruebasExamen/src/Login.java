import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import Users.Ficheros;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class Login extends JPanel{
	
	
	private JLabel labelTitulo;
	private JTextField textField_Name;
	private JPasswordField passwordField;
	private JButton botonLogin;
	
	private Ficheros fichero = new Ficheros();
	public Login() {
		setBounds(100, 100, 450, 300);
		setLayout(null);
		
		labelTitulo = new JLabel("Nombre");
		labelTitulo.setFont(new Font("Verdana", Font.BOLD, 11));
		labelTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		labelTitulo.setBounds(88, 72, 79, 28);
		add(labelTitulo);
		
		JLabel lblC = new JLabel("Contraseña");
		lblC.setHorizontalAlignment(SwingConstants.CENTER);
		lblC.setFont(new Font("Verdana", Font.BOLD, 11));
		lblC.setBounds(88, 123, 79, 28);
		add(lblC);
		
		textField_Name = new JTextField();
		textField_Name.setBounds(208, 77, 117, 20);
		add(textField_Name);
		textField_Name.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setEchoChar('*');
		passwordField.setBounds(208, 128, 117, 20);
		add(passwordField);
		
		botonLogin = new JButton("Login");
		botonLogin.setBounds(160, 180, 89, 23);
		add(botonLogin);
	}
	
	public JTextField getTextField_Name() {
		return textField_Name;
	}
	public JPasswordField getPasswordField() {
		return passwordField;
	}
	public JButton getBotonLogin() {
		return botonLogin;
	}
	
	public boolean compruebaLogin() {
		
		boolean login = true;
		fichero.leerFichero();
		String name = textField_Name.getText();
		String pwd = "";
		char[] aux = passwordField.getPassword();
		for (int i=0; i<aux.length; i++)
			pwd += aux[i];
		
		
		for (int i=0; i<fichero.getTablaUsuario().size(); i++) {
			
			if (name.equals(fichero.getTablaUsuario().get(i).getNombre()) && pwd.equals(fichero.getTablaUsuario().get(i).getContraseña()) )
				return true;
			else 
				login = false;
				
		}
		return login;
		
		
	}
	
}
