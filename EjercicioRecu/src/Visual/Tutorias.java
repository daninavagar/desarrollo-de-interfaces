package Visual;

import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.CardLayout;
import java.awt.TextField;

public class Tutorias extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	Precio precio = new Precio();
	ConfigTuto configTuto = new ConfigTuto();
	
	
	public Tutorias() {
		
		setLayout(new CardLayout(0, 0));
		setVisible(false);
		
		add(precio);
		add(configTuto);
		
		
		
		
		
		
		
		
	}
}
