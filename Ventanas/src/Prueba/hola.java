package Prueba;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JProgressBar;

public class hola {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					hola window = new hola();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public hola() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.GRAY);
		frame.getContentPane().setLayout(null);
		
		JPanel panel1 = new JPanel();
		panel1.setBounds(0, 0, 434, 250);
		frame.getContentPane().add(panel1);
		panel1.setLayout(null);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setBounds(145, 233, 146, 17);
		progressBar.setValue(100);
		progressBar.setIndeterminate(true);
		progressBar.setStringPainted(true);
		progressBar.setString("100");
		panel1.add(progressBar);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(panel);
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\danin\\Downloads\\productivity.png"));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
