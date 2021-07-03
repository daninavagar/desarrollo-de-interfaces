package Visual;

import java.awt.EventQueue;  
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.Timer;

import ComparadorArchivos.Comparador;
import ComparadorArchivos.Menu;
import Config.Usuarios;
import DirectorTutor.Load;
import DirectorTutor.Managment;
import Subrayar.Ventana;

import java.awt.CardLayout;
import java.awt.Toolkit;

public class Main {

	private JFrame frame;
	
	Event event = new Event();
	Selection selection = new Selection();
	Load load = new Load();
	Managment managment = new Managment();
	Usuarios user = new Usuarios();
	Ventana ventana = new Ventana();
	Comparador comparador = new Comparador();
	Menu menu = new Menu();
	
	private ActionListener ac;
	private Timer time;
	private int x = 0;

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
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("./Images/icon.png"));
		frame.setTitle("PRÁCTICA FINAL");
		frame.setBounds(100, 100, 450, 300);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		frame.addWindowListener(event.getClose());
		
		frame.getContentPane().add(selection);
		frame.getContentPane().add(load);
		frame.getContentPane().add(managment);
		frame.getContentPane().add(ventana);
		frame.getContentPane().add(comparador);
		
		
		// PRACTICA 1
		selection.getBtn_Teacher().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				selection.setVisible(false);
				frame.setBounds(100, 100, 700, 600);
				frame.setLocationRelativeTo(null);
				ventana.getCarga().setVisible(true);
				load.setVisible(true);
				
				ac = new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						x++;
						load.getBarraProgreso().setValue(x);
						if (load.getBarraProgreso().getValue() == 30) {
							if (user.compruebaficheros()) {
								JOptionPane.showMessageDialog(null, "Faltan archivos", "Error en el acceso", JOptionPane.ERROR_MESSAGE, null);
								System.exit(0);
							}
						}
						if (load.getBarraProgreso().getValue() == 100) {
							load.setVisible(false);
							managment.setVisible(true);
							time.stop();
						}
							
					}};
				time = new Timer(30, ac);
				time.start();
			}});
		
		managment.getLogin().getBtn_Inicio().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				managment.setVisible(false);
				load.setVisible(false);
				selection.setVisible(true);
				frame.setBounds(100, 100, 450, 300);
				frame.setLocationRelativeTo(null);
				time.removeActionListener(ac);
				load.getBarraProgreso().setValue(0);
				x = 0;
			}});
		
		// PRACTICA 2
		selection.getBtn_Highlighter().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				selection.setVisible(false);
				frame.setBounds(100, 100, 700, 600);
				frame.setLocationRelativeTo(null);
				ventana.setVisible(true);
				ventana.getCarga().setVisible(true);
				
				ac = new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						x++;
						ventana.getCarga().getBarraProgreso().setValue(x);
						if (ventana.getCarga().getBarraProgreso().getValue() == 100) {
							ventana.getCarga().setVisible(false);
							ventana.getSeleccion().setVisible(true);
							time.stop();
						}
							
					}};
				time = new Timer(100, ac);
				time.start();
			}
		});
		
		ventana.getSeleccion().getBtnSeleccion().addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				if (ventana.getSeleccion().getTextArea().getText().length() == 0) {
					JOptionPane.showMessageDialog(null, "No has elegido archivo \n Pulsa en UBICACIÓN ARCHIVO para seleccionar." , "Archivo", JOptionPane.WARNING_MESSAGE, null);
				} else {
					JOptionPane.showMessageDialog(null, "Se ha cargado correctamente el archivo" , "Archivo", JOptionPane.INFORMATION_MESSAGE, null);
					ventana.getSeleccion().setVisible(false);
					ventana.getTrabajo().setVisible(true);
					frame.setBounds(100, 100, 959, 692);
					frame.setLocationRelativeTo(null);
					
				}
				
			}
			
		});
		
		ventana.getTrabajo().getBoton_Home().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ventana.getTrabajo().setVisible(false);
				ventana.getSeleccion().setVisible(false);
				ventana.getCarga().setVisible(false);
				ventana.setVisible(false);
				selection.setVisible(true);
				frame.setBounds(100, 100, 450, 300);
				frame.setLocationRelativeTo(null);
				time.removeActionListener(ac);
				ventana.getCarga().getBarraProgreso().setValue(0);
				x = 0;		
			}});
		
		
		// PRACTICA 3
		
		selection.getBtn_Comparator().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				selection.setVisible(false);
				comparador.setVisible(true);
				frame.setBounds(100, 100, 700, 702);
				frame.setLocationRelativeTo(null);
				frame.setJMenuBar(menu.getMenuBar());
				menu.getItem_1_Acerca().addActionListener(event.getAbout());
				menu.getItem_1_Archivo().addActionListener(comparador.getJFile1());
				menu.getItem_2_Archivo().addActionListener(comparador.getJFile2());
				menu.getItem_Salir().addActionListener(event.getClose_1());
			}
			
		});
		
		comparador.getBoton_Inicio().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				comparador.setVisible(false);
				selection.setVisible(true);
				frame.setBounds(100, 100, 450, 300);
				frame.setLocationRelativeTo(null);
				frame.setJMenuBar(null);
			}});
		
	}

}
