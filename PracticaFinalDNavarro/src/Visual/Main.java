package Visual;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.Timer;

import DirectorTutor.Load;
import DirectorTutor.Managment;


import java.awt.CardLayout;

public class Main {

	private JFrame frame;
	
	Event event = new Event();
	Selection selection = new Selection();
	Load load = new Load();
	Managment managment = new Managment();
	
	private Timer time;
	private int cont;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
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
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("PRÁCTICA FINAL");
		frame.setBounds(100, 100, 450, 300);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		frame.addWindowListener(event.Close);
		
		frame.getContentPane().add(selection);
		frame.getContentPane().add(load);
		frame.getContentPane().add(managment);
		
		selection.btn_Teacher.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				selection.setVisible(false);
				load.setVisible(true);
				time = new Timer(30, (ActionListener) new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						
						
						cont++;
						load.getBarraProgreso().setValue(cont);
						if (load.getBarraProgreso().getValue() < 10)
							load.getBarraProgreso().setValue(load.getBarraProgreso().getValue() + 1);
						if (load.getBarraProgreso().getValue() == 100) {
							load.setVisible(false);
							managment.setVisible(true);
							frame.setBounds(100, 100, 700, 600);
							frame.setLocationRelativeTo(null);
						}
					}});
				time.start();
			}});
		
		
		
	}

}
