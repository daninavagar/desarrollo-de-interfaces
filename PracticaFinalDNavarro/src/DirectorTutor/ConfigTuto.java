package DirectorTutor;

import java.awt.TextField;  

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class ConfigTuto extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	JLabel lbl_asunto;
	JLabel lbl_asistente;
	TextField textFieldAsunto;
	JButton btn_reset;
	JButton btn_resumen;
	JCheckBox checkBox_tutor;
	JCheckBox checkBox_padre;
	JCheckBox checkBox_alumno;
	JCheckBox checkBox_director;

	
	
	
	
	public ConfigTuto() {
		
		setLayout(null);
		setVisible(false);
		
		lbl_asunto = new JLabel("ASUNTO:");
		lbl_asunto.setBounds(40, 25, 90, 20);
		add(lbl_asunto);
		
		lbl_asistente = new JLabel("ASISTENTES:");
		lbl_asistente.setBounds(40, 130, 90, 20);
		add(lbl_asistente);
		
		textFieldAsunto = new TextField();
		textFieldAsunto.setBounds(150, 25, 175, 80);
		add(textFieldAsunto);
		
		checkBox_tutor = new JCheckBox("TUTOR");
		checkBox_tutor.setBounds(150, 130, 65, 20);
		add(checkBox_tutor);
		
		checkBox_padre = new JCheckBox("PADRE");
		checkBox_padre.setBounds(250, 130, 90, 20);
		add(checkBox_padre);
		
		checkBox_director = new JCheckBox("DIRECTOR");
		checkBox_director.setBounds(150, 150, 85, 20);
		add(checkBox_director);
		
		
		checkBox_alumno = new JCheckBox("ALUMNO");
		checkBox_alumno.setBounds(250, 150, 90, 20);
		add(checkBox_alumno);
		
		btn_reset = new JButton("RESET");
		btn_reset.setBounds(64, 200, 90, 20);
		add(btn_reset);
		
		btn_resumen = new JButton("RESUMEN");
		btn_resumen.setBounds(190, 200, 90, 20);
		add(btn_resumen);
		
	}
	
	
}
