package DirectorTutor;

import javax.swing.JPanel;

import java.awt.GridLayout;


public class Managment extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	
	public Login login = new Login();
	
	
	public Managment() {

		setBounds(100, 100, 700, 600);
		setLayout(new GridLayout(0,2,2,2));
		
		add(login);
		
	}

}
