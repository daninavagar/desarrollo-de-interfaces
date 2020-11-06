package Practica;

// import java.awt.CardLayout; 
import java.awt.EventQueue;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.swing.JMenuItem;
import javax.swing.JProgressBar;
import javax.swing.Timer;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JPanel;

public class Ventana {


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana window = new Ventana();
					window.frmNoticiasConUsuarios.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	private JFrame frmNoticiasConUsuarios;
	JPanel panel_carga = new JPanel();
	JPanel panel_login = new JPanel();
	private Timer tiempo = null;
	private int cont = 0;
	JProgressBar BarraProgreso = new JProgressBar();
	public Ventana() throws IOException {
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
					frmNoticiasConUsuarios.setEnabled(true);
					frmNoticiasConUsuarios.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					// panel_carga.setVisible(false);
					// panel_login.setVisible(true);			
				}
				
			}
		});
		tiempo.start();
	
	}

	/**
	 * Initialize the contents of the frame.
	 * @throws IOException 
	 */
	
	
	private void initialize() throws IOException {
		
		BufferedImage img = ImageIO.read(new File ("./src/Image/fondo.jpg"));
		frmNoticiasConUsuarios = new JFrame();
		frmNoticiasConUsuarios.setEnabled(false);
		frmNoticiasConUsuarios.setResizable(false);
		frmNoticiasConUsuarios.setIconImage(Toolkit.getDefaultToolkit().getImage("./src/Image/icon.png"));
		frmNoticiasConUsuarios.setTitle("NOTICIAS CON USUARIOS");
		frmNoticiasConUsuarios.setBounds(100, 100, 451, 329);
		frmNoticiasConUsuarios.setLocationRelativeTo(null);
		frmNoticiasConUsuarios.getContentPane().setLayout(null);	
		
		JMenuBar menuBar = new JMenuBar();
		frmNoticiasConUsuarios.setJMenuBar(menuBar);
		
		JMenuItem infoMenu = new JMenuItem("Acerca de");
		menuBar.add(infoMenu);
		
		infoMenu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(null, "Hecho por Daniel Navarro\n daninavagar@gmail.com");
			}
		});
		infoMenu.setBounds(331, 0, 103, 26);
		
		JMenu Menu = new JMenu("?");
		frmNoticiasConUsuarios.getContentPane().add(Menu);
		
		
		BarraProgreso.setStringPainted(true);
		BarraProgreso.setBounds(24, 236, 386, 14);
		frmNoticiasConUsuarios.getContentPane().add(BarraProgreso);
		
		
		
		
		JLabel lblNewLabelCarga = new JLabel("Espere . . .");
		lblNewLabelCarga.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabelCarga.setFont(new Font("Segoe UI Symbol", Font.BOLD, 16));
		lblNewLabelCarga.setBounds(123, 179, 189, 46);
		frmNoticiasConUsuarios.getContentPane().add(lblNewLabelCarga);
		
		JLabel lblNewLabelFondo = new JLabel(new ImageIcon(img));
		lblNewLabelFondo.setOpaque(true);
		lblNewLabelFondo.setBounds(-12, 0, 456, 270);
		frmNoticiasConUsuarios.getContentPane().add(lblNewLabelFondo);
		
		//panel_carga.add(lblNewLabelCarga, );
		// panel_login.add();
		
	
		
		/*
		JPanel JPanelLogin = new JPanel();
		frmNoticiasConUsuarios.setContentPane(JPanelLogin);
		JPanelLogin.setBounds(133, 106, 58, 31);
		frmNoticiasConUsuarios.invalidate();
		frmNoticiasConUsuarios.validate();
		frmNoticiasConUsuarios.getContentPane().add(JPanelLogin);
		*/
		
		
		
	}
}
