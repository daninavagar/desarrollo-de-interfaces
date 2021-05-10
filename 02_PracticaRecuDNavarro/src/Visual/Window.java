package Visual;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;
import javax.swing.text.Highlighter;
import javax.swing.text.Highlighter.HighlightPainter;
import javax.swing.text.DefaultHighlighter.DefaultHighlightPainter;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;


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
	JButton boton_Reiniciar;
	Highlighter highlighter;
	HighlightPainter pinta, pinta1;
	JLabel lbl_coincidencia;
	
	String lbl = "La coincidencia del texto es de ";
	
	String cadena1 = "", cadena2 = "";
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
		textArea1.setVisible(false);
		
		
		JFile1 = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				textArea1.setText(null);
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
						textArea1.setVisible(true);
						scrollPane.setVisible(true);
						buffer.close();
					} catch (IOException a) {
						System.err.println("Error al leer el archivo: " + a.getMessage());
					}
				} else {
					JOptionPane.showInternalMessageDialog(primero, "No has elegido ningún archivo", "SELECCIÓN PRIMER ARCHIVO", JOptionPane.WARNING_MESSAGE);
				}
			}};
		
		
		textArea2 = new JTextArea();
		textArea2.setBounds(348, 164, 328, 345);
		textArea2.setEditable(false);
		textArea2.setVisible(false);
			
		
		
			
		JFile2 = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				textArea2.setText(null);
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
						textArea2.setVisible(true);
						scrollPane1.setVisible(true);
						buffer.close();
					} catch (IOException a) {
						System.err.println("Error al leer el archivo: " + a.getMessage());
					}
				} else {
					JOptionPane.showInternalMessageDialog(primero, "No has elegido ningún archivo", "SELECCIÓN SEGUNDO ARCHIVO", JOptionPane.WARNING_MESSAGE);
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
		boton_Comprobar.setBounds(263, 106, 168, 23);
		boton_Comprobar.setVisible(true);
		getContentPane().add(boton_Comprobar);
		
		boton_Comprobar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				if (textArea1.getText().isEmpty()) {
					JOptionPane.showInternalMessageDialog(primero, "No has elegido ningún archivo o has elegido un archivo vacío", "COMPRONBACIÓN PRIMER ARCHIVO", JOptionPane.WARNING_MESSAGE);
				} else if (textArea2.getText().isEmpty()) {
					JOptionPane.showInternalMessageDialog(primero, "No has elegido ningún archivo o has elegido un archivo vacío", "COMPROBACIÓN SEGUNDO ARCHIVO", JOptionPane.WARNING_MESSAGE);
				}else {
					boton_Comprobar.setEnabled(false);
					boton_Reiniciar.setEnabled(true);
					comparadorArchivos();
				}
				
				
				
				
			}
		});
		
		boton_Reiniciar = new JButton("REINICIAR");
		boton_Reiniciar.setBounds(263, 560, 168, 23);
		boton_Reiniciar.setEnabled(false);
		getContentPane().add(boton_Reiniciar);
		
		lbl_coincidencia = new JLabel();
		lbl_coincidencia.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_coincidencia.setBounds(348, 520, 328, 29);
		getContentPane().add(lbl_coincidencia);
		
		
		boton_Reiniciar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				boton_Comprobar.setEnabled(true);
				scrollPane.setVisible(false);
				scrollPane1.setVisible(false);
				textArea1.setVisible(false);
				textArea2.setVisible(false);
				boton_Reiniciar.setEnabled(false);
				textArea1.setText(null);
				textArea2.setText(null);
				highlighter.removeAllHighlights();
				lbl_coincidencia.setText("");
			}});
	
	}
	
	public void comparadorArchivos() {
		
		int inicio = 0, fin = 1;
		cadena1 = textArea1.getText();
		cadena2 = textArea2.getText();
		String repetidos = "", diferentes = "", linea, aux;
		
		int i=0, tanto;
		while (cadena2.length() > i) {
		
			linea = cadena1.substring(inicio, fin);
			aux = cadena2.substring(inicio, fin);
			
			if (linea.equals(aux)) {
				repetidos += aux;
			} else {
				diferentes += aux;
			}
			
			if (cadena1.length() == fin) {
				i = cadena2.length();
			} else if (cadena2.length() == fin) {
				i = cadena2.length();
			} else {
				inicio++;
				fin++;
				i++;
			}
			
		}
		cadena1 = cadena1.replaceAll("\\s", "");
		repetidos = repetidos.replaceAll("\\s", "");
		diferentes = diferentes.replaceAll("\\s", "");
		char[] letras = repetidos.toCharArray();
		String[] texto = new String[letras.length];
		
		char[] letras1 = diferentes.toCharArray();
		String[] texto1 = new String[letras1.length];
		
		for (int f=0; f<texto.length; f++)
			texto[f] = Character.toString(letras[f]);
		
		for (int f=0; f<texto1.length; f++)
			texto1[f] = Character.toString(letras1[f]);
		
		
		if (letras.length == cadena1.length()) {
			
		}
		highlighter = textArea2.getHighlighter();
		pinta = new DefaultHighlightPainter(Color.green);
		pinta1 = new DefaultHighlightPainter(Color.red);
		Document doc = textArea2.getDocument();
		String text, text1;
		int pos = 0, pos1 = 1;
		
		try {
			
			text = doc.getText(0, doc.getLength());
			text1 = doc.getText(0, doc.getLength());
			for (int j=0; j<texto.length; j++) {
				while ( (pos = text.indexOf(texto[j], pos)) >= 0) {
					highlighter.addHighlight(pos, pos+texto[j].length(), pinta);
					pos += texto[j].length();
				}
			}
			for (int j=0; j<texto1.length; j++) {
				while ( (pos1 = text1.indexOf(texto1[j], pos1)) >= 0) {
					highlighter.addHighlight(pos1, pos1+texto1[j].length(), pinta1);
					pos1 += texto1[j].length();
				}
			}
			if (letras.length == cadena1.length()) {
				tanto = 100;
				lbl_coincidencia.setText(lbl + tanto +"%");
			} else {
				lbl_coincidencia.setText(lbl + "no es del " + "100 %");
			}
			
			
		} catch (BadLocationException x) {
			System.err.println("Error al subrayar :" + x.getMessage());
		}
		
		
		
	}
}
