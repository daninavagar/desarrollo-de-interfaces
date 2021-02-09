package Visual;

import java.awt.CardLayout;  
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.Timer;

@SuppressWarnings("serial")
public class Window  extends JFrame {
	
	
	public Load LoadPanel = new Load();
	public Managment ManagmentPanel = new Managment();
	private Timer time;
	private int cont;

	
	public Window() throws IOException {
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("GESTION TUTORÍAS Y EXCURSIONES");
		setBounds(100, 100, 700, 600);
		setLocationRelativeTo(null);
		setIconImage(Toolkit.getDefaultToolkit().getImage("./src/Images/icon.png"));
		getContentPane().setLayout(new CardLayout(0, 0));
		add(LoadPanel);
		add(ManagmentPanel);
		
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
		
	}

}
