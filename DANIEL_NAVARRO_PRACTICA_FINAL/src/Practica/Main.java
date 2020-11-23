package Practica;

import java.awt.EventQueue;   

import java.awt.Font;
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


import javax.swing.JPasswordField;

import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.UIManager;



import java.awt.Color;


import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
public class Main {

	private JFrame frame;
	private Timer tiempo = null;
	private int cont = 0;
	private JLabel Lbl_Espere;
	private JLabel lblFondo;
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
	private JButton Btn_Volver_Noti_Actuales;
	private JButton btn_Guardar_Actual;
	private JButton btn_SALIR_Act;
	private JButton btn_VOLVER_Antigua;
	private JButton btnSalir;
	
	
	
	JPanel panel_carga;
	JPanel panel_login;
	JPanel panel_opciones;
	JPanel panel_Noti_Actual;
	JPanel panel_config;
	JPanel panel_Noti_Antigua;
	
	
	
	String pwd;
	String name_user;
	boolean save_config = true;
	

	public String getName_user() {
		return name_user;
	}

	public void setName_user(String name_user) {
		this.name_user = name_user;
	}

	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	
	private JLabel lblNewLabel_1;
	private JButton btnVolver_Config;
	private JCheckBox check_Economia;
	private JCheckBox check_Nacional;
	private JCheckBox check_Internacional;
	private JCheckBox check_Deportes;
	private JCheckBox check1_deportes;
	private JCheckBox check2_deportes;
	private JCheckBox check3_deportes;
	private JCheckBox check4_deportes;
	private JCheckBox check1_economia;
	private JCheckBox check2_economia;
	private JCheckBox check3_economia;
	private JCheckBox check4_economia;
	private JCheckBox check1_nacional;
	private JCheckBox check2_nacional;
	private JCheckBox check3_nacional;
	private JCheckBox check4_nacional;
	private JCheckBox check1_internacional;
	private JCheckBox check2_internacional;
	private JCheckBox check3_internacional;
	private JCheckBox check4_internacional;
	private JButton btnGuardar_Config_1;
	
	
	
