package Visual;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;
import java.awt.ScrollPane;
import javax.swing.JButton;


public class Window extends JFrame{
	
	Event event = new Event();
	Menu menu = new Menu();
	JFileChooser primero, segundo;
	JTextArea textArea1, textArea2;
	ActionListener JFile1;
	ActionListener JFile2;
	JScrollPane scrollPane;
	JScrollPane scrollPane1;
	JButton boton_Comprobar;
	public Window() {
		
		
		setVisible(true);
		setTitle("COMPARADOR ARCHIVOS");
		setBounds(100, 100, 700, 702);
		setResizable(false);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		addWindowListener(event.Close);
		
		
		getContentPane().add(menu.menuBar);
		
		textArea1 = new JTextArea();
		textArea1.setBounds(10, 164, 328, 345);
		textArea1.setEditable(false);
		
		
		JFile1 = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				primero = new JFileChooser();
				primero.setDialogTitle("SELECCIONAR PRIMER ARCHIVO");
				primero.setBounds(0, 329, 582, 399);
				
				FileSystemView vista = primero.getFileSystemView();
				String ruta = vista.getHomeDirectory().getAbsolutePath();
				File folder = null;
				String os = System.getProperty("os.name");
				
				if (os.contains("Linux")) {
					folder = new File(ruta+"/Escritorio");
				} else {
					folder = new File(ruta);
				}
				
				FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos txt", "txt");
				primero.setFileFilter(filtro);
				primero.setCurrentDirectory(folder);
				primero.setAcceptAllFileFilterUsed(false);
				
				int opcion = primero.showOpenDialog(primero);
				if (opcion == JFileChooser.APPROVE_OPTION) {
					
					File archivo = primero.getSelectedFile();
					
					String linea = "";
					
					try {
						
						FileReader reader = new FileReader(archivo);
						BufferedReader buffer = new BufferedReader(reader);
						
						linea = buffer.readLine();
						
						while (linea != null) {
							textArea1.append(linea+"\n");
							linea = buffer.readLine();
							
						}
						
						buffer.close();
					} catch (IOException a) {
						System.err.println("Error al leer el archivo: " + a.getMessage());
					}
				} else {
					JOptionPane.showInternalMessageDialog(primero, "No has elegido ningun archivo", "SELECCION PRIMER ARCHIVO", JOptionPane.WARNING_MESSAGE);
				}
			}};
		
		
		textArea2 = new JTextArea();
		textArea2.setBounds(348, 164, 328, 345);
		textArea2.setEditable(false);
			
		
		
			
		JFile2 = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JFileChooser segundo = new JFileChooser();
				segundo.setDialogTitle("SELECCIONAR SEGUNDO ARCHIVO");
				segundo.setBounds(0, 329, 582, 399);
				
				FileSystemView vista = segundo.getFileSystemView();
				String ruta = vista.getHomeDirectory().getAbsolutePath();
				File folder = null;
				String os = System.getProperty("os.name");
				
				if (os.contains("Linux")) {
					folder = new File(ruta+"/Escritorio");
				} else {
					folder = new File(ruta);
				}
				
				FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos txt", "txt");
				segundo.setFileFilter(filtro);
				segundo.setCurrentDirectory(folder);
				segundo.setAcceptAllFileFilterUsed(false);
				
				int opcion = segundo.showOpenDialog(segundo);
				if (opcion == JFileChooser.APPROVE_OPTION) {
					
					File archivo = segundo.getSelectedFile();
					
					String linea = "";
					
					try {
						
						FileReader reader = new FileReader(archivo);
						BufferedReader buffer = new BufferedReader(reader);
						
						linea = buffer.readLine();
						
						while (linea != null) {
							textArea2.append(linea+"\n");
							linea = buffer.readLine();
							
						}
						
						buffer.close();
					} catch (IOException a) {
						System.err.println("Error al leer el archivo: " + a.getMessage());
					}
				} else {
					JOptionPane.showInternalMessageDialog(primero, "No has elegido ningun archivo", "SELECCION SEGUNDO ARCHIVO", JOptionPane.WARNING_MESSAGE);
				}
			}};
		
			
		
		menu.Item_1_Acerca.addActionListener(event.About);
		menu.Item_1_Archivo.addActionListener(JFile1);
		menu.Item_2_Archivo.addActionListener(JFile2);
		menu.Item_Salir.addActionListener(event.Close_1);
		
		scrollPane = new JScrollPane(textArea1, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollPane.setBounds(10, 164, 328, 345);
		getContentPane().add(scrollPane);
		
		scrollPane1 = new JScrollPane(textArea2, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollPane1.setBounds(348, 164, 328, 345);
		getContentPane().add(scrollPane1);
		
		boton_Comprobar = new JButton("COMPROBAR");
		boton_Comprobar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 
				
			}
		});
		boton_Comprobar.setBounds(263, 106, 168, 23);
		getContentPane().add(boton_Comprobar);
		
		
		
	
	
	
	}
}
