package Visual;

import javax.swing.JPanel;  
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.UIManager;



public class Seleccion extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	JFileChooser fr;
	JLabel labelOpcion;
	JLabel labelTitulo;
	JTextArea textArea;
	JButton btnSeleccion;
	
	
	public Seleccion() {
		
		
		setBounds(100, 100, 700, 600);
		setLayout(null);
		
		
		labelTitulo = new JLabel("SELECCION DOCUMENTO");
		labelTitulo.setFont(new Font("Verdana", Font.BOLD, 23));
		labelTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		labelTitulo.setBounds(170, 34, 359, 83);
		add(labelTitulo);
		
		labelOpcion = new JLabel("UBICACION ARCHIVO*");
		labelOpcion.setToolTipText("Pulsa para seleccionar archivo");
		labelOpcion.setFont(new Font("Verdana", Font.BOLD, 17));
		labelOpcion.setHorizontalAlignment(SwingConstants.CENTER);
		labelOpcion.setBounds(206, 112, 287, 29);
		add(labelOpcion);
		
		textArea = new JTextArea();
		textArea.setBorder(UIManager.getBorder("InternalFrame.border"));
		textArea.setEditable(false);
		textArea.setBounds(112, 183, 475, 75);
		add(textArea);
		
		btnSeleccion = new JButton("SELECCIONAR ARCHIVO");
		btnSeleccion.setBounds(415, 303, 172, 23);
		add(btnSeleccion);

		
	}
}
