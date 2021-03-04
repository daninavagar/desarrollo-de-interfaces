package Visual;

import javax.swing.JPanel; 
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

public class Seleccion extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Seleccion() {
		
		setBounds(100, 100, 700, 600);
		setLayout(null);
		
		JLabel labelTitulo = new JLabel("SELECCION DOCUMENTO");
		labelTitulo.setFont(new Font("Verdana", Font.BOLD, 23));
		labelTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		labelTitulo.setBounds(170, 34, 359, 83);
		add(labelTitulo);
	}
}
