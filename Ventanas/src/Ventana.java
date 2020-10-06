import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JToggleButton;
import java.awt.Dimension;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import net.miginfocom.swing.MigLayout;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JPasswordField;
import java.awt.Toolkit;
import java.awt.Font;

public class Ventana {

	private JFrame frmPrimeraVentana;
	private JPasswordField passwordField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana window = new Ventana();
					window.frmPrimeraVentana.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ventana() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPrimeraVentana = new JFrame();
		frmPrimeraVentana.setResizable(false);
		frmPrimeraVentana.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Users\\navarrodosa\\Pictures\\lenguaje-de-programacion-c.jpg"));
		frmPrimeraVentana.setAutoRequestFocus(false);
		frmPrimeraVentana.setTitle("PRIMERA VENTANA");
		frmPrimeraVentana.getContentPane().setBackground(new Color(204, 255, 255));
		frmPrimeraVentana.setBounds(100, 100, 450, 300);
		frmPrimeraVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblNewLabel = new JLabel("BIENVENIDO A MI PRIMERA VENTANA");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 11, 414, 14);
		
		JButton btnNewButton = new JButton("ENVIAR");
		btnNewButton.setBounds(231, 163, 86, 34);
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setForeground(Color.MAGENTA);
		frmPrimeraVentana.getContentPane().setLayout(null);
		frmPrimeraVentana.getContentPane().add(lblNewLabel);
		frmPrimeraVentana.getContentPane().add(btnNewButton);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("WINDOWS");
		rdbtnNewRadioButton.setBounds(308, 30, 109, 23);
		frmPrimeraVentana.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("LINUX");
		rdbtnNewRadioButton_1.setBounds(308, 66, 109, 23);
		frmPrimeraVentana.getContentPane().add(rdbtnNewRadioButton_1);
		
		JComboBox<?> comboBox = new JComboBox();
		comboBox.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
		comboBox.setToolTipText("");
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"ESPA\u00D1ITA", "OTRO NO ME VALE"}));
		comboBox.setBounds(20, 36, 106, 23);
		frmPrimeraVentana.getContentPane().add(comboBox);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(108, 198, 109, 20);
		frmPrimeraVentana.getContentPane().add(passwordField);
		
		JLabel lblNewLabel_1 = new JLabel("Contrase\u00F1a");
		lblNewLabel_1.setBounds(20, 201, 78, 14);
		frmPrimeraVentana.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Usuario");
		lblNewLabel_2.setBounds(20, 173, 46, 14);
		frmPrimeraVentana.getContentPane().add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(108, 170, 86, 20);
		frmPrimeraVentana.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("MAC");
		rdbtnNewRadioButton_2.setBounds(308, 103, 109, 23);
		frmPrimeraVentana.getContentPane().add(rdbtnNewRadioButton_2);
	}
}
