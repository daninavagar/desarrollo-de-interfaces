package Visual;


import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

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
				if (login.muestraPaneles()) {
					if (login.radiobtn_excursiones.isSelected()) {
						excursion.setVisible(true);
						excursion.configExcursion.setVisible(true);
						excursion.destinoExcur.setVisible(false);
						login.radiobtn_tutorias.setSelected(false);
						tutoria.setVisible(false);
						resumen.setVisible(false);
					} else {
						excursion.configExcursion.setVisible(false);
					}
				} else {
					excursion.setVisible(true);
					tutoria.setVisible(true);
					tutoria.precio.setVisible(true);
					tutoria.configTuto.setVisible(false);
					excursion.configExcursion.setVisible(false);
					excursion.destinoExcur.setVisible(true);
					login.radiobtn_tutorias.setSelected(false);
				}
				 
			}
			
		});
		
		login.radiobtn_tutorias.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (login.muestraPaneles()) {
					
					if (login.radiobtn_tutorias.isSelected()) {
						tutoria.setVisible(true);
						tutoria.configTuto.setVisible(true);
						tutoria.precio.setVisible(false);
						resumen.setVisible(true);
						login.radiobtn_excursiones.setSelected(false);
						excursion.setVisible(false);
					} else {
						tutoria.setVisible(false);
						resumen.setVisible(false);
					}
				}
				
			}
			
		});
		
		tutoria.configTuto.btn_resumen.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String aux = tutoria.configTuto.textFieldAsunto.getText();
				ArrayList<String> asistentes = new ArrayList<String>();
				ArrayList<JCheckBox> asis = new ArrayList<JCheckBox>();
				asis.add(tutoria.configTuto.checkBox_tutor);
				asis.add(tutoria.configTuto.checkBox_padre);
				asis.add(tutoria.configTuto.checkBox_director);
				asis.add(tutoria.configTuto.checkBox_alumno);
				
				for (int i=0; i<asis.size(); i++) {
					if (asis.get(i).isSelected()) {
						asistentes.add(asis.get(i).getText());
					}
				}
				Date fecha = new Date();
				DateFormat fechaFormato = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
				resumen.txtArea_resumen.setText("Fecha y hora " + fechaFormato.format(fecha) + "\nASUNTO: " + aux
												+ "\n\nASISTENTES: \n" + asistentes + "\n\n\n");
				
			}
			
		});
		

	}


}
