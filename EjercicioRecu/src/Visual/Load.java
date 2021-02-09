package Visual;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;




public class Load extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public JProgressBar progressBar;
	public JLabel lbl_Fondo;
	
	Load() throws IOException {
		setLayout(null);
		setBackground(Color.GRAY);
		progressBar = new JProgressBar();
		progressBar.setForeground(Color.MAGENTA);
		progressBar.setStringPainted(true);
		progressBar.setBounds(190, 530, 304, 30);
		progressBar.setValue(100);
		BufferedImage img = ImageIO.read(new File("./src/Images/fondo.jpg"));
		add(progressBar);
		lbl_Fondo = new JLabel(new ImageIcon(img));
		lbl_Fondo.setBounds(10, 10, 800, 600);
		lbl_Fondo.setOpaque(true);
		add(lbl_Fondo);
		
		
		
	}


}
