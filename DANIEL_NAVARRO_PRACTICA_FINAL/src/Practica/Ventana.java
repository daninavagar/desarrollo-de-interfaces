package Practica;

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
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Window.Type;

public class Ventana {

	private JFrame frmNoticiasConUsuarios;

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
	private Timer tiempo = null;
	private int cont = 0;
	JProgressBar BarraProgreso = new JProgressBar();
	public Ventana() throws IOException {
		initialize();
		
		tiempo = new Timer(100, (ActionListener) new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			
				cont++;
				BarraProgreso.setValue(cont);
				if (BarraProgreso.getValue() < 10) {
					BarraProgreso.setValue(BarraProgreso.getValue() + 1);
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
		
		BufferedImage img = ImageIO.read(new File ("./src/Image/fondo.png"));
		frmNoticiasConUsuarios = new JFrame();
		frmNoticiasConUsuarios.setType(Type.POPUP);
		frmNoticiasConUsuarios.setIconImage(Toolkit.getDefaultToolkit().getImage("./src/Image/icon.png"));
		frmNoticiasConUsuarios.setTitle("NOTICIAS CON USUARIOS");
		frmNoticiasConUsuarios.setBounds(100, 100, 450, 300);
		frmNoticiasConUsuarios.setLocationRelativeTo(null);
		frmNoticiasConUsuarios.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmNoticiasConUsuarios.getContentPane().setLayout(null);
		
		
		
		
		
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Acerca de");
		mntmNewMenuItem.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(null, "Hecho por Daniel Navarro");
			}
		});
		mntmNewMenuItem.setBounds(331, 0, 103, 26);
		frmNoticiasConUsuarios.getContentPane().add(mntmNewMenuItem);
		
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
		lblNewLabelFondo.setBounds(-12, 0, 456, 261);
		frmNoticiasConUsuarios.getContentPane().add(lblNewLabelFondo);
	}
}
