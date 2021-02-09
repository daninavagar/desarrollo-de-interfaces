package Visual;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JTextField;

public class Excursiones extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	JLabel lbl_origen;
	JLabel lbl_destino;
	JRadioButton radiobtn_ida;
	JRadioButton radiobtn_vuelta;
	JComboBox<?> comboBox_origen;
	JComboBox<Object> comboBox_destino;
	JLabel lbl_alumnos;
	JLabel lbl_coste;
	JTextField textField_coste;
	JSpinner spinner_alumnos;
	
	public Excursiones() {
		
		setLayout(null);
		
		lbl_origen = new JLabel("ORIGEN");
		lbl_origen.setBounds(64, 76, 66, 14);
		add(lbl_origen);
		
		lbl_destino = new JLabel("DESTINO");
		lbl_destino.setBounds(64, 118, 66, 14);
		add(lbl_destino);
		
		comboBox_origen = new JComboBox<Object>();
		comboBox_origen.setModel(new DefaultComboBoxModel(new String[] {"ORIGEN"}));
		comboBox_origen.setBounds(166, 73, 86, 22);
		add(comboBox_origen);
		
		comboBox_destino = new JComboBox<Object>();
		comboBox_destino.setModel(new DefaultComboBoxModel(new String[] {"DESTINO"}));
		comboBox_destino.setBounds(166, 115, 86, 22);
		add(comboBox_destino);
		
		radiobtn_ida = new JRadioButton("IDA");
		radiobtn_ida.setBounds(64, 160, 66, 23);
		add(radiobtn_ida);
		
		radiobtn_vuelta = new JRadioButton("IDA + VUELTA");
		radiobtn_vuelta.setBounds(130, 160, 120, 23);
		add(radiobtn_vuelta);
		
		lbl_alumnos = new JLabel("N�mero de alumnos");
		lbl_alumnos.setBounds(64, 185, 120, 50);
		add(lbl_alumnos);
		
		lbl_coste = new JLabel("Coste total de la excursi�n");
		lbl_coste.setBounds(64, 215, 165, 50);
		add(lbl_coste);
		
		spinner_alumnos = new JSpinner();
		spinner_alumnos.setBounds(250, 200, 49, 20);
		add(spinner_alumnos);
		
		textField_coste = new JTextField();
		textField_coste.setBounds(250, 230, 49, 20);
		add(textField_coste);
	}
}
