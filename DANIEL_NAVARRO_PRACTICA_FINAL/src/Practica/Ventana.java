package Practica;

import java.awt.BorderLayout;
import java.awt.Color;
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
import javax.swing.JTextField;

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
	private JTextField txtEspere;
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
		
		/*
		
		*/
		frmNoticiasConUsuarios.getContentPane().setLayout(null);
		BarraProgreso.setValue(100);
		BarraProgreso.setBounds(-10003, -10026, 386, 14);
		
		
		
		BarraProgreso.setStringPainted(true);
		frmNoticiasConUsuarios.getContentPane().add( BarraProgreso);
		
		
		JLabel lblNewLabelFondo = new JLabel(new ImageIcon(img));
		lblNewLabelFondo.setBounds(-10003, -10026, 456, 270);
		lblNewLabelFondo.setOpaque(true);
		frmNoticiasConUsuarios.getContentPane().add(lblNewLabelFondo);
		
		txtEspere = new JTextField();
		txtEspere.setBounds(-10003, -10026, 140, 46);
		txtEspere.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		txtEspere.setText("ESPERE ...");
		frmNoticiasConUsuarios.getContentPane().add(txtEspere);
		txtEspere.setColumns(10);
		
		// panel_carga.add(lblNewLabelCarga);
		
		
		
		
		
		
	}
}
