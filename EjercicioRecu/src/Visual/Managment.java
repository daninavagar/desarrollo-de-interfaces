package Visual;


import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
		
		login.radiobtn_excursiones.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (login.radiobtn_excursiones.isSelected()) {
					excursion.setVisible(true);
				} else {
					excursion.setVisible(false);
				}
			}
			
		});
		
		login.radiobtn_tutorias.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (login.radiobtn_tutorias.isSelected()) {
					tutoria.setVisible(true);
					resumen.setVisible(true);
				} else {
					tutoria.setVisible(false);
					resumen.setVisible(false);
				}
			}
			
		});
		

	}


}
