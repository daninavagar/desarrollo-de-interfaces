package Visual;


import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import Config.Usuarios;

public class Login extends JPanel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	Usuarios fichero = new Usuarios();
	public Tutorias tutoria = new Tutorias();
	public Resumen resumen = new Resumen();
	public Excursiones excursion = new Excursiones();
	JPanel managment_login;
	JLabel lbl_User;
	JLabel lbl_Password;
	JTextField textFieldUser;
	JPasswordField passwordField_user;
	JButton btn_salir;
	JButton btn_logout;
	JButton btn_login;
	JRadioButton radiobtn_excursiones;
	JRadioButton radiobtn_tutorias;

	public Login() {
		
		
		setLayout(null);
		
		lbl_User = new JLabel("USUARIO");
		lbl_User.setBounds(64, 76, 66, 14);
		add(lbl_User);
		
		textFieldUser = new JTextField();
		textFieldUser.setBounds(166, 73, 86, 20);
		add(textFieldUser);
		textFieldUser.setColumns(10);
		
		lbl_Password = new JLabel("CONTRASE�A");
		lbl_Password.setBounds(64, 118, 89, 14);
		add(lbl_Password);
		
		passwordField_user = new JPasswordField();
		passwordField_user.setBounds(166, 115, 86, 20);
		add(passwordField_user);
		
		radiobtn_excursiones = new JRadioButton("Excursiones");
		radiobtn_excursiones.setBounds(34, 179, 96, 23);
		radiobtn_excursiones.setEnabled(false);
		add(radiobtn_excursiones);
		
		radiobtn_tutorias = new JRadioButton("Tutorias");
		radiobtn_tutorias.setBounds(181, 179, 89, 23);
		radiobtn_tutorias.setEnabled(false);
		add(radiobtn_tutorias);
		
		btn_salir = new JButton("SALIR");
		btn_salir.setBounds(10, 228, 89, 23);
		add(btn_salir);
		
		btn_logout = new JButton("LOGOUT");
		btn_logout.setBounds(120, 228, 89, 23);
		add(btn_logout);
		
		btn_login = new JButton("LOGIN");
		btn_login.setBounds(230, 228, 89, 23);
		add(btn_login);
		
		
	}
	
	public JTextField getTextFieldUser() {
		return textFieldUser;
	}
	public void setTextFieldUser(JTextField textFieldUser) {
		this.textFieldUser = textFieldUser;
	}
	public JPasswordField getPasswordField_user() {
		return passwordField_user;
	}
	public void setPasswordField_user(JPasswordField passwordField_user) {
		this.passwordField_user = passwordField_user;
	}
	String name, pwd;
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public boolean compruebaLogin() {
		
		fichero.leerFichero();
		name = textFieldUser.getText();
		pwd = "";
		char list[] = passwordField_user.getPassword();
		for (int i=0; i< list.length; i++)
			pwd += list[i];
		
		
		boolean login = false;
		for (int i=0; i<fichero.getTablaPersona().size();i++) {
			if (fichero.getTablaPersona().get(i).getNombre().equals(name) && fichero.getTablaPersona().get(i).getConstrase�a().equals(pwd)) {
				return true;
			} else {
				login = false;
			}
		}
		return login;
	}
	
	public void muestraPaneles() {
		
		for (int i=0; i<fichero.getTablaPersona().size();i++) {
			if (fichero.getTablaPersona().get(i).getNombre().equals(name) && fichero.getTablaPersona().get(i).getConstrase�a().equals(pwd)) {
				radiobtn_excursiones.setEnabled(true);
				radiobtn_tutorias.setEnabled(true);
				if (name.equals("Tutor")) {
					radiobtn_excursiones.setSelected(true);			
				}		 
			}
	}
	
	}
}
