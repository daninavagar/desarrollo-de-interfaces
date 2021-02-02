package Visual;

import java.awt.CardLayout; 
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Window extends JFrame{
	
	
	public Load LoadPanel;
	public Managment ManagmentPanel;
	public Action event = new Action();
	
	public Window() {
		
		setTitle("GESTION TUTORÍAS Y EXCURSIONES");
		setBounds(100, 100, 700, 600);
		setLocationRelativeTo(null);
		setIconImage(Toolkit.getDefaultToolkit().getImage("./src/Images/icon.png"));
		getContentPane().setLayout(new CardLayout(0, 0));
		LoadPanel = new Load();
		add(LoadPanel);
		ManagmentPanel = new Managment();
		add(ManagmentPanel);
		LoadPanel.mostrar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				LoadPanel.setVisible(false);
				ManagmentPanel.setVisible(true);
			}
			
		});

	}

}
