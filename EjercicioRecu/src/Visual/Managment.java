package Visual;


import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JCheckBox;
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
					login.radiobtn_tutorias.setSelected(false);
					tutoria.setVisible(false);
					resumen.setVisible(false);
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
					login.radiobtn_excursiones.setSelected(false);
					excursion.setVisible(false);
				} else {
					tutoria.setVisible(false);
					resumen.setVisible(false);
				}
			}
			
		});
		
		tutoria.btn_resumen.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String aux = tutoria.textFieldAsunto.getText();
				ArrayList<String> asistentes = new ArrayList<String>();
				ArrayList<JCheckBox> asis = new ArrayList<JCheckBox>();
				asis.add(tutoria.checkBox_tutor);
				asis.add(tutoria.checkBox_padre);
				asis.add(tutoria.checkBox_director);
				asis.add(tutoria.checkBox_alumno);
				
				for (int i=0; i<asis.size(); i++) {
					if (asis.get(i).isSelected()) {
						asistentes.add(asis.get(i).getText());
					}
				}
				
				resumen.txtArea_resumen.setText("ASUNTO: " + aux
												+ "\n\nASISTENTES: \n" + asistentes);
				
			}
			
		});
		

	}


}
