package DirectorTutor;


import javax.swing.JPanel;

import java.awt.CardLayout;

public class Excursiones extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	ConfigExcursion configExcursion = new ConfigExcursion();
	DestinoExcur destinoExcur = new DestinoExcur();
	
	public Excursiones() {
		setLayout(new CardLayout(0, 0));
		setVisible(false);
		
		add(configExcursion);
		add(destinoExcur);
		
		configExcursion.setVisible(false);
		destinoExcur.setVisible(false);
		
	}
}
