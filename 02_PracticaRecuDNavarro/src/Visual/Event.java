package Visual;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowListener;

import javax.swing.JOptionPane;

public class Event {

	WindowListener Close;
	ActionListener Close_1;
	ActionListener About;
	
	public Event() {
	
		Close = new WindowAdapter() {

			public void windowClosing(java.awt.event.WindowEvent evt) {
				
				String opciones[] = {"SI", "NO"};
				
				if ( JOptionPane.showOptionDialog(null, "Est�s seguro que quieres salir", "SALIR", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[1]) == JOptionPane.YES_OPTION)
					System.exit(0);
			}};
			
		
		Close_1 = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
					
					String opciones[] = {"SI", "NO"};
					
					if ( JOptionPane.showOptionDialog(null, "Est�s seguro que quieres salir", "SALIR", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[1]) == JOptionPane.YES_OPTION)
						System.exit(0);
				
			}};
			
		About = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(null, "Desarrollador: Daniel Navarro Garcia. \n Versi�n 1.0 \n 21/04/2020", "Sobre Aplicaci�n", JOptionPane.INFORMATION_MESSAGE);
			}};
	}
	
}
