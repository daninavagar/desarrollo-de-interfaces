package DirectorTutor;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.swing.JProgressBar;

public class Load extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JProgressBar barraProgreso;
	
	
	
	
	public Load() {
		setLayout(null);
		
		barraProgreso = new JProgressBar();
		add(barraProgreso, BorderLayout.SOUTH);
		barraProgreso.setForeground(Color.MAGENTA);
		barraProgreso.setStringPainted(true);
		barraProgreso.setBounds(0, 241, 450, 20);
		barraProgreso.setValue(100);
		add(barraProgreso);

		BufferedImage img = null;
		try {
			img = ImageIO.read(new File("./Images/fondo.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		add(barraProgreso);
		JLabel lbl_Fondo = new JLabel(new ImageIcon(img));
		lbl_Fondo.setBounds(0, -20, 450, 261);
		lbl_Fondo.setOpaque(true);
		
		add(lbl_Fondo);

		
	}




	public JProgressBar getBarraProgreso() {
		return barraProgreso;
	}




	public void setBarraProgreso(JProgressBar barraProgreso) {
		this.barraProgreso = barraProgreso;
	}
	
	

}
