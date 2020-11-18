package Practica;

import java.awt.EventQueue; 
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.JProgressBar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.swing.JPasswordField;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.UIManager;
import java.awt.Color;

public class Main {

	private JFrame frame;
	private Timer tiempo = null;
	private int cont = 0;
	private JLabel Lbl_Espere;
	private JProgressBar BarraProgreso;
	private JLabel Label_Login;
	private JLabel Label_Usuario;
	private JLabel Label_passwd;
	private JPasswordField passwordField;
	private JTextField textField_Login;
	private JLabel lblNewLabel_titulo_opciones;
	private JButton btnConfigurar;
	private JButton btnNoticiasAntiguas;
	private JButton Boton_exit;
	

	
	JPanel panel_carga;
	JPanel panel_login;
	JPanel panel_opciones;
	JPanel panel_Noti_Actual;
	JPanel panel_config;
	JPanel panel_Noti_Antigua;
	private JButton Btn_Volver_Noti_Actuales;
	private JButton btn_Guardar_Actual;
	private JButton btn_SALIR_Act;
	private JButton btnVolver_Config;
	private JButton btn_VOLVER_Antigua;
	private JButton btnSalir;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main() {
		initialize();
				tiempo = new Timer(50, (ActionListener) new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
				
					cont++;
					BarraProgreso.setValue(cont);
					if (BarraProgreso.getValue() < 10) {
						BarraProgreso.setValue(BarraProgreso.getValue() + 1);
					}	
					if (BarraProgreso.getValue() == 100) {
						frame.setEnabled(true);
						panel_carga.setVisible(false);
						panel_login.setVisible(true);	
					}					
				}
			});
			tiempo.start();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setEnabled(false);
		frame.setResizable(false);
		frame.setTitle("NOTICIAS CON USUARIOS");
		frame.setBounds(100, 100, 655, 511);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("./src/Image/icon.png"));
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		frame.setLocationRelativeTo(null);
		
		
		// CARGA
		panel_carga = new JPanel() {
			
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			public void paintComponent(Graphics g) {
				super.paintComponent(g);
				Image prueba = null;
				try {
					prueba = ImageIO.read(new File("./src/Image/fondo.jpg"));
				} catch (IOException e) {
					e.printStackTrace();
				}
				g.drawImage(prueba, 0, 100, null);
			}
		};
		frame.getContentPane().add(panel_carga, "name_436516145438100");
		panel_carga.setLayout(null);
		
		Lbl_Espere = new JLabel();
		Lbl_Espere.setBounds(265, 379, 118, 55);
		Lbl_Espere.setHorizontalAlignment(SwingConstants.CENTER);
		Lbl_Espere.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		Lbl_Espere.setText("ESPERE ...");
		panel_carga.add(Lbl_Espere);
		
		BarraProgreso = new JProgressBar();
		BarraProgreso.setForeground(Color.BLUE);
		BarraProgreso.setValue(100);
		BarraProgreso.setStringPainted(true);
		BarraProgreso.setBounds(134, 445, 381, 26);
		panel_carga.add(BarraProgreso);
		
		panel_carga.setVisible(true);
		
		// LOGIN
		panel_login = new JPanel();
		panel_login.setToolTipText("Pulsa Aqu\u00ED para Iniciar Sesi\u00F3n");
		frame.getContentPane().add(panel_login, "name_436592091527600");
		panel_login.setLayout(null);
		
		Label_Login = new JLabel();
		Label_Login.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 21));
		Label_Login.setHorizontalAlignment(SwingConstants.CENTER);
		Label_Login.setText("LOGIN");
		Label_Login.setBounds(200, 69, 217, 38);
		panel_login.add(Label_Login);
		
		Label_Usuario = new JLabel();
		Label_Usuario.setText("USUARIO");
		Label_Usuario.setBounds(179, 228, 86, 20);
		panel_login.add(Label_Usuario);
		
		Label_passwd = new JLabel();
		Label_passwd.setText("CONTRASE\u00D1A");
		Label_passwd.setBounds(179, 297, 86, 20);
		panel_login.add(Label_passwd);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(384, 279, 108, 38);
		panel_login.add(passwordField);
		
		textField_Login = new JTextField();
		textField_Login.setBounds(384, 219, 108, 38);
		panel_login.add(textField_Login);
		textField_Login.setColumns(10);
		
		JMenuBar menuBar = new JMenuBar();
		panel_login.add(menuBar);
		
		
		JMenuItem infoMenu = new JMenuItem("Acerca de");
		infoMenu.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_login.add(infoMenu);
		
		infoMenu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(null, "Hecho por Daniel Navarro\n daninavagar@gmail.com");
			}
		});
		infoMenu.setBounds(0, 0, 103, 26);
		
		JMenu Menu = new JMenu("?");
		panel_login.add(Menu);
		
		JButton Boton_Login = new JButton("INICIAR SESI\u00D3N");
		Boton_Login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				tiempo.stop();
				panel_login.setVisible(false);
				panel_opciones.setVisible(true);
			}
		});
	
		Boton_Login.setBounds(239, 364, 154, 49);
		panel_login.add(Boton_Login);
		
		
		// OPCIONES
		panel_opciones = new JPanel();
		frame.getContentPane().add(panel_opciones, "name_436732982280100");
		panel_opciones.setLayout(null);
		
		lblNewLabel_titulo_opciones = new JLabel("OPCIONES");
		lblNewLabel_titulo_opciones.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_titulo_opciones.setBounds(236, 11, 176, 28);
		panel_opciones.add(lblNewLabel_titulo_opciones);
		
		JButton btnNewButton = new JButton("NOTICIAS ACTUALES");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_opciones.setVisible(false);
				panel_Noti_Actual.setVisible(true);
			}
		});
		btnNewButton.setToolTipText("Muestra las Noticias Actuales");
		btnNewButton.setBorder(UIManager.getBorder("Button.border"));
		btnNewButton.setBounds(63, 50, 165, 63);
		panel_opciones.add(btnNewButton);
		
		btnConfigurar = new JButton("CONFIGURAR");
		btnConfigurar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_opciones.setVisible(false);
				panel_config.setVisible(true);
			}
		});
		btnConfigurar.setToolTipText("Configura aqu\u00ED tu usuario");
		btnConfigurar.setBounds(269, 50, 111, 63);
		panel_opciones.add(btnConfigurar);
		
		btnNoticiasAntiguas = new JButton("NOTICIAS ANTIGUAS");
		btnNoticiasAntiguas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_opciones.setVisible(false);
				panel_Noti_Antigua.setVisible(true);
			}
		});
		btnNoticiasAntiguas.setToolTipText("Muestra las Noticias Antiguas");
		btnNoticiasAntiguas.setBounds(427, 50, 165, 63);
		panel_opciones.add(btnNoticiasAntiguas);
		
		Boton_exit = new JButton("SALIR");
		Boton_exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (JOptionPane.showConfirmDialog(null, "Seguro que quieres salir", "SALIR", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
					System.exit(0);
			}
		});
		Boton_exit.setBounds(550, 448, 89, 23);
		panel_opciones.add(Boton_exit);
		
		// NOTICIAS ACTUALES
		panel_Noti_Actual = new JPanel();
		frame.getContentPane().add(panel_Noti_Actual, "name_436736576524500");
		panel_Noti_Actual.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("NOTICIAS ACTUALES");
		lblNewLabel.setFont(new Font("Yu Gothic Medium", Font.BOLD | Font.ITALIC, 22));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(187, 11, 274, 43);
		panel_Noti_Actual.add(lblNewLabel);
		
		Btn_Volver_Noti_Actuales = new JButton("VOLVER");
		Btn_Volver_Noti_Actuales.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_Noti_Actual.setVisible(false);
				panel_opciones.setVisible(true);
			}
		});
		Btn_Volver_Noti_Actuales.setBounds(181, 448, 89, 23);
		panel_Noti_Actual.add(Btn_Volver_Noti_Actuales);
		
		btn_Guardar_Actual = new JButton("GUARDAR");
		btn_Guardar_Actual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn_Guardar_Actual.setBounds(280, 448, 89, 23);
		panel_Noti_Actual.add(btn_Guardar_Actual);
		
		btn_SALIR_Act = new JButton("SALIR");
		btn_SALIR_Act.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(JOptionPane.showConfirmDialog(null, "Estas seguro que quieres salir", "SALIR", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
					System.exit(0);
			}
		});
		btn_SALIR_Act.setBounds(379, 448, 89, 23);
		panel_Noti_Actual.add(btn_SALIR_Act);
		
		
		// CONFIGURACIÓN
		panel_config = new JPanel();
		frame.getContentPane().add(panel_config, "name_466237784580100");
		panel_config.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("CONFIGURACION");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(177, 11, 295, 74);
		panel_config.add(lblNewLabel_1);
		
		btnVolver_Config = new JButton("VOLVER");
		btnVolver_Config.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_config.setVisible(false);
				panel_opciones.setVisible(true);
			}
		});
		btnVolver_Config.setBounds(512, 440, 94, 31);
		panel_config.add(btnVolver_Config);
		
		// NOTICIA ANTIGUA
		panel_Noti_Antigua = new JPanel();
		frame.getContentPane().add(panel_Noti_Antigua, "name_466307685362600");
		panel_Noti_Antigua.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("NOTICIAS ANTIGUAS");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(178, 11, 292, 81);
		panel_Noti_Antigua.add(lblNewLabel_2);
		
		btn_VOLVER_Antigua = new JButton("VOLVER");
		btn_VOLVER_Antigua.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_Noti_Antigua.setVisible(false);
				panel_opciones.setVisible(true);
			}
		});
		btn_VOLVER_Antigua.setBounds(178, 448, 89, 23);
		panel_Noti_Antigua.add(btn_VOLVER_Antigua);
		
		btnSalir = new JButton("SALIR");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(JOptionPane.showConfirmDialog(null, "Estas seguro que quieres salir", "SALIR", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
					System.exit(0);
			}
		});
		btnSalir.setBounds(381, 448, 89, 23);
		panel_Noti_Antigua.add(btnSalir);
	}
}
