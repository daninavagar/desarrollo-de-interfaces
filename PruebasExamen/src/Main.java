
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.Timer;

import java.awt.CardLayout;

public class Main extends JFrame {

	private Carga carga = new Carga();
	private Login login = new Login();
	private Panel panel = new Panel();
	private Timer time;
	private ActionListener ac;
	private int cont = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Main() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setLocationRelativeTo(null);
		getContentPane().setLayout(new CardLayout(0, 0));
		getContentPane().add(carga);
		getContentPane().add(login);
		getContentPane().add(panel);
		
		
		ac = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				
				cont++;
				carga.GetBarra().setValue(cont);
				if (carga.GetBarra().getValue() == 100) {
					carga.setVisible(false);
					login.setVisible(true);
					time.stop();
					
				}
			}
		};
		
		time = new Timer(30, ac);
		time.start();
		
		login.getBotonLogin().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				/*
				if(login.compruebaLogin()) {
					login.setVisible(false);
					panel.setVisible(true);
				} else
					JOptionPane.showInternalMessageDialog(null, "Nombre/Contraseña \n Incorrectos", "Login Incorrecto", JOptionPane.ERROR_MESSAGE, null);*/
				login.setVisible(false);
				panel.setVisible(true);
			}});
		
	}

}
