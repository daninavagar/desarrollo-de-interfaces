package Visual;

import java.awt.CardLayout;  
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.Timer;

import Config.Usuarios;

@SuppressWarnings("serial")
public class Window  extends JFrame {
	
	
	public Load LoadPanel = new Load();
	public Managment ManagmentPanel = new Managment();
	public Usuarios fichero = new Usuarios();
	private Timer time;
	private int cont;

	
	public Window() throws IOException {
		setResizable(false);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
				if (LoadPanel.progressBar.getValue() == 100) {
					LoadPanel.setVisible(false);
					ManagmentPanel.setVisible(true);
				}
			}
			
		});
		time.start();
		
		ManagmentPanel.login.btn_login.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ManagmentPanel.login.radiobtn_excursiones.setSelected(false);
				ManagmentPanel.login.radiobtn_tutorias.setSelected(false);
				ManagmentPanel.excursion.setVisible(false);
				ManagmentPanel.resumen.setVisible(false);
				ManagmentPanel.tutoria.setVisible(false);
				if (!ManagmentPanel.login.compruebaLogin()) {
					JOptionPane.showMessageDialog(null, "Nombre/Contrseña", "Error en el acceso", 0, null);
				} else {
					ManagmentPanel.login.muestraPaneles();
					if (ManagmentPanel.login.radiobtn_excursiones.isSelected()) {
						ManagmentPanel.excursion.setVisible(true);
					}
				}
			}
		});
		
		ManagmentPanel.login.btn_salir.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (JOptionPane.showConfirmDialog(null, "Estas seguro que quieres salir", "SALIR", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
					System.exit(0);
			}
			
		});
		
		ManagmentPanel.login.btn_logout.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ManagmentPanel.login.radiobtn_excursiones.setSelected(false);
				ManagmentPanel.login.radiobtn_tutorias.setSelected(false);
				ManagmentPanel.excursion.setVisible(false);
				ManagmentPanel.resumen.setVisible(false);
				ManagmentPanel.tutoria.setVisible(false);
				ManagmentPanel.login.textFieldUser.setText(null);
				ManagmentPanel.login.passwordField_user.setText(null);
				
				ManagmentPanel.tutoria.textFieldAsunto.setText(null);
				ManagmentPanel.tutoria.checkBox_alumno.setSelected(false);
				ManagmentPanel.tutoria.checkBox_padre.setSelected(false);
				ManagmentPanel.tutoria.checkBox_tutor.setSelected(false);
				ManagmentPanel.tutoria.checkBox_director.setSelected(false);
				
				ManagmentPanel.resumen.txtArea_resumen.setText(null);
			}
			
		});
		
	}

}
