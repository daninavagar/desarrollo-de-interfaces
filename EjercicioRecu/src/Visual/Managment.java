package Visual;


import java.awt.GridLayout;

import javax.swing.JPanel;

public class Managment extends JPanel{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	public Login login = new Login();
	public Excursiones excursion = new Excursiones();
	public Tutorias tutoria = new Tutorias();
	public Resumen resumen = new Resumen();
	
	
	Managment(){
		setLayout(new GridLayout(0,2,2,2));
		
		add(login);
		add(excursion);
		add(tutoria);
		add(resumen);
		

	}

}
