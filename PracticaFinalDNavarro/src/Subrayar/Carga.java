package Subrayar;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JProgressBar;

public class Carga extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	JProgressBar barraProgreso;
	
	public Carga() {
		
		setVisible(true);
		setBounds(100, 100, 700, 600);
		setLayout(new BorderLayout(0, 0));
		
		barraProgreso = new JProgressBar();
		barraProgreso.setValue(100);
		barraProgreso.setStringPainted(true);
		add(barraProgreso, BorderLayout.SOUTH);
		
		
		
	}

	public JProgressBar getBarraProgreso() {
		return barraProgreso;
	}

	public void setBarraProgreso(JProgressBar barraProgreso) {
		this.barraProgreso = barraProgreso;
	}
}
