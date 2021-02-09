package Visual;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Resumen extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	JLabel lbl_tutoria;
	JTextField textField_resumen;
	JButton btn_guardar;
	
	public Resumen() {
		
		setLayout(null);
		lbl_tutoria = new JLabel("RESUMEN TUTORÍA");
		lbl_tutoria.setFont(new Font("Comic Sans", Font.BOLD, 13));
		lbl_tutoria.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_tutoria.setBounds(90, 11, 160, 31);
		add(lbl_tutoria);
		
		textField_resumen = new JTextField();
		textField_resumen.setBounds(34, 53, 273, 127);
		add(textField_resumen);
		textField_resumen.setColumns(10);
		
		btn_guardar = new JButton("GUARDAR");
		btn_guardar.setBounds(126, 215, 95, 23);
		add(btn_guardar);
	}
}
