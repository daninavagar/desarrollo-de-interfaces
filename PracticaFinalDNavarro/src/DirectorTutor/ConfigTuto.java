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

	private JLabel lbl_asunto;
	private JLabel lbl_asistente;
	private TextField textFieldAsunto;
	private JButton btn_reset;
	private JButton btn_resumen;
	private JCheckBox checkBox_tutor;
	private JCheckBox checkBox_padre;
	private JCheckBox checkBox_alumno;
	private JCheckBox checkBox_director;

	
	
	
	
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





	public TextField getTextFieldAsunto() {
		return textFieldAsunto;
	}





	public void setTextFieldAsunto(TextField textFieldAsunto) {
		this.textFieldAsunto = textFieldAsunto;
	}





	public JButton getBtn_reset() {
		return btn_reset;
	}





	public JButton getBtn_resumen() {
		return btn_resumen;
	}





	public JCheckBox getCheckBox_tutor() {
		return checkBox_tutor;
	}





	public JCheckBox getCheckBox_padre() {
		return checkBox_padre;
	}





	public JCheckBox getCheckBox_alumno() {
		return checkBox_alumno;
	}





	public JCheckBox getCheckBox_director() {
		return checkBox_director;
	}
	
	
}
