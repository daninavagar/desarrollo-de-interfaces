package DirectorTutor;

import javax.swing.JCheckBox; 
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SpinnerNumberModel;

import Visual.Event;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;


public class Managment extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	
	Event event = new Event();
	Login login = new Login();
	Excursiones excursion = new Excursiones();
	Tutorias tutoria = new Tutorias();
	Summary summary = new Summary();

	
	public Managment() {

		setBounds(100, 100, 700, 600);
		setLayout(new GridLayout(0,2,2,2));
		
		add(login);
		add(excursion);
		add(tutoria);
		add(summary);
		
		
		login.btn_salir.addActionListener(event.getClose_1());
		login.btn_login.addActionListener(new ActionListener() {

			
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				excursion.setVisible(false);
				excursion.configExcursion.setVisible(false);
				excursion.destinoExcur.setVisible(false);
				summary.setVisible(false);
				summary.resumenLimpia.setVisible(false);
				summary.resumenTuto.setVisible(false);
				tutoria.setVisible(false);
				tutoria.configTuto.setVisible(false);
				tutoria.precio.setVisible(false);
				
				if (!login.compruebaLogin()) {
					JOptionPane.showMessageDialog(null, "Algunos de los datos introducidos no son correctos", "Error en el acceso", JOptionPane.ERROR_MESSAGE);
				} else if (!login.muestraPaneles()) {
					login.textFieldUser.setEnabled(false);
					login.passwordField_user.setEnabled(false);
					excursion.setVisible(true);
					excursion.destinoExcur.setVisible(true);
					tutoria.setVisible(true);
					tutoria.precio.setVisible(true);
					summary.setVisible(true);
					summary.resumenLimpia.setVisible(true);
					login.btn_login.setEnabled(false);
					
				} else {
					excursion.setVisible(true);
					excursion.configExcursion.setVisible(true);
					login.textFieldUser.setEnabled(false);
					login.passwordField_user.setEnabled(false);
					destinos();
				}
				
				
			}
		});
		
		login.passwordField_user.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				excursion.setVisible(false);
				excursion.configExcursion.setVisible(false);
				excursion.destinoExcur.setVisible(false);
				summary.setVisible(false);
				summary.resumenLimpia.setVisible(false);
				summary.resumenTuto.setVisible(false);
				tutoria.setVisible(false);
				tutoria.configTuto.setVisible(false);
				tutoria.precio.setVisible(false);
				int key = e.getKeyCode();
				if (key == KeyEvent.VK_ENTER) {
					if (!login.compruebaLogin()) {
						JOptionPane.showMessageDialog(null, "Algunos de los datos introducidos no son correctos", "Error en el acceso", JOptionPane.ERROR_MESSAGE);
					} else if (!login.muestraPaneles()) {
						login.textFieldUser.setEnabled(false);
						login.passwordField_user.setEnabled(false);
						excursion.setVisible(true);
						excursion.destinoExcur.setVisible(true);
						tutoria.setVisible(true);
						tutoria.precio.setVisible(true);
						summary.setVisible(true);
						summary.resumenLimpia.setVisible(true);
						login.btn_login.setEnabled(false);
						
					} else {
						excursion.setVisible(true);
						excursion.configExcursion.setVisible(true);
						login.textFieldUser.setEnabled(false);
						login.passwordField_user.setEnabled(false);
						destinos();
				}

				}
			}
		});
		
		
		login.btn_logout.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				login.btn_login.setEnabled(true);
				login.textFieldUser.setEnabled(true);
				login.passwordField_user.setEnabled(true);
				login.radiobtn_excursiones.setSelected(false);
				login.radiobtn_tutorias.setSelected(false);
				login.radiobtn_excursiones.setEnabled(false);
				login.radiobtn_tutorias.setEnabled(false);
				excursion.setVisible(false);
				summary.setVisible(false);
				tutoria.setVisible(false);
				login.textFieldUser.setText(null);
				login.passwordField_user.setText(null);
				
				tutoria.configTuto.textFieldAsunto.setText(null);
				tutoria.configTuto.checkBox_alumno.setSelected(false);
				tutoria.configTuto.checkBox_padre.setSelected(false);
				tutoria.configTuto.checkBox_tutor.setSelected(false);
				tutoria.configTuto.checkBox_director.setSelected(false);
				
				summary.resumenTuto.txtArea_resumen.setText(null);
			}
			
		});

