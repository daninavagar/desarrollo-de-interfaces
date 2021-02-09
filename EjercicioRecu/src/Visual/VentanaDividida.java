package Visual;

import java.awt.EventQueue;
import java.awt.Graphics;

import javax.swing.JFrame;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JPanel;
import javax.swing.Timer;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JCheckBox;
import javax.swing.ScrollPaneConstants;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;

import java.awt.CardLayout;
import javax.swing.JTextField;
import javax.swing.JPasswordField;


public class VentanaDividida {

	private JFrame frmPrueba;
	private Timer tiempo; 
	JPanel panel_1 = new JPanel();
	JPanel panel_2 = new JPanel();
	JPanel panel_3 = new JPanel();
	private JTextField textField;
	private JPasswordField passwordField;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaDividida window = new VentanaDividida();
					window.frmPrueba.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public VentanaDividida() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPrueba = new JFrame();
		frmPrueba.setTitle("PRUEBA");
		frmPrueba.getContentPane().setBackground(new Color(255, 182, 193));
		frmPrueba.setBounds(100, 100, 999, 601);
		frmPrueba.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPrueba.getContentPane().setLayout(new GridLayout(2, 2, 1, 1));
		frmPrueba.setLocationRelativeTo(null);
		
		@SuppressWarnings("serial")
		JPanel panel_5 = new JPanel() {
			@Override
			protected void paintComponent(Graphics g) {
				// TODO Auto-generated method stub
				super.paintComponent(g);
			}
		};
		
		JPanel panel_0 = new JPanel() {
			private static final long serialVersionUID = 1L;
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				Image imagen = null;
				try {
					imagen = ImageIO.read(new File("src/Ejemplos/descarga.jpg"));
					//imagen.getScaledInstance(frmPrueba.getWidth()/2, frmPrueba.getHeight()/2, Image.SCALE_SMOOTH);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				g.drawImage(imagen, 0, 0, frmPrueba.getWidth()/2, frmPrueba.getHeight()/2, null);
				//g.drawImage(imagen, 0, 0, null);
			}
		};
		panel_0.setBackground(new Color(154, 205, 50));
		frmPrueba.getContentPane().add(panel_0);
		panel_0.setLayout(null);
		
		JButton btnNewButton = new JButton("Mostrar Siguiente Panel ->");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//panel_1
				panel_1.setVisible(true);
			}
		});
		btnNewButton.setBounds(152, 232, 210, 28);
		panel_0.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("1");
		lblNewLabel.setBounds(208, 90, 55, 16);
		panel_0.add(lblNewLabel);
		
		JButton btnNewButton_4 = new JButton("Start");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tiempo.start();				
			}			
		});
		btnNewButton_4.setBounds(190, 130, 90, 28);
		panel_0.add(btnNewButton_4);
		panel_1.setVisible(false);
		
		
		panel_1.setBackground(new Color(64, 224, 208));
		frmPrueba.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("2");
		lblNewLabel_1.setBounds(243, 101, 55, 16);
		panel_1.add(lblNewLabel_1);
		
		JButton btnNewButton_1 = new JButton("Activar el P 3");
		btnNewButton_1.setBounds(189, 226, 133, 28);
		panel_1.add(btnNewButton_1);
		panel_2.setVisible(false);
		
		
		panel_2.setBackground(new Color(30, 144, 255));
		frmPrueba.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("3");
		lblNewLabel_2.setBounds(233, 178, 18, 16);
		panel_2.add(lblNewLabel_2);
		
		JButton btnNewButton_2 = new JButton("Login");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (loging()) {
					
					JOptionPane.showMessageDialog(null, "�Correcto!", "LOGIN", 1);
					panel_3.setVisible(true);
				}else {
					JOptionPane.showMessageDialog(null, "�ERROR EN LOS DATOS!", "LOGIN", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnNewButton_2.setBounds(191, 206, 113, 28);
		panel_2.add(btnNewButton_2);
		
		JLabel lblNewLabel_4 = new JLabel("USUARIO");
		lblNewLabel_4.setBounds(53, 43, 55, 16);
		panel_2.add(lblNewLabel_4);
		
		textField = new JTextField();
		textField.setBounds(182, 37, 122, 28);
		panel_2.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("CONTRASE\u00D1A");
		lblNewLabel_5.setBounds(53, 100, 82, 16);
		panel_2.add(lblNewLabel_5);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(182, 94, 122, 28);
		panel_2.add(passwordField);
		panel_3.setVisible(false);
		
		
		panel_3.setBackground(new Color(255, 0, 255));
		frmPrueba.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBounds(295, 105, 141, 93);
		panel_3.add(panel_7);
		panel_7.setBackground(Color.BLUE);
		
		JLabel lblNewLabel_3 = new JLabel("4");
		lblNewLabel_3.setBounds(249, 137, 55, 16);
		panel_3.add(lblNewLabel_3);
		
		JButton btnNewButton_3 = new JButton("Desactivar todos menos el 1");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_1.setVisible(false);
				panel_3.setVisible(false);
				panel_2.setVisible(false);
				Component[] listaComp=panel_0.getComponents();
				for(int i=0;i<panel_0.getComponents().length;i++) {							
					listaComp[i].setEnabled(true);													
				}
			}
		});
		btnNewButton_3.setBounds(118, 210, 247, 28);
		panel_3.add(btnNewButton_3);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setBackground(Color.GREEN);
		scrollPane.setBounds(6, 43, 160, 110);
		panel_3.add(scrollPane);
		
		JPanel panel = new JPanel();
		scrollPane.setViewportView(panel);
			panel.setLayout(new GridLayout(4, 0, 0, 0));

			JCheckBox chckbxNewCheckBox = new JCheckBox("Econom\u00EDa");
			panel.add(chckbxNewCheckBox);				
			
			JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Deportes");
			panel.add(chckbxNewCheckBox_2);
			
			JCheckBox chckbxNewCheckBox_3 = new JCheckBox("Nacional");
			panel.add(chckbxNewCheckBox_3);
			
			JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Internacional");
			panel.add(chckbxNewCheckBox_1);
			
			JPanel panel_4 = new JPanel();
			panel_4.setBounds(295, 60, 141, 93);
			panel_3.add(panel_4);
			panel_4.setLayout(new CardLayout(0, 0));
			
			JPanel panel_8 = new JPanel();
			panel_8.setBackground(Color.YELLOW);
			panel_4.add(panel_8, "name_523752726838200");
			
			JPanel panel_6 = new JPanel();
			panel_6.setBounds(295, 43, 141, 93);
			panel_3.add(panel_6);
			panel_6.setBackground(Color.RED);
			
			JPanel panel_9 = new JPanel();
			panel_9.setBackground(Color.ORANGE);
			panel_9.setBounds(294, 21, 142, 72);
			panel_3.add(panel_9);
		
        tiempo=new Timer(1000,new ActionListener() {
        	int aux=0;	
			@Override
			public void actionPerformed(ActionEvent e) {
				
				switch (aux) {
					case 0: 
						Component[] listaComp=panel_0.getComponents();
						for(int i=0;i<panel_0.getComponents().length;i++) {							
							listaComp[i].setEnabled(false);													
						}
						panel_1.setVisible(true);
						aux++;
						tiempo.restart();
						break;
					
					case 1:
						panel_2.setVisible(true);
						aux++;
						tiempo.stop();
						break;	
				}
			}
		});
										
	}

	protected boolean loging() {
		Leer archivo= new Leer();
		return archivo.comprobarUser("src/Ejemplos/usuarios.txt", textField.getText(),passwordField.getText());
	}
}