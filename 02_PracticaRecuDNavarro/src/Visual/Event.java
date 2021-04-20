package Visual;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JOptionPane;

public class Event {

	WindowListener Close;
	
	public Event() {
	
		Close = new WindowAdapter() {

			public void windowClosing(java.awt.event.WindowEvent evt) {
				
				String opciones[] = {"SI", "NO"};
				
				if ( JOptionPane.showOptionDialog(null, "Estás seguro que quieres salir", "SALIR", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[1]) == JOptionPane.YES_OPTION)
					System.exit(0);
			}
			};
	}
	
}
