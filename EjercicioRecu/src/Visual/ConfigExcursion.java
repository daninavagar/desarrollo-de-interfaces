package Visual;

<<<<<<< HEAD:ExamenPractica_Recu_DNavarro/src/Visual/ConfigExcursion.java
 
import javax.swing.JComboBox; 
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.UIManager;
=======

import javax.swing.JPanel;

import java.awt.CardLayout;
>>>>>>> 212dc2d473577471c05b68da2a11e8d0ec79f29c:EjercicioRecu/src/Visual/Excursiones.java


public class ConfigExcursion extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
<<<<<<< HEAD:ExamenPractica_Recu_DNavarro/src/Visual/ConfigExcursion.java

	JLabel lbl_origen;
	JLabel lbl_destino;
	JRadioButton radiobtn_ida;
	JRadioButton radiobtn_vuelta;
	JComboBox<String> comboBox_origen;
	JComboBox<String> comboBox_destino;
	JLabel lbl_alumnos;
	JLabel lbl_coste;
	JTextField textField_coste;
	JSpinner spinner_alumnos;
=======
	
	ConfigExcursion configExcursion = new ConfigExcursion();
	DestinoExcur destinoExcur = new DestinoExcur();
>>>>>>> 212dc2d473577471c05b68da2a11e8d0ec79f29c:EjercicioRecu/src/Visual/Excursiones.java
	
	public ConfigExcursion() {
		
		setLayout(new CardLayout(0, 0));
		setVisible(false);
<<<<<<< HEAD:ExamenPractica_Recu_DNavarro/src/Visual/ConfigExcursion.java
		lbl_origen = new JLabel("ORIGEN");
		lbl_origen.setBounds(64, 76, 66, 14);
		add(lbl_origen);
		
		lbl_destino = new JLabel("DESTINO");
		lbl_destino.setBounds(64, 118, 66, 14);
		add(lbl_destino);
		
		comboBox_origen = new JComboBox<String>();
		comboBox_origen.setBorder(UIManager.getBorder("Tree.editorBorder"));
		comboBox_origen.setBounds(166, 73, 133, 22);
		
		add(comboBox_origen);
		
		comboBox_destino = new JComboBox<String>();
		comboBox_destino.setBorder(UIManager.getBorder("Tree.editorBorder"));
		comboBox_destino.setBounds(166, 115, 133, 22);
		add(comboBox_destino);
		
		radiobtn_ida = new JRadioButton("IDA");
		radiobtn_ida.setBounds(64, 160, 66, 23);
		add(radiobtn_ida);
		
		radiobtn_vuelta = new JRadioButton("IDA + VUELTA");
		radiobtn_vuelta.setBounds(130, 160, 120, 23);
		add(radiobtn_vuelta);
		
		lbl_alumnos = new JLabel("Número de alumnos");
		lbl_alumnos.setBounds(64, 185, 120, 50);
		add(lbl_alumnos);
		
		lbl_coste = new JLabel("Coste total de la excursión *");
		lbl_coste.setToolTipText("Pulsa en la caja para ver el precio de la excursion");
		lbl_coste.setBounds(64, 215, 165, 50);
		add(lbl_coste);
		
		spinner_alumnos = new JSpinner();
		spinner_alumnos.setModel(new SpinnerNumberModel(1, 1, 50, 1));
		spinner_alumnos.setBounds(250, 200, 49, 20);
		spinner_alumnos.setEditor(new JSpinner.DefaultEditor(spinner_alumnos));
		add(spinner_alumnos);
		
		textField_coste = new JTextField();
		textField_coste.setBounds(250, 230, 49, 20);
		textField_coste.setEditable(false);
		add(textField_coste);
=======
		
		add(configExcursion);
		add(destinoExcur);
		
		configExcursion.setVisible(false);
		destinoExcur.setVisible(false);
		
>>>>>>> 212dc2d473577471c05b68da2a11e8d0ec79f29c:EjercicioRecu/src/Visual/Excursiones.java
	}
	
	public boolean compruebaOrigen() {
		
		boolean exit = false;
		
		
		if (comboBox_origen.getItemCount() <= 0 || comboBox_destino.getItemCount() <= 0) {
			return exit;
		} else {
			exit = true;
		}

		
		
		return exit;
	}
}
