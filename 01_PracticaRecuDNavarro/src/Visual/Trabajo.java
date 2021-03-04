package Visual;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

public class Trabajo extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Trabajo() {
		
		setBounds(100, 100, 700, 600);
		setLayout(null);
		
		JLabel labelTitulo = new JLabel("VENTANA TRABAJO");
		labelTitulo.setFont(new Font("Verdana", Font.BOLD, 23));
		labelTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		labelTitulo.setBounds(219, 25, 262, 54);
		add(labelTitulo);
	}
}
