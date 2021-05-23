package Visual;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Selection extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Create the panel.
	 */
	
	JLabel lblTitle;
	JButton btn_Teacher;
	JButton btn_Highlighter;
	JButton btn_Comparator;
	public Selection() {

		setBounds(100, 100, 450, 300);
		setLayout(null);
		
		lblTitle = new JLabel("BIENVENIDO AL PANEL DE ELECCIÓN");
		lblTitle.setFont(new Font("Arial Black", Font.PLAIN, 16));
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setBounds(32, 11, 384, 47);
		add(lblTitle);
		
		btn_Teacher = new JButton("PRÁCTICA DIRECTOR / TUTOR\r\n");
		btn_Teacher.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn_Teacher.setBorder(UIManager.getBorder("Menu.border"));
		btn_Teacher.setHorizontalTextPosition(SwingConstants.CENTER);
		btn_Teacher.setBounds(64, 82, 321, 41);
		add(btn_Teacher);
		
		btn_Highlighter = new JButton("PRÁCTICA BUSCADOR CARACTERES\r\n\r\n");
		btn_Highlighter.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn_Highlighter.setBorder(UIManager.getBorder("Menu.border"));
		btn_Highlighter.setHorizontalTextPosition(SwingConstants.CENTER);
		btn_Highlighter.setBounds(64, 134, 321, 41);
		add(btn_Highlighter);
		
		btn_Comparator = new JButton("PRÁCTICA COMPARADOR ARCHIVOS\r\n\r\n");
		btn_Comparator.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn_Comparator.setBorder(UIManager.getBorder("Menu.border"));
		btn_Comparator.setHorizontalTextPosition(SwingConstants.CENTER);
		btn_Comparator.setBounds(64, 186, 321, 41);
		add(btn_Comparator);
	}
}
