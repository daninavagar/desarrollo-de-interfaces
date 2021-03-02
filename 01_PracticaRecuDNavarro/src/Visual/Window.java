package Visual;

import javax.swing.JFrame;
import javax.swing.JButton;


public class Window  extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Window() {
		getContentPane().setLayout(null);
		setBounds(100, 100, 700, 600);
		setVisible(true);
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(182, 151, 89, 23);
		getContentPane().add(btnNewButton);
		
	}
}
