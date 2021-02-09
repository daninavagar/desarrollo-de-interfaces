package Visual;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Login extends JPanel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
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
		
		lbl_Password = new JLabel("CONTRASEÑA");
		lbl_Password.setBounds(64, 118, 89, 14);
		add(lbl_Password);
		
		passwordField_user = new JPasswordField();
		passwordField_user.setBounds(166, 115, 86, 20);
		add(passwordField_user);
		
		radiobtn_excursiones = new JRadioButton("Excursiones");
		radiobtn_excursiones.setBounds(34, 179, 89, 23);
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
}
