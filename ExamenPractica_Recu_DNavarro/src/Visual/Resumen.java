package Visual;

import java.awt.CardLayout; 

import javax.swing.JPanel;


public class Resumen extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	ResumenTuto resumenTuto = new ResumenTuto();
	ResumenLimpia resumenLimpia = new ResumenLimpia();
	
	public Resumen() {
		
		setLayout(new CardLayout(0, 0));
		setVisible(false);
		
		add(resumenTuto);
		add(resumenLimpia);
		
		resumenTuto.setVisible(false);
		resumenLimpia.setVisible(false);
	}
}
