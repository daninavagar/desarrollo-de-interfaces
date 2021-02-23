package Visual;


import java.awt.GridLayout; 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SpinnerNumberModel;

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
					excursion.configExcursion.setVisible(true);
					login.radiobtn_tutorias.setSelected(false);
					tutoria.setVisible(false);
					resumen.setVisible(false);
				} 
				 
			}
			
		});
		
		login.radiobtn_tutorias.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (login.radiobtn_tutorias.isSelected()) {
					tutoria.setVisible(true);
					tutoria.configTuto.setVisible(true);
					tutoria.precio.setVisible(false);
					resumen.setVisible(true);
					resumen.resumenTuto.setVisible(true);
					login.radiobtn_excursiones.setSelected(false);
					excursion.setVisible(false);
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
				resumen.resumenTuto.txtArea_resumen.setText("Fecha y hora " + fechaFormato.format(fecha) + "\nASUNTO: " + aux
												+ "\n\nASISTENTES: \n" + asistentes + "\n\n\n");
				
			}
			
		});
		
		resumen.resumenLimpia.btn_limpia.addActionListener(new ActionListener() {

			@SuppressWarnings("deprecation")
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				excursion.destinoExcur.checkBox_barcelona.setSelected(false);
				excursion.destinoExcur.checkBox_madrid.setSelected(false);
				excursion.destinoExcur.checkBox_sevilla.setSelected(false);
				excursion.destinoExcur.checkBox_sevilla.setSelected(false);
				excursion.destinoExcur.checkBox_castillo.setSelected(false);
				excursion.destinoExcur.checkBox_museo.setSelected(false);
				excursion.destinoExcur.checkBox_parque.setSelected(false);
				
				tutoria.precio.spinner.setModel(new SpinnerNumberModel(new Integer(0), null, null, new Integer(1)));
				tutoria.precio.spinner_1.setModel(new SpinnerNumberModel(new Integer(0), null, null, new Integer(1)));
				tutoria.precio.spinner_2.setModel(new SpinnerNumberModel(new Integer(0), null, null, new Integer(1)));
			}});
		

	}
	
	public void destinos() {
		
		ArrayList<String> listaOrigen = new ArrayList<String>();
		ArrayList<String> listaDestino = new ArrayList<String>();
		ArrayList<JCheckBox> origen = new ArrayList<JCheckBox>();
		origen.add(excursion.destinoExcur.checkBox_madrid);
		origen.add(excursion.destinoExcur.checkBox_barcelona);
		origen.add(excursion.destinoExcur.checkBox_sevilla);
		
		ArrayList<JCheckBox> destino = new ArrayList<JCheckBox>();
		
		destino.add(excursion.destinoExcur.checkBox_castillo);
		destino.add(excursion.destinoExcur.checkBox_museo);
		destino.add(excursion.destinoExcur.checkBox_parque);
		
		String aux;
		if (excursion.destinoExcur.checkBox_madrid.isSelected())
			excursion.configExcursion.comboBox_origen.addItem(aux = excursion.destinoExcur.checkBox_madrid.getText());
		if (excursion.destinoExcur.checkBox_barcelona.isSelected())
			excursion.configExcursion.comboBox_origen.addItem(aux = excursion.destinoExcur.checkBox_barcelona.getText());
		if (excursion.destinoExcur.checkBox_sevilla.isSelected())
			excursion.configExcursion.comboBox_origen.addItem(aux = excursion.destinoExcur.checkBox_sevilla.getText());
		
		if (excursion.destinoExcur.checkBox_castillo.isSelected())
			excursion.configExcursion.comboBox_destino.addItem(aux = excursion.destinoExcur.checkBox_castillo.getText());
		if (excursion.destinoExcur.checkBox_museo.isSelected())
			excursion.configExcursion.comboBox_destino.addItem(aux = excursion.destinoExcur.checkBox_museo.getText());
		if (excursion.destinoExcur.checkBox_parque.isSelected())
			excursion.configExcursion.comboBox_destino.addItem(aux = excursion.destinoExcur.checkBox_parque.getText());
		/*
		if (listaOrigen.size() == 0) {
			JOptionPane.showMessageDialog(null, "NO HAS SELECCIONADO EL ORIGEN");
			
		} else {
			for (int i=0; i<origen.size(); i++) {
				if (origen.get(i).isSelected())
					listaOrigen.add(origen.get(i).getText());
				excursion.configExcursion.comboBox_origen.addItem(listaOrigen.get(i));
			}
		}
		
		
		
		if (listaDestino.size() == 0) {
			JOptionPane.showMessageDialog(null, "NO HAS SELECCIONADO LOS DESTINOS");
			excursion.setVisible(false);
			login.textFieldUser.setText(null);
			login.passwordField_user.setText(null);
			login.radiobtn_excursiones.setSelected(false);
			login.radiobtn_tutorias.setSelected(false);
			login.radiobtn_excursiones.setEnabled(false);
			login.radiobtn_tutorias.setEnabled(false);
			
		} else {
			for (int i=0; i<destino.size(); i++) {
				if (destino.get(i).isSelected())
					listaDestino.add(destino.get(i).getText());
				excursion.configExcursion.comboBox_destino.addItem(listaDestino.get(i));
			}
		}*/
		
		

		
		
		
	}


}