	public String[] opc = new String[17];
	public String[] config = new String[16];
	ArrayList<Config> user_configtabla = new ArrayList<Config>();
	ArrayList<Config> tablita;
	
	
	String user_unique;
	Files file_class = new Files();
	Config config_class;
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
	 * @throws IOException 
	 */
	public Main() throws IOException {
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
						if (file_class.fileChecks() || !file_class.passwdchecks()) {
							JOptionPane.showMessageDialog(null, "! Vaya ¡ Algo ha pasado, seguramente han fallado los archivos o las constrseñas estan mal");
							tiempo.stop();
							frame.dispose();
						}
						
						frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
	
	
	
	
	public void get_Pwd() {
		
		
		pwd = "";
		
		char list[]  = getPasswordField().getPassword();
		
		for (int i=0; i<list.length; i++) {
			pwd += list[i];
		}
		name_user = getTextField_Login().getText();
	}
	
	public boolean checkLogin() {
		boolean login = false;
		
		for (int i=0; i<file_class.getTablaPersona().size(); i++) {
				if (file_class.getTablaPersona().get(i).getName_user().equals(name_user) && file_class.getTablaPersona().get(i).getPwd_user().equals(pwd)) {
					return true;
					
				} else {
					login = false;
					
				}
		}	
		return login;
	}
	
	public boolean checkCategorySport() {
		boolean Cate = true;
		
		if (check_Deportes.isSelected()) {
			check1_deportes.setEnabled(true);
			check2_deportes.setEnabled(true);
			check3_deportes.setEnabled(true);
			check4_deportes.setEnabled(true);
			return Cate;
		} else {
			check1_deportes.setEnabled(false);
			check1_deportes.setSelected(false);
			check2_deportes.setEnabled(false);
			check2_deportes.setSelected(false);
			check3_deportes.setEnabled(false);
			check3_deportes.setSelected(false);
			check4_deportes.setEnabled(false);
			check4_deportes.setSelected(false);
			Cate = false;
		}
		
		return Cate;
	}
	public boolean checkCategoryNational() {
		boolean Cate = true;
		
		if (check_Nacional.isSelected()) {
			check1_nacional.setEnabled(true);
			check2_nacional.setEnabled(true);
			check3_nacional.setEnabled(true);
			check4_nacional.setEnabled(true);
			return Cate;
		} else {
			check1_nacional.setEnabled(false);
			check1_nacional.setSelected(false);
			check2_nacional.setEnabled(false);
			check2_nacional.setSelected(false);
			check3_nacional.setEnabled(false);
			check3_nacional.setSelected(false);
			check4_nacional.setEnabled(false);
			check4_nacional.setSelected(false);
			Cate = false;
		}
		
		return Cate;
	}
	public boolean checkCategoryInternational() {
		boolean Cate = true;
		
		if (check_Internacional.isSelected()) {
			check1_internacional.setEnabled(true);
			check2_internacional.setEnabled(true);
			check3_internacional.setEnabled(true);
			check4_internacional.setEnabled(true);
			return Cate;
		} else {
			check1_internacional.setEnabled(false);
			check1_internacional.setSelected(false);
			check2_internacional.setEnabled(false);
			check2_internacional.setSelected(false);
			check3_internacional.setEnabled(false);
			check3_internacional.setSelected(false);
			check4_internacional.setEnabled(false);
			check4_internacional.setSelected(false);
			Cate = false;
		}
		
		return Cate;
	}
	public boolean checkCategoryEconomy() {
		boolean Cate = true;
		
		if (check_Economia.isSelected()) {
			check1_economia.setEnabled(true);
			check2_economia.setEnabled(true);
			check3_economia.setEnabled(true);
			check4_economia.setEnabled(true);
			return Cate;
		} else {
			check1_economia.setEnabled(false);
			check1_economia.setSelected(false);
			check2_economia.setEnabled(false);
			check2_economia.setSelected(false);
			check3_economia.setEnabled(false);
			check3_economia.setSelected(false);
			check4_economia.setEnabled(false);
			check4_economia.setSelected(false);
			Cate = false;
		}
		
		return Cate;
	}
	
	private void initialize() throws IOException {
		frame = new JFrame();
		frame.setEnabled(true);
		frame.setResizable(false);
		frame.setTitle("NOTICIAS CON USUARIOS");
		frame.setBounds(100, 100, 655, 511);
		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("./src/Image/icon.png"));
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		frame.setLocationRelativeTo(null);

		
		
		
		// CARGA
		panel_carga = new JPanel();
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
		
		
		BufferedImage img = ImageIO.read(new File(("./src/Image/fondo.jpg")));
		lblFondo = new JLabel(new ImageIcon(img));
		lblFondo.setBounds(0, 0, 649, 482);
		lblFondo.setOpaque(true);
		panel_carga.add(lblFondo);
		
		
		
		
		
		panel_carga.setVisible(true);
		if (BarraProgreso.getValue() == 50) {
			Files file_class = new Files();
			// readConfigFile();
			if (file_class.fileChecks()) {
				JOptionPane.showMessageDialog(null, "! Vaya ¡ Algo ha pasado, seguramente han fallado los archivos");
				tiempo.stop();
				frame.dispose();
			}
		}
		
		
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
		
		setPasswordField(new JPasswordField());
		getPasswordField().setBounds(384, 279, 108, 38);
		panel_login.add(getPasswordField());
		
		setTextField_Login(new JTextField());
		getTextField_Login().setBounds(384, 219, 108, 38);
		panel_login.add(getTextField_Login());
		getTextField_Login().setColumns(10);
		
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
				file_class.readUser();
				get_Pwd();
				
				if (!checkLogin()) {
					JOptionPane.showInternalMessageDialog(null, "Login/Contraseña Incorrecta");
				}  else {
					readConfigFile();
					if (config_class.getUser_conf().equals(pwd)) {
						panel_login.setVisible(false);
						panel_opciones.setVisible(true);
					} else {
						panel_login.setVisible(false);
						panel_config.setVisible(true);
					}
					
				}
				
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
		Btn_Volver_Noti_Actuales.setBounds(175, 448, 95, 23);
		panel_Noti_Actual.add(Btn_Volver_Noti_Actuales);
		
		btn_Guardar_Actual = new JButton("GUARDAR");
		btn_Guardar_Actual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// readConfigFile();
			}
		});
		btn_Guardar_Actual.setBounds(277, 448, 95, 23);
		panel_Noti_Actual.add(btn_Guardar_Actual);
		
		btn_SALIR_Act = new JButton("SALIR");
		btn_SALIR_Act.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(JOptionPane.showConfirmDialog(null, "Estas seguro que quieres salir", "SALIR", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
					System.exit(0);
			}
		});
		btn_SALIR_Act.setBounds(379, 448, 95, 23);
		panel_Noti_Actual.add(btn_SALIR_Act);
		
		
		
		
		// CONFIGURACIÓN
		panel_config = new JPanel();
		frame.getContentPane().add(panel_config, "name_466237784580100");
		panel_config.setLayout(null);
		
		lblNewLabel_1 = new JLabel("CONFIGURACION");
		lblNewLabel_1.setBounds(0, 0, 649, 71);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 21));
		panel_config.add(lblNewLabel_1);
		
		btnVolver_Config = new JButton("VOLVER");
		btnVolver_Config.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_config.setVisible(false);
				panel_opciones.setVisible(true);
			}
		});
		btnVolver_Config.setBounds(330, 412, 107, 48);
		panel_config.add(btnVolver_Config);
		
		
		
		check_Economia = new JCheckBox("ECONOM\u00CDA");
		check_Economia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkCategoryEconomy();
			}
		});
		check_Economia.setVerticalAlignment(SwingConstants.TOP);
		check_Economia.setHorizontalAlignment(SwingConstants.CENTER);
		check_Economia.setBounds(10, 247, 300, 29);
		panel_config.add(check_Economia);
		
		check_Nacional = new JCheckBox("NACIONAL");
		check_Nacional.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkCategoryNational();
			}
		});
		check_Nacional.setHorizontalAlignment(SwingConstants.CENTER);
		check_Nacional.setVerticalAlignment(SwingConstants.TOP);
		check_Nacional.setBounds(320, 82, 319, 29);
		panel_config.add(check_Nacional);
		
		check_Internacional = new JCheckBox("INTERNACIONAL");
		check_Internacional.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkCategoryInternational();
			}
		});
		check_Internacional.setVerticalAlignment(SwingConstants.TOP);
		check_Internacional.setHorizontalAlignment(SwingConstants.CENTER);
		check_Internacional.setBounds(320, 247, 310, 29);
		panel_config.add(check_Internacional);
		
		check_Deportes = new JCheckBox("DEPORTES");
		check_Deportes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkCategorySport();
			}
		});
		 check_Deportes.setVerticalAlignment(SwingConstants.TOP);
		 check_Deportes.setHorizontalAlignment(SwingConstants.CENTER);
		 check_Deportes.setBounds(10, 82, 310, 29);
		panel_config.add(check_Deportes);
		
		
		check1_deportes = new JCheckBox("AS");
		check1_deportes.setEnabled(false);
		check1_deportes.setBounds(34, 118, 97, 23);
		panel_config.add(check1_deportes);
		
		
		check2_deportes = new JCheckBox("MARCA");
		check2_deportes.setEnabled(false);
		check2_deportes.setBounds(182, 118, 97, 23);
		panel_config.add(check2_deportes);
		
		check3_deportes = new JCheckBox("SPORT");
		check3_deportes.setEnabled(false);
		check3_deportes.setBounds(34, 177, 97, 23);
		panel_config.add(check3_deportes);
		
		check4_deportes = new JCheckBox("MUNDO DEPORTIVO");
		check4_deportes.setEnabled(false);
		check4_deportes.setBounds(182, 177, 138, 23);
		panel_config.add(check4_deportes);
		
		
		check1_economia = new JCheckBox("CINCO DIAS");
		check1_economia.setEnabled(false);
		check1_economia.setBounds(34, 288, 97, 23);
		panel_config.add(check1_economia);
		
		check2_economia = new JCheckBox("EXPANSION");
		check2_economia.setEnabled(false);
		check2_economia.setBounds(182, 288, 97, 23);
		panel_config.add(check2_economia);
		
		check3_economia = new JCheckBox("BOLSAMANIA");
		check3_economia.setEnabled(false);
		check3_economia.setBounds(34, 351, 97, 23);
		panel_config.add(check3_economia);
		
		check4_economia = new JCheckBox("BANCA 15");
		check4_economia.setEnabled(false);
		check4_economia.setBounds(182, 351, 97, 23);
		panel_config.add(check4_economia);
		
		check1_nacional = new JCheckBox("ABC");
		check1_nacional.setEnabled(false);
		check1_nacional.setBounds(392, 118, 97, 23);
		panel_config.add(check1_nacional);
		
		check2_nacional = new JCheckBox("LA RAZON");
		check2_nacional.setEnabled(false);
		check2_nacional.setBounds(533, 118, 97, 23);
		panel_config.add(check2_nacional);
		
		check3_nacional = new JCheckBox("20 MINUTOS");
		check3_nacional.setEnabled(false);
		check3_nacional.setBounds(392, 177, 97, 23);
		panel_config.add(check3_nacional);
		
		check4_nacional = new JCheckBox("ELPAIS");
		check4_nacional.setEnabled(false);
		check4_nacional.setBounds(533, 177, 97, 23);
		panel_config.add(check4_nacional);
		
		check1_internacional = new JCheckBox("THE TIMES");
		check1_internacional.setEnabled(false);
		check1_internacional.setBounds(392, 288, 97, 23);
		panel_config.add(check1_internacional);
		
		check2_internacional = new JCheckBox("LIBERTY TIMES");
		check2_internacional.setEnabled(false);
		check2_internacional.setBounds(527, 288, 116, 23);
		panel_config.add(check2_internacional);
		
		check3_internacional = new JCheckBox("THE DAILY MAIL");
		check3_internacional.setEnabled(false);
		check3_internacional.setBounds(392, 351, 112, 23);
		panel_config.add(check3_internacional);
		
		check4_internacional = new JCheckBox("THE GUARDIAN");
		check4_internacional.setEnabled(false);
		check4_internacional.setBounds(527, 351, 116, 23);
		panel_config.add(check4_internacional);
		
		btnGuardar_Config_1 = new JButton("GUARDAR");
		btnGuardar_Config_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				try {
					file_class.config_w = new FileWriter(file_class.user_config);
					file_class.config_bw = new BufferedWriter(file_class.config_w);
					JCheckBox[] checkTabla = {	check1_deportes,
											check2_deportes,
											check3_deportes,
											check4_deportes,
											check1_economia,
											check2_economia,
											check3_economia,
											check4_economia,
											check1_nacional,
											check2_nacional,
											check3_nacional,
											check4_nacional,
											check1_internacional,
											check2_internacional,
											check3_internacional,
											check4_internacional};
					for (int i = 0; i<16; i++) {
						if (checkTabla[i].isSelected()) {
							opc[i] = "1";
						} else {
							opc[i] = "0";
						}	
					}
					
				
					for (int i=0; i<16; i++) {
						config[i] = opc[i];
					}
					String user = textField_Login.getText();
					@SuppressWarnings("deprecation")
					String pwd = String.valueOf(passwordField.getText());
					// user_unique = user + "-.....-" + pwd;
					file_class.config_bw.write(user);
					file_class.config_bw.write("-.....-");
					file_class.config_bw.write(pwd);
					file_class.config_bw.write("#####");
					for (int i=0; i<checkTabla.length; i++) {
							
						file_class.config_bw.write(config[i].toString());
						
					}	
					file_class.config_bw.close();
				} catch (IOException f) {
					f.printStackTrace();
				}
				
				save_config = false;
				
				if (save_config == false)
					btnGuardar_Config_1.setEnabled(false);
				else
					btnGuardar_Config_1.setEnabled(true);
				
				readConfigFile();
			}
			
		});
		btnGuardar_Config_1.setBounds(203, 412, 107, 48);
		panel_config.add(btnGuardar_Config_1);
		
		
		
		
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

	public JPasswordField getPasswordField() {
		return passwordField;
	}

	public void setPasswordField(JPasswordField passwordField) {
		this.passwordField = passwordField;
	}

	public JTextField getTextField_Login() {
		return textField_Login;
	}

	public void setTextField_Login(JTextField textField_Login) {
		this.textField_Login = textField_Login;
	}

	public void readConfigFile() {
		
		try {
			
			file_class.config_r = new FileReader(file_class.user_config);
			file_class.config_br = new BufferedReader(file_class.config_r);
			
			String cadena = "", temp = "";
			
			
			while ((cadena = file_class.config_br.readLine()) != null) {
				ArrayList<String> list = new ArrayList<String>(Arrays.asList(cadena.split("#####")));
				temp = list.get(0);
				cadena = list.get(1); 
				config_class = new Config(temp, list);
				
			}
			
			System.out.println(config_class.toString());
			
			file_class.config_br.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	
	}
	
	/*
	public void readConfig() {
		
		FileInputStream inputS;
		try {
			inputS = new FileInputStream(file_class.user_config.getPath());
			file_class.config_r = new FileReader(file_class.user_config);
			file_class.config_br = new BufferedReader(file_class.config_r);
			
			String cadena = "", temp;
			
			while ((cadena = file_class.config_br.readLine()) != null) {
				ArrayList<String> list = new ArrayList<String>(Arrays.asList(cadena.split("#####")));
				tablita = new ArrayList<Config>();
				config_class = new Config(temp, list.get(1));
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public String[] getConfig() {
		return config;
	}

	public void setConfig(String[] config) {
		this.config = config;
	}
*/
	
	
}
