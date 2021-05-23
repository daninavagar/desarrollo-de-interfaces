package DirectorTutor;

import javax.swing.JPanel; 
import javax.swing.JButton;
import java.awt.Font;

public class SummaryClean extends JPanel{
	
	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;

	JButton btn_limpia;
	
	public SummaryClean() {
		setVisible(false);
		setLayout(null);
		
		btn_limpia = new JButton("LIMPIAR DATOS");
		btn_limpia.setBounds(46, 141, 174, 45);
		btn_limpia.setFont(new Font("Tahoma", Font.PLAIN, 15));
		add(btn_limpia);
		
	}

}
