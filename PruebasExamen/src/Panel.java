import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;
import javax.swing.text.Highlighter;
import javax.swing.text.Highlighter.HighlightPainter;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultHighlighter.DefaultHighlightPainter;
import javax.swing.text.Document;
import javax.swing.JFileChooser;
import javax.swing.JButton;
import javax.swing.JTextArea;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;



import javax.swing.JScrollPane;

public class Panel extends JPanel{
	
	
	private JTextField textField;
	private JTextArea textArea;
	private JScrollPane scrollBar;
	private JButton boton_reiniciar;
	private JButton boton_file;
	private Highlighter subrayar;
	private HighlightPainter pinta;
	private JFileChooser elegir;
	private String texto = "Hola me llamo daniel navarro y soy del real madrid.";
	public Panel() {
		
		setBounds(100, 100, 450, 300);
		setLayout(null);
		
		boton_reiniciar = new JButton("Reiniciar");
		boton_reiniciar.setBounds(234, 207, 91, 32);
		add(boton_reiniciar);
		
		JLabel lblNewLabel = new JLabel("Introduce letra");
		lblNewLabel.setBounds(81, 75, 91, 14);
		add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(182, 72, 86, 20);
		add(textField);
		textField.setColumns(10);
		
		boton_file = new JButton("JFILECHOOSER");
		boton_file.setBounds(278, 71, 132, 22);
		add(boton_file);
		
		textArea = new JTextArea();
		textArea.setEditable(false);
		add(textArea);
		
		scrollBar = new JScrollPane(textArea, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollBar.setBounds(124, 116, 201, 68);
		add(scrollBar);
		
		JButton btnSubrayar = new JButton("Subrayar");
		btnSubrayar.setBounds(124, 207, 91, 32);
		add(btnSubrayar);
		
		btnSubrayar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				subrayar();
			}});
		
		boton_reiniciar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				subrayar.removeAllHighlights();
			}});
		
		boton_file.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				chooser();
				
			}});
	}
	
	
	public void subrayar() {
		
		
		subrayar = textArea.getHighlighter();
		pinta = new DefaultHighlightPainter(Color.blue);
		
		Document doc = textArea.getDocument();
		String text;
		String letra = textField.getText();
		try {
			text = doc.getText(0, doc.getLength());
			int pos = 0;
			while ( (pos = text.indexOf(letra, pos)) >= 0 ) {
				subrayar.addHighlight(pos, pos + letra.length(), pinta);
				pos += letra.length();
			}
		} catch (BadLocationException e) {
			System.err.println("Error al subrayar: " + e.getMessage());
		}
	}
	
	public void chooser() {
		
		elegir = new JFileChooser();
		elegir.setDialogTitle("Elige archivo");
		elegir.setBounds(100, 100, 450, 300);
		
		FileSystemView vista = elegir.getFileSystemView();
		String ruta = vista.getHomeDirectory().getAbsolutePath();
		String os = System.getProperty("os.name");
		File file = null;
		
		if (os.contains("Linux"))
			file = new File(ruta+"/Escritorio");
		else
			file = new File(ruta);
		
		FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos .txt", "txt");
		elegir.setFileFilter(filtro);
		elegir.setCurrentDirectory(file);
		elegir.setAcceptAllFileFilterUsed(false);
		elegir.setMultiSelectionEnabled(true);
		int opcion = elegir.showOpenDialog(elegir);
		
		if (opcion == JFileChooser.APPROVE_OPTION) {
			
			File[] archivo = elegir.getSelectedFiles();
			
			String linea = "";
			
			
			try {
				for (int i=0; i<archivo.length;i++) {
					FileReader reader = new FileReader(archivo[i]);
					BufferedReader buffer = new BufferedReader(reader);
					
					linea = buffer.readLine();
					
					while( linea != null) {
						
						textArea.append(linea+" \n\n");
						linea = buffer.readLine();
					}
					buffer.close();
				}
				
				
			} catch (IOException e) {
				System.err.println("Error al leer: " + e.getMessage());
			}
		} else
			JOptionPane.showInternalMessageDialog(null, "No has elegido archivo", "ERROR", JOptionPane.WARNING_MESSAGE, null);
		
	}
}
