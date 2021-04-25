package Visual;

import java.awt.CardLayout;  
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.Timer;

import Config.Usuarios;

@SuppressWarnings("serial")
public class Window extends JFrame {
	
	
	public Load LoadPanel = new Load();
	public Managment ManagmentPanel = new Managment();
	public Usuarios fichero = new Usuarios();
	private Timer time;
	private int cont;

	
	public Window() throws IOException {
		setResizable(false);
		setVisible(true);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setTitle("GESTION TUTORÍAS Y EXCURSIONES");
		setBounds(100, 100, 700, 600);
		setLocationRelativeTo(null);
		setIconImage(Toolkit.getDefaultToolkit().getImage("./src/Images/icon.png"));
		getContentPane().setLayout(new CardLayout(0, 0));
		getContentPane().add(LoadPanel);
		getContentPane().add(ManagmentPanel);
		
		
		time = new Timer(30, (ActionListener) new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				cont++;
				LoadPanel.progressBar.setValue(cont);
				if (LoadPanel.progressBar.getValue() < 10) {
					LoadPanel.progressBar.setValue(LoadPanel.progressBar.getValue() + 1);
				}
				if (LoadPanel.progressBar.getValue() == 30) {
					if (fichero.compruebaficheros()) {
						JOptionPane.showMessageDialog(null, "Faltan archivos", "Error en el acceso", 0, null);
						System.exit(0);
					}
				}
				if (LoadPanel.progressBar.getValue() == 100) {
					LoadPanel.setVisible(false);
					ManagmentPanel.setVisible(true);
					
				}
			}
			
		});
		time.start();
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(java.awt.event.WindowEvent evt) {
				String opciones[] = {"SI", "NO"};
				
				if (JOptionPane.showOptionDialog(null, "¿Estás seguro que quieres salir?", "SALIR", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[1]) == JOptionPane.YES_OPTION)
					System.exit(0);
            }
			
		
		});
		
		ManagmentPanel.login.btn_login.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ManagmentPanel.excursion.setVisible(false);
				ManagmentPanel.excursion.configExcursion.setVisible(false);
				ManagmentPanel.excursion.destinoExcur.setVisible(false);
				ManagmentPanel.resumen.setVisible(false);
				ManagmentPanel.resumen.resumenLimpia.setVisible(false);
				ManagmentPanel.resumen.resumenTuto.setVisible(false);
				ManagmentPanel.tutoria.setVisible(false);
				ManagmentPanel.tutoria.configTuto.setVisible(false);
				ManagmentPanel.tutoria.precio.setVisible(false);
				
				if (!ManagmentPanel.login.compruebaLogin()) {
					JOptionPane.showMessageDialog(null, "Algunos de los datos introducidos no son correctos", "Error en el acceso", JOptionPane.ERROR_MESSAGE);
				} else if (!ManagmentPanel.login.muestraPaneles()) {
					ManagmentPanel.login.textFieldUser.setEnabled(false);
					ManagmentPanel.login.passwordField_user.setEnabled(false);
					ManagmentPanel.excursion.setVisible(true);
					ManagmentPanel.excursion.destinoExcur.setVisible(true);
					ManagmentPanel.tutoria.setVisible(true);
					ManagmentPanel.tutoria.precio.setVisible(true);
					ManagmentPanel.resumen.setVisible(true);
					ManagmentPanel.resumen.resumenLimpia.setVisible(true);
					ManagmentPanel.login.btn_login.setEnabled(false);
					
				} else {
					ManagmentPanel.excursion.setVisible(true);
					ManagmentPanel.excursion.configExcursion.setVisible(true);
					ManagmentPanel.login.textFieldUser.setEnabled(false);
					ManagmentPanel.login.passwordField_user.setEnabled(false);
					ManagmentPanel.destinos();
				}
				
				
			}
		});
		
		ManagmentPanel.login.passwordField_user.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				ManagmentPanel.excursion.setVisible(false);
				ManagmentPanel.excursion.configExcursion.setVisible(false);
				ManagmentPanel.excursion.destinoExcur.setVisible(false);
				ManagmentPanel.resumen.setVisible(false);
				ManagmentPanel.resumen.resumenLimpia.setVisible(false);
				ManagmentPanel.resumen.resumenTuto.setVisible(false);
				ManagmentPanel.tutoria.setVisible(false);
				ManagmentPanel.tutoria.configTuto.setVisible(false);
				ManagmentPanel.tutoria.precio.setVisible(false);
				int key = e.getKeyCode();
				if (key == KeyEvent.VK_ENTER) {
					if (!ManagmentPanel.login.compruebaLogin()) {
						JOptionPane.showMessageDialog(null, "Algunos de los datos introducidos no son correctos", "Error en el acceso", JOptionPane.ERROR_MESSAGE);
					} else if (!ManagmentPanel.login.muestraPaneles()) {
						ManagmentPanel.login.textFieldUser.setEnabled(false);
						ManagmentPanel.login.passwordField_user.setEnabled(false);
						ManagmentPanel.excursion.setVisible(true);
						ManagmentPanel.excursion.destinoExcur.setVisible(true);
						ManagmentPanel.tutoria.setVisible(true);
						ManagmentPanel.tutoria.precio.setVisible(true);
						ManagmentPanel.resumen.setVisible(true);
						ManagmentPanel.resumen.resumenLimpia.setVisible(true);
						ManagmentPanel.login.btn_login.setEnabled(false);
						
					} else {
							
						
							ManagmentPanel.login.btn_login.setEnabled(false);
							ManagmentPanel.excursion.setVisible(true);
							ManagmentPanel.excursion.configExcursion.setVisible(true);
							ManagmentPanel.login.textFieldUser.setEnabled(false);
							ManagmentPanel.login.passwordField_user.setEnabled(false);
							ManagmentPanel.destinos();
						
						
					}
			
				}
			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}});
		
		ManagmentPanel.login.btn_salir.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String opciones[] = {"SI", "NO"};
				if (JOptionPane.showOptionDialog(null, "¿Estás seguro que quieres salir?", "SALIR", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[1]) == JOptionPane.YES_OPTION)
					System.exit(0);
			}
			
		});
		
		ManagmentPanel.login.btn_logout.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ManagmentPanel.login.btn_login.setEnabled(true);
				ManagmentPanel.login.textFieldUser.setEnabled(true);
				ManagmentPanel.login.passwordField_user.setEnabled(true);
				ManagmentPanel.login.radiobtn_excursiones.setSelected(false);
				ManagmentPanel.login.radiobtn_tutorias.setSelected(false);
				ManagmentPanel.login.radiobtn_excursiones.setEnabled(false);
				ManagmentPanel.login.radiobtn_tutorias.setEnabled(false);
				ManagmentPanel.excursion.setVisible(false);
				ManagmentPanel.resumen.setVisible(false);
				ManagmentPanel.tutoria.setVisible(false);
				ManagmentPanel.login.textFieldUser.setText(null);
				ManagmentPanel.login.passwordField_user.setText(null);
				
				ManagmentPanel.tutoria.configTuto.textFieldAsunto.setText(null);
				ManagmentPanel.tutoria.configTuto.checkBox_alumno.setSelected(false);
				ManagmentPanel.tutoria.configTuto.checkBox_padre.setSelected(false);
				ManagmentPanel.tutoria.configTuto.checkBox_tutor.setSelected(false);
				ManagmentPanel.tutoria.configTuto.checkBox_director.setSelected(false);
				
				ManagmentPanel.resumen.resumenTuto.txtArea_resumen.setText(null);
			}
			
		});
		
	}

}
