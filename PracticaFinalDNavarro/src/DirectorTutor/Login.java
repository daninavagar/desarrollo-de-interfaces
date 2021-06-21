package DirectorTutor;


import javax.swing.JButton; 
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import Config.Usuarios;
import java.awt.Font;


// import Config.Usuarios;

public class Login extends JPanel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	Usuarios user = new Usuarios();
	
	private JLabel lbl_User;
	private JLabel lbl_Password;
	private JTextField textFieldUser;
	private JPasswordField passwordField_user;
	private JButton btn_salir;
	private JButton btn_logout;
	private JButton btn_login;
	private JRadioButton radiobtn_excursiones;
	private JRadioButton radiobtn_tutorias;
	private String name, pwd;
	private JButton btn_Home;

	public Login() {
		
		
		setLayout(null);
		
		lbl_User = new JLabel("USUARIO");
		lbl_User.setFont(new Font("Tahoma", Font.BOLD, 11));
		lbl_User.setBounds(64, 76, 66, 14);
		add(lbl_User);
		
		textFieldUser = new JTextField();
		textFieldUser.setBounds(179, 73, 86, 20);
		add(textFieldUser);
		textFieldUser.setColumns(10);
		
		lbl_Password = new JLabel("CONTRASEÑA");
		lbl_Password.setFont(new Font("Tahoma", Font.BOLD, 11));
		lbl_Password.setBounds(64, 118, 89, 14);
		add(lbl_Password);
		
		passwordField_user = new JPasswordField();
		passwordField_user.setBounds(179, 115, 86, 20);
		add(passwordField_user);
		
		radiobtn_excursiones = new JRadioButton("Excursiones");
		radiobtn_excursiones.setBounds(64, 153, 96, 23);
		radiobtn_excursiones.setEnabled(false);
		add(radiobtn_excursiones);
		
		radiobtn_tutorias = new JRadioButton("Tutorias");
		radiobtn_tutorias.setBounds(179, 153, 89, 23);
		radiobtn_tutorias.setEnabled(false);
		add(radiobtn_tutorias);
		
		btn_salir = new JButton("SALIR");
		btn_salir.setBounds(64, 183, 78, 23);
		add(btn_salir);
		
		btn_logout = new JButton("LOGOUT");
		btn_logout.setBounds(179, 183, 89, 23);
		add(btn_logout);
		
		btn_login = new JButton("LOGIN");
		btn_login.setBounds(64, 217, 78, 23);
		add(btn_login);
		
		btn_Home = new JButton("INICIO");
		btn_Home.setBounds(179, 217, 89, 23);
		add(btn_Home);
		
		
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

	public JButton getBtn_salir() {
		return btn_salir;
	}

	public JButton getBtn_logout() {
		return btn_logout;
	}

	public JButton getBtn_login() {
		return btn_login;
	}
	public JButton getBtn_Inicio() {
		return btn_Home;
	}

	public JRadioButton getRadiobtn_excursiones() {
		return radiobtn_excursiones;
	}

	public JRadioButton getRadiobtn_tutorias() {
		return radiobtn_tutorias;
	}

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
		
		user.leerFichero();
		name = textFieldUser.getText();
		pwd = "";
		char list[] = passwordField_user.getPassword();
		for (int i=0; i< list.length; i++)
			pwd += list[i];
		
		
		boolean login = false;
		for (int i=0; i<user.getTablaPersona().size();i++) {
			if (user.getTablaPersona().get(i).getNombre().equals(name) && user.getTablaPersona().get(i).getConstrasenia().equals(pwd)) {
				return true;
			} else {
				login = false;
			}
		}
		return login;
	}
	
	public boolean muestraPaneles() {
		
		boolean director = false;
		
		for (int i=0; i<user.getTablaPersona().size();i++) {
			if (user.getTablaPersona().get(i).getNombre().equals(name) && user.getTablaPersona().get(i).getConstrasenia().equals(pwd)) {
				if (name.equals("Tutor")) {
					radiobtn_excursiones.setEnabled(true);
					radiobtn_tutorias.setEnabled(true);
					radiobtn_excursiones.setSelected(true);		
					return true;
				} else {
					director = false;
				} 	 
			}
		}
		return director;
	
	}
}