login.radiobtn_excursiones.addActionListener(new ActionListener() {

			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (login.radiobtn_excursiones.isSelected()) {
					excursion.setVisible(true);
					excursion.configExcursion.setVisible(true);
					login.radiobtn_tutorias.setSelected(false);
					tutoria.setVisible(false);
					summary.setVisible(false);
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
					summary.setVisible(true);
					summary.resumenTuto.setVisible(true);
					login.radiobtn_excursiones.setSelected(false);
					excursion.setVisible(false);
				} 
			}
			
		});
		
		excursion.configExcursion.radiobtn_ida.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (excursion.configExcursion.radiobtn_ida.isSelected()) 
					excursion.configExcursion.radiobtn_vuelta.setSelected(false);
			}});
		
		excursion.configExcursion.radiobtn_vuelta.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (excursion.configExcursion.radiobtn_vuelta.isSelected()) 
					excursion.configExcursion.radiobtn_ida.setSelected(false);
			}});
		
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
				summary.resumenTuto.txtArea_resumen.setText("Fecha y hora " + fechaFormato.format(fecha) + "\nASUNTO: " + aux
												+ "\n\nASISTENTES: \n" + asistentes + "\n\n");
				
			}
			
		});
		
		tutoria.configTuto.btn_reset.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				tutoria.configTuto.textFieldAsunto.setText(null);
				tutoria.configTuto.checkBox_tutor.setSelected(false);
				tutoria.configTuto.checkBox_padre.setSelected(false);
				tutoria.configTuto.checkBox_alumno.setSelected(false);
				tutoria.configTuto.checkBox_director.setSelected(false);
				summary.resumenTuto.txtArea_resumen.setText(null);
			}});
		
		summary.resumenLimpia.btn_limpia.addActionListener(new ActionListener() {

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

		
		excursion.configExcursion.textField_coste.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				double precio;
				Integer nAlumnos = (Integer)excursion.configExcursion.spinner_alumnos.getValue();
				Integer pocos = 0;
				Integer medios = 0;
				Integer muchos = 0;
				
				
				if ( !excursion.configExcursion.compruebaOrigen()) {
					JOptionPane.showMessageDialog(null, "EL DIRECTOR TIENE QUE SELECCIONAR El ORIGEN Y EL DESTINO", "Atencion", JOptionPane.WARNING_MESSAGE);
				} else {
					if (!excursion.configExcursion.radiobtn_vuelta.isSelected() &&  !excursion.configExcursion.radiobtn_ida.isSelected()) {
						JOptionPane.showMessageDialog(null, "TIENES QUE SELECCIONAR IDA O IDA Y VUELTA", "Atencion", JOptionPane.WARNING_MESSAGE);
					} else {
						if (excursion.configExcursion.radiobtn_vuelta.isSelected()) {
							if (nAlumnos < 15) {
								pocos = (Integer)tutoria.precio.spinner.getValue();
								precio = nAlumnos * pocos * 1.5;
								String precio_final = String.valueOf(precio);
								excursion.configExcursion.textField_coste.setText(precio_final);
								
								
							} else if (nAlumnos > 15 && nAlumnos < 25) {
								medios = (Integer)tutoria.precio.spinner_1.getValue();
								precio = nAlumnos * medios * 1.5;
								String precio_final = String.valueOf(precio);
								excursion.configExcursion.textField_coste.setText(precio_final);
							} else if (nAlumnos > 25) {
								muchos = (Integer)tutoria.precio.spinner_2.getValue();
								precio = nAlumnos * muchos * 1.5;
								String precio_final = String.valueOf(precio);
								excursion.configExcursion.textField_coste.setText(precio_final);
							}
							
						} else {
							if (nAlumnos < 15) {
								pocos = (Integer)tutoria.precio.spinner.getValue();
								precio = nAlumnos * pocos;
								String precio_final = String.valueOf(precio);
								excursion.configExcursion.textField_coste.setText(precio_final);
								
								
							} else if (nAlumnos > 15 && nAlumnos < 25) {
								medios = (Integer)tutoria.precio.spinner_1.getValue();
								precio = nAlumnos * medios;
								String precio_final = String.valueOf(precio);
								excursion.configExcursion.textField_coste.setText(precio_final);
							} else if (nAlumnos > 25) {
								muchos = (Integer)tutoria.precio.spinner_2.getValue();
								precio = nAlumnos * muchos;
								String precio_final = String.valueOf(precio);
								excursion.configExcursion.textField_coste.setText(precio_final);
							}
							
						}
					}
				}

			}
		});

		
		
	}
	
	public void destinos() {
		
		
		ArrayList<JCheckBox> origen = new ArrayList<JCheckBox>();
		origen.add(excursion.destinoExcur.checkBox_madrid);
		origen.add(excursion.destinoExcur.checkBox_barcelona);
		origen.add(excursion.destinoExcur.checkBox_sevilla);
		
		ArrayList<JCheckBox> destino = new ArrayList<JCheckBox>();
		
		destino.add(excursion.destinoExcur.checkBox_castillo);
		destino.add(excursion.destinoExcur.checkBox_museo);
		destino.add(excursion.destinoExcur.checkBox_parque);
		excursion.configExcursion.comboBox_origen.removeAllItems();
		excursion.configExcursion.comboBox_destino.removeAllItems();
		
		for (int i=0; i<origen.size(); i++) {
			if (origen.get(i).isSelected())	
				excursion.configExcursion.comboBox_origen.addItem(origen.get(i).getText());
			
		}
		
		
		for (int i=0; i<destino.size(); i++) {
			if (destino.get(i).isSelected()) 
				excursion.configExcursion.comboBox_destino.addItem(destino.get(i).getText());	
		}
		
	}


}
