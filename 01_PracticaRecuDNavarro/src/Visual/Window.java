package Visual;

import javax.swing.JFrame;  
import javax.swing.Timer;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class Window extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	Carga carga = new Carga();
	Seleccion seleccion = new Seleccion();
	
	Timer tiempo;
	int cont;
	
	public Window() {
		
		setResizable(false);
		setLocationRelativeTo(null);
		setBounds(100, 100, 700, 600);
		getContentPane().setLayout(new CardLayout(0, 0));
		setVisible(true);
		setTitle("PRACTICA 1");
		
		getContentPane().add(carga);
		getContentPane().add(seleccion);
		
		tiempo = new Timer(5, (ActionListener) new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				cont++;
				carga.barraProgreso.setValue(cont);
				if (carga.barraProgreso.getValue() < 10)
					carga.barraProgreso.setValue(carga.barraProgreso.getValue() + 1);
				if (carga.barraProgreso.getValue() == 100) {
					carga.setVisible(false);
					seleccion.setVisible(true);
				} 
					
			}
			
		});
		tiempo.start();
	}
}
