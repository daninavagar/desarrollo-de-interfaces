package Visual;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowListener;

import javax.swing.JOptionPane;

import DirectorTutor.Load;


public class Event {
	
	
	WindowListener Close;
	ActionListener Close_1;
	ActionListener About;
	ActionListener change;
	Selection selection = new Selection();
	Load load = new Load();
	public Event() {
		
		
		
		Close = new WindowAdapter() {
			
			public void windowClosing(java.awt.event.WindowEvent evt) {
				
				String options[] = {"SI", "NO"};
				
				if ( (JOptionPane.showOptionDialog(null, "¿Estás seguro que quieres salir?", "SALIR", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0])) == JOptionPane.YES_OPTION )
					System.exit(0);
			}
		};
		
		
		Close_1 = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String options[] = {"SI", "NO"};
				
				if ( (JOptionPane.showOptionDialog(null, "¿Estás seguro que quieres salir?", "SALIR", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0])) == JOptionPane.YES_OPTION )
					System.exit(0);
				
			}};
			
			
			
	}

}
