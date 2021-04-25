package Visual;


import javax.swing.JFileChooser; 
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;

import java.awt.CardLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class Window extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	Carga carga = new Carga();
	Seleccion seleccion = new Seleccion();
	Trabajo trabajo = new Trabajo();
	
	Timer tiempo;
	int cont;
	
	
	
	public Window() {
		
		setIconImage(Toolkit.getDefaultToolkit().getImage("./Images/icon.png"));
		setResizable(false);
		setBounds(100, 100, 700, 600);
		setLocationRelativeTo(null);
		getContentPane().setLayout(new CardLayout(0, 0));
		setVisible(true);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setTitle("BUSCADOR CARACTERES");
		
		getContentPane().add(carga);
		getContentPane().add(seleccion);
		getContentPane().add(trabajo);
		

		addWindowListener(new WindowAdapter() {
			public void windowClosing(java.awt.event.WindowEvent evt) {
				String opciones[] = {"SI", "NO"};
			
			if (JOptionPane.showOptionDialog(null, "Est�s seguro que quieres salir?", "SALIR", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[1]) == JOptionPane.YES_OPTION)
				System.exit(0);
				
			

			}
		});

		tiempo = new Timer(100, (ActionListener) new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				cont++;
				carga.barraProgreso.setValue(cont);
				if (carga.barraProgreso.getValue() < 10)
					carga.barraProgreso.setValue(carga.barraProgreso.getValue() + 1);
				if (carga.barraProgreso.getValue() == 100) {
					carga.setVisible(false);
					seleccion.setVisible(true);
				} 
					
			}
			
		});
		tiempo.start();
		
		
		
		
		seleccion.labelOpcion.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JFileChooser fr = new JFileChooser();
				fr.setDialogTitle("SELECCIONAR ARCHIVO");
				fr.setBounds(0, 329, 582, 399);
				
				
				FileSystemView fw = fr.getFileSystemView();
				String escritorio = fw.getHomeDirectory().getAbsolutePath();
				File f = null;
				String os = System.getProperty("os.name");
				if (os.contains("Linux")) {
					f = new File(escritorio+"/Escritorio");
				} else if (os.contains("Windows")) {
					f = new File(escritorio);
				}
				
				FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos txt", "txt");
				
				fr.setFileFilter(filter);
				fr.setCurrentDirectory(f);
				fr.setAcceptAllFileFilterUsed(false);
				int opcion = fr.showOpenDialog(seleccion);
				
				
				if (opcion == JFileChooser.APPROVE_OPTION) {
					File archivo = fr.getSelectedFile();
					
					String linea = "";
					try {
						FileReader reader = new FileReader(archivo);
						BufferedReader br = new BufferedReader(reader);
						linea = br.readLine();
						
						
						while (linea != null) {
							trabajo.textArea.append(linea + " \n");
							linea = br.readLine();
							
						}
						
						
						br.close();
					} catch (IOException a) {
						System.err.println("Error al leer el archivo: " + a.getMessage());
					}
					seleccion.textArea.setText("Has seleccionado el archivo: \n\n" + archivo.getAbsolutePath());
					trabajo.textField.setText(archivo.getAbsolutePath());
				} else if (opcion == JFileChooser.CANCEL_OPTION) {
					JOptionPane.showMessageDialog(null, "No has elegido archivo" , "Archivo", JOptionPane.WARNING_MESSAGE, null);
				}
			}
		});
		
		
		seleccion.btnSeleccion.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				tiempo.stop();
				if (seleccion.textArea.getText().length() == 0) {
					JOptionPane.showMessageDialog(null, "No has elegido archivo \n Pulsa en UBICACI�N ARCHIVO para seleccionar." , "Archivo", JOptionPane.WARNING_MESSAGE, null);
				} else {
					JOptionPane.showMessageDialog(null, "Se ha cargado correctamente el archivo" , "Archivo", JOptionPane.INFORMATION_MESSAGE, null);
					seleccion.setVisible(false);
					trabajo.setVisible(true);
					setBounds(100, 100, 959, 692);
					setLocationRelativeTo(null);
				}
				
			}
			
		});
		


	}
	
	
}
