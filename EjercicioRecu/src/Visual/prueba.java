package Visual;

import java.awt.EventQueue;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import java.awt.GridLayout;
import net.miginfocom.swing.MigLayout;
import java.awt.Color;
import java.awt.CardLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSpinner;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;
import java.awt.Font;

public class prueba {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					prueba window = new prueba();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @throws IOException 
	 */
	public prueba() throws IOException {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * @throws IOException 
	 */
	private void initialize() throws IOException {
		frame = new JFrame();
		frame.setBounds(100, 100, 700, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, "name_43627789350600");
		panel.setLayout(new GridLayout(0, 2, 2, 2));
		
		JPanel panel_1 = new JPanel();
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("USUARIO");
		lblNewLabel.setBounds(64, 76, 66, 14);
		panel_1.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("vuelta");
		
		btnNewButton.setBounds(34, 228, 89, 23);
		panel_1.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("CONTRASE\u00D1A");
		lblNewLabel_2.setBounds(64, 118, 89, 14);
		panel_1.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(166, 73, 86, 20);
		panel_1.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(166, 115, 86, 20);
		panel_1.add(passwordField);
		
		JRadioButton rdbtnNewRadioButton_Excur = new JRadioButton("Excursiones");
		rdbtnNewRadioButton_Excur.setBounds(34, 179, 89, 23);
		panel_1.add(rdbtnNewRadioButton_Excur);
		
		JRadioButton rdbtnNewRadioButton_Tuto = new JRadioButton("Tutorias");
		rdbtnNewRadioButton_Tuto.setBounds(181, 179, 89, 23);
		panel_1.add(rdbtnNewRadioButton_Tuto);
		
		JPanel panel_2 = new JPanel();
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("ORIGEN");
		lblNewLabel_1.setBounds(64, 76, 66, 14);
		panel_2.add(lblNewLabel_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"ORIGEN"}));
		comboBox.setBounds(166, 73, 86, 22);
		panel_2.add(comboBox);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(153, 186, 49, 20);
		panel_2.add(spinner);
		
		JPanel panel_3 = new JPanel();
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("RESUMEN TUTORIA");
		lblNewLabel_3.setFont(new Font("Verdana", Font.BOLD, 13));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(90, 11, 160, 31);
		panel_3.add(lblNewLabel_3);
		
		textField_1 = new JTextField();
		textField_1.setBounds(34, 53, 273, 127);
		panel_3.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(126, 215, 89, 23);
		panel_3.add(btnNewButton_1);
		BufferedImage img = ImageIO.read(new File("./src/Images/fondo.jpg"));
	}
}
