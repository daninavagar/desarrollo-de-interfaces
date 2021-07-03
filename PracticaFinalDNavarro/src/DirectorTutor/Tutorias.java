package DirectorTutor;

import java.awt.CardLayout;

import javax.swing.JPanel;


public class Tutorias extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	Cost precio = new Cost();
	ConfigTuto configTuto = new ConfigTuto();
	
	
	public Tutorias() {
		
		setLayout(new CardLayout(0, 0));
		setVisible(false);
		
		add(precio);
		add(configTuto);
		
		precio.setVisible(false);
		configTuto.setVisible(false);
		
		
		
		
		
		
	}
}
