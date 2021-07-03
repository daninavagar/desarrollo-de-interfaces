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
		
		
		login.getBtn_salir().addActionListener(event.getClose_1());
		login.getBtn_login().addActionListener(new ActionListener() {

			
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
					login.getTextFieldUser().setEnabled(false);
					login.getPasswordField_user().setEnabled(false);
					excursion.setVisible(true);
					excursion.destinoExcur.setVisible(true);
					tutoria.setVisible(true);
					tutoria.precio.setVisible(true);
					summary.setVisible(true);
					summary.resumenLimpia.setVisible(true);
					login.getBtn_login().setEnabled(false);
					login.getBtn_login().setEnabled(false);
					
				} else {
					excursion.setVisible(true);
					excursion.configExcursion.setVisible(true);
					login.getTextFieldUser().setEnabled(false);
					login.getPasswordField_user().setEnabled(false);
					login.getBtn_login().setEnabled(false);
					destinos();
				}
				
				
			}
		});
		
		login.getPasswordField_user().addKeyListener(new KeyAdapter() {
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
						login.getTextFieldUser().setEnabled(false);
						login.getPasswordField_user().setEnabled(false);
						excursion.setVisible(true);
						excursion.destinoExcur.setVisible(true);
						tutoria.setVisible(true);
						tutoria.precio.setVisible(true);
						summary.setVisible(true);
						summary.resumenLimpia.setVisible(true);
						login.getBtn_login().setEnabled(false);
						
					} else {
						excursion.setVisible(true);
						excursion.configExcursion.setVisible(true);
						login.getTextFieldUser().setEnabled(false);
						login.getPasswordField_user().setEnabled(false);
						destinos();
				}

				}
			}
		});
		
		
		login.getBtn_logout().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				login.getBtn_login().setEnabled(true);
				login.getTextFieldUser().setEnabled(true);
				login.getPasswordField_user().setEnabled(true);
				login.getRadiobtn_excursiones().setSelected(false);
				login.getRadiobtn_tutorias().setSelected(false);
				login.getRadiobtn_excursiones().setEnabled(false);
				login.getRadiobtn_tutorias().setEnabled(false);
				excursion.setVisible(false);
				summary.setVisible(false);
				tutoria.setVisible(false);
				login.getTextFieldUser().setText(null);
				login.getPasswordField_user().setText(null);
				
				tutoria.configTuto.getTextFieldAsunto().setText(null);
				tutoria.configTuto.getCheckBox_alumno().setSelected(false);
				tutoria.configTuto.getCheckBox_padre().setSelected(false);
				tutoria.configTuto.getCheckBox_tutor().setSelected(false);
				tutoria.configTuto.getCheckBox_director().setSelected(false);
				
				summary.resumenTuto.getTxtArea_resumen().setText(null);
			}
			
		});

		login.getRadiobtn_excursiones().addActionListener(new ActionListener() {

			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (login.getRadiobtn_excursiones().isSelected()) {
					excursion.setVisible(true);
					excursion.configExcursion.setVisible(true);
					login.getRadiobtn_tutorias().setSelected(false);
					tutoria.setVisible(false);
					summary.setVisible(false);
				} 
				 
			}
			
		});
		
		login.getRadiobtn_tutorias().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (login.getRadiobtn_tutorias().isSelected()) {
					tutoria.setVisible(true);
					tutoria.configTuto.setVisible(true);
					tutoria.precio.setVisible(false);
					summary.setVisible(true);
					summary.resumenTuto.setVisible(true);
					login.getRadiobtn_excursiones().setSelected(false);
					excursion.setVisible(false);
				} 
			}
			
		});
		
		excursion.configExcursion.getRadiobtn_ida().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (excursion.configExcursion.getRadiobtn_ida().isSelected()) 
					excursion.configExcursion.getRadiobtn_vuelta().setSelected(false);
			}});
		
		excursion.configExcursion.getRadiobtn_vuelta().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (excursion.configExcursion.getRadiobtn_vuelta().isSelected()) 
					excursion.configExcursion.getRadiobtn_ida().setSelected(false);
			}});
		
		tutoria.configTuto.getBtn_resumen().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ArrayList<String> asistentes = new ArrayList<String>();
				ArrayList<JCheckBox> asis = new ArrayList<JCheckBox>();
				asis.add(tutoria.configTuto.getCheckBox_tutor());
				asis.add(tutoria.configTuto.getCheckBox_padre());
				asis.add(tutoria.configTuto.getCheckBox_director());
				asis.add(tutoria.configTuto.getCheckBox_alumno());
				
				for (int i=0; i<asis.size(); i++) {
					if (asis.get(i).isSelected()) {
						asistentes.add(asis.get(i).getText());
					}
				}
				if (tutoria.configTuto.getTextFieldAsunto().getText().isEmpty() || asistentes.isEmpty())
					JOptionPane.showInternalMessageDialog(null, "Asunto vacio o marca los selecciona los asistentes", "Asunto", JOptionPane.WARNING_MESSAGE, null);
				else {
					String aux = tutoria.configTuto.getTextFieldAsunto().getText();
					
					Date fecha = new Date();
					DateFormat fechaFormato = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
					summary.resumenTuto.getTxtArea_resumen().setText("Fecha y hora " + fechaFormato.format(fecha) + "\nASUNTO: " + aux
													+ "\n\nASISTENTES: \n" + asistentes + "\n\n");
				}
				
				
			}
			
		});
		
		tutoria.configTuto.getBtn_reset().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				tutoria.configTuto.getTextFieldAsunto().setText(null);
				tutoria.configTuto.getCheckBox_tutor().setSelected(false);
				tutoria.configTuto.getCheckBox_padre().setSelected(false);
				tutoria.configTuto.getCheckBox_alumno().setSelected(false);
				tutoria.configTuto.getCheckBox_director().setSelected(false);
				summary.resumenTuto.getTxtArea_resumen().setText(null);
			}});
		
		summary.resumenLimpia.getBtn_limpia().addActionListener(new ActionListener() {

			@SuppressWarnings("deprecation")
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				excursion.destinoExcur.getCheckBox_barcelona().setSelected(false);
				excursion.destinoExcur.getCheckBox_madrid().setSelected(false);
				excursion.destinoExcur.getCheckBox_sevilla().setSelected(false);
				excursion.destinoExcur.getCheckBox_castillo().setSelected(false);
				excursion.destinoExcur.getCheckBox_museo().setSelected(false);
				excursion.destinoExcur.getCheckBox_parque().setSelected(false);
				
				tutoria.precio.getSpinner().setModel(new SpinnerNumberModel(new Integer(0), null, null, new Integer(1)));
				tutoria.precio.getSpinner_1().setModel(new SpinnerNumberModel(new Integer(0), null, null, new Integer(1)));
				tutoria.precio.getSpinner_2().setModel(new SpinnerNumberModel(new Integer(0), null, null, new Integer(1)));
			}});

		
		excursion.configExcursion.getTextField_coste().addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				double precio;
				Integer nAlumnos = (Integer)excursion.configExcursion.getSpinner_alumnos().getValue();
				Integer pocos = 0;
				Integer medios = 0;
				Integer muchos = 0;
				
				
				if ( !excursion.configExcursion.compruebaOrigen()) {
					JOptionPane.showMessageDialog(null, "EL DIRECTOR TIENE QUE SELECCIONAR El ORIGEN Y EL DESTINO", "Atencion", JOptionPane.WARNING_MESSAGE);
				} else {
					if (!excursion.configExcursion.getRadiobtn_vuelta().isSelected() &&  !excursion.configExcursion.getRadiobtn_ida().isSelected()) {
						JOptionPane.showMessageDialog(null, "TIENES QUE SELECCIONAR IDA O IDA Y VUELTA", "Atencion", JOptionPane.WARNING_MESSAGE);
					} else {
						if (excursion.configExcursion.getRadiobtn_vuelta().isSelected()) {
							if (nAlumnos < 15) {
								pocos = (Integer)tutoria.precio.getSpinner().getValue();
								precio = nAlumnos * pocos * 1.5;
								String precio_final = String.valueOf(precio);
								excursion.configExcursion.getTextField_coste().setText(precio_final);
								
								
							} else if (nAlumnos > 15 && nAlumnos < 25) {
								medios = (Integer)tutoria.precio.getSpinner_1().getValue();
								precio = nAlumnos * medios * 1.5;
								String precio_final = String.valueOf(precio);
								excursion.configExcursion.getTextField_coste().setText(precio_final);
							} else if (nAlumnos > 25) {
								muchos = (Integer)tutoria.precio.getSpinner_2().getValue();
								precio = nAlumnos * muchos * 1.5;
								String precio_final = String.valueOf(precio);
								excursion.configExcursion.getTextField_coste().setText(precio_final);
							}
							
						} else {
							if (nAlumnos < 15) {
								pocos = (Integer)tutoria.precio.getSpinner().getValue();
								precio = nAlumnos * pocos;
								String precio_final = String.valueOf(precio);
								excursion.configExcursion.getTextField_coste().setText(precio_final);
								
								
							} else if (nAlumnos > 15 && nAlumnos < 25) {
								medios = (Integer)tutoria.precio.getSpinner_1().getValue();
								precio = nAlumnos * medios;
								String precio_final = String.valueOf(precio);
								excursion.configExcursion.getTextField_coste().setText(precio_final);
							} else if (nAlumnos > 25) {
								muchos = (Integer)tutoria.precio.getSpinner_2().getValue();
								precio = nAlumnos * muchos;
								String precio_final = String.valueOf(precio);
								excursion.configExcursion.getTextField_coste().setText(precio_final);
							}
							
						}
					}
				}

			}
		});
	}
	
	public void destinos() {
		
		ArrayList<JCheckBox> origen = new ArrayList<JCheckBox>();
		origen.add(excursion.destinoExcur.getCheckBox_madrid());
		origen.add(excursion.destinoExcur.getCheckBox_barcelona());
		origen.add(excursion.destinoExcur.getCheckBox_sevilla());
		
		ArrayList<JCheckBox> destino = new ArrayList<JCheckBox>();
		
		destino.add(excursion.destinoExcur.getCheckBox_castillo());
		destino.add(excursion.destinoExcur.getCheckBox_museo());
		destino.add(excursion.destinoExcur.getCheckBox_parque());
		excursion.configExcursion.getComboBox_origen().removeAllItems();
		excursion.configExcursion.getComboBox_destino().removeAllItems();
		
		for (int i=0; i<origen.size(); i++) {
			if (origen.get(i).isSelected())	
				excursion.configExcursion.getComboBox_origen().addItem(origen.get(i).getText());
			
		}
		for (int i=0; i<destino.size(); i++) {
			if (destino.get(i).isSelected()) 
				excursion.configExcursion.getComboBox_destino().addItem(destino.get(i).getText());	
		}
		
	}

	public Login getLogin() {
		return login;
	}


}
