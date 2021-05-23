package Subrayar;

import javax.swing.JFileChooser; 
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
public class Ventana extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Create the panel.
	 */
	
	Carga carga = new Carga();
	Seleccion seleccion = new Seleccion();
	Trabajo trabajo = new Trabajo();
	
	 public javax.swing.Timer time2;
	
	public Ventana() {

		setBounds(100, 100, 700, 600);
		setLayout(new CardLayout(0, 0));
		
		add(carga, "name_283221093009400");
		add(seleccion, "name_283221103876700");
		add(trabajo, "name_283221113310800");
		
		
		seleccion.btnCargarArchivo.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
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

		
	}
	
	




	public Carga getCarga() {
		return carga;
	}

	public void setCarga(Carga carga) {
		this.carga = carga;
	}

	public Seleccion getSeleccion() {
		return seleccion;
	}

	public void setSeleccion(Seleccion seleccion) {
		this.seleccion = seleccion;
	}

	public Trabajo getTrabajo() {
		return trabajo;
	}

	public void setTrabajo(Trabajo trabajo) {
		this.trabajo = trabajo;
	}
	
	

}
