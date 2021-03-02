package Visual;

import java.awt.TextField; 

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
<<<<<<< HEAD:ExamenPractica_Recu_DNavarro/src/Visual/ConfigTuto.java
=======

import java.awt.CardLayout;
import java.awt.TextField;
>>>>>>> 212dc2d473577471c05b68da2a11e8d0ec79f29c:EjercicioRecu/src/Visual/Tutorias.java

public class ConfigTuto extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
<<<<<<< HEAD:ExamenPractica_Recu_DNavarro/src/Visual/ConfigTuto.java
	JLabel lbl_asunto;
	JLabel lbl_asistente;
	TextField textFieldAsunto;
	JButton btn_reset;
	JButton btn_resumen;
	JCheckBox checkBox_tutor;
	JCheckBox checkBox_padre;
	JCheckBox checkBox_alumno;
	JCheckBox checkBox_director;
=======
	
	
	Precio precio = new Precio();
	ConfigTuto configTuto = new ConfigTuto();
>>>>>>> 212dc2d473577471c05b68da2a11e8d0ec79f29c:EjercicioRecu/src/Visual/Tutorias.java
	
	public ConfigTuto() {
		
		setLayout(new CardLayout(0, 0));
		setVisible(false);
<<<<<<< HEAD:ExamenPractica_Recu_DNavarro/src/Visual/ConfigTuto.java
		
		lbl_asunto = new JLabel("ASUNTO:");
		lbl_asunto.setBounds(40, 25, 90, 20);
		add(lbl_asunto);
		
		lbl_asistente = new JLabel("ASISTENTES:");
		lbl_asistente.setBounds(40, 130, 90, 20);
		add(lbl_asistente);
		
		textFieldAsunto = new TextField();
		textFieldAsunto.setBounds(150, 25, 175, 80);
		add(textFieldAsunto);
=======
>>>>>>> 212dc2d473577471c05b68da2a11e8d0ec79f29c:EjercicioRecu/src/Visual/Tutorias.java
		
		add(precio);
		add(configTuto);
		
		
		
		
		
		
		
<<<<<<< HEAD:ExamenPractica_Recu_DNavarro/src/Visual/ConfigTuto.java
=======
		
>>>>>>> 212dc2d473577471c05b68da2a11e8d0ec79f29c:EjercicioRecu/src/Visual/Tutorias.java
	}
	
	
}
