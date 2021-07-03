package Visual;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowListener;
import java.awt.event.WindowEvent;

import javax.swing.JOptionPane;

public class Event {
	
	
	private WindowListener Close;
	private ActionListener Close_1;
	private ActionListener About;

	public Event() {
		
		
		
		Close = new WindowAdapter() {
			
			public void windowClosing(WindowEvent evt) {
				
				
				
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
		
		About = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(null, "Desarrollador: Daniel Navarro García. \n Versión 1.0 \n 24/05/2020", "Comparador Archivos", JOptionPane.INFORMATION_MESSAGE);
			}};

			
			
	}
	public WindowListener getClose() {
		return Close;
	}
	
	
	public ActionListener getClose_1() {
		return Close_1;
	}
	
	public ActionListener getAbout() {
		return About;
	}	

}
