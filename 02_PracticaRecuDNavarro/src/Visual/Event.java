package Visual;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowListener;
import java.io.BufferedReader;
import java.io.*;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;

public class Event {

	WindowListener Close;
	ActionListener Close_1;
	ActionListener About;
	
	public Event() {
	
		Close = new WindowAdapter() {

			public void windowClosing(java.awt.event.WindowEvent evt) {
				
				String opciones[] = {"SI", "NO"};
				
				if ( JOptionPane.showOptionDialog(null, "Estás seguro que quieres salir", "SALIR", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[1]) == JOptionPane.YES_OPTION)
					System.exit(0);
			}};
			
		
		Close_1 = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
					
					String opciones[] = {"SI", "NO"};
					
					if ( JOptionPane.showOptionDialog(null, "Estás seguro que quieres salir", "SALIR", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[1]) == JOptionPane.YES_OPTION)
						System.exit(0);
				
			}};
			
		About = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(null, "Desarrollador: Daniel Navarro García. \n Versión 1.0 \n 21/04/2020", "Sobre Aplicación", JOptionPane.INFORMATION_MESSAGE);
			}};
			
		
	}
	
}
