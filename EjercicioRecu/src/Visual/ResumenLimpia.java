package Visual;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.Font;

public class ResumenLimpia extends JPanel{
	
	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;

	JButton btn_limpia;
	
	public ResumenLimpia() {
		setVisible(false);
		setLayout(null);
		
		btn_limpia = new JButton("LIMPIAR DATOS");
		btn_limpia.setBounds(46, 141, 174, 45);
		btn_limpia.setFont(new Font("Tahoma", Font.PLAIN, 15));
		add(btn_limpia);
		
	}

}
