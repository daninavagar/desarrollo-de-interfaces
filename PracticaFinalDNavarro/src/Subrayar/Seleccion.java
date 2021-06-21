package Subrayar;

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

	
	private JFileChooser fr;
	private JLabel labelOpcion;
	private JLabel labelTitulo;
	private JTextArea textArea;
	private JButton btnSeleccion;
	private JButton btnCargarArchivo;
	
	
	public Seleccion() {
		
		
		setBounds(100, 100, 700, 600);
		setLayout(null);
		
		
		labelTitulo = new JLabel("SELECCIÓN DOCUMENTO");
		labelTitulo.setFont(new Font("Verdana", Font.BOLD, 23));
		labelTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		labelTitulo.setBounds(170, 34, 359, 83);
		add(labelTitulo);
		
		labelOpcion = new JLabel("UBICACIÓN ARCHIVO");
		labelOpcion.setFont(new Font("Verdana", Font.BOLD, 17));
		labelOpcion.setHorizontalAlignment(SwingConstants.CENTER);
		labelOpcion.setBounds(206, 112, 287, 29);
		add(labelOpcion);
		
		textArea = new JTextArea();
		textArea.setBorder(UIManager.getBorder("InternalFrame.border"));
		textArea.setEditable(false);
		textArea.setBounds(112, 183, 475, 75);
		add(textArea);
		
		btnSeleccion = new JButton("CARGAR ARCHIVO");
		btnSeleccion.setBounds(440, 303, 147, 23);
		add(btnSeleccion);
		
		btnCargarArchivo = new JButton("SELECCIÓN ARCHIVO");
		btnCargarArchivo.setBounds(235, 303, 176, 23);
		add(btnCargarArchivo);

	}


	public JFileChooser getFr() {
		return fr;
	}


	public void setFr(JFileChooser fr) {
		this.fr = fr;
	}


	public JLabel getLabelOpcion() {
		return labelOpcion;
	}


	public void setLabelOpcion(JLabel labelOpcion) {
		this.labelOpcion = labelOpcion;
	}


	public JTextArea getTextArea() {
		return textArea;
	}


	public void setTextArea(JTextArea textArea) {
		this.textArea = textArea;
	}


	public JButton getBtnSeleccion() {
		return btnSeleccion;
	}


	public void setBtnSeleccion(JButton btnSeleccion) {
		this.btnSeleccion = btnSeleccion;
	}
	public JButton getBtnCargarArchivo() {
		return btnCargarArchivo;
	}
	
}
