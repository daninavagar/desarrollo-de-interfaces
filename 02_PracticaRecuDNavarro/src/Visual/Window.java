package Visual;

import javax.swing.JFrame;

public class Window extends JFrame{
	
	Event event = new Event();
	public Window() {
		
		
		setVisible(true);
		setTitle("COMPARADOR ARCHIVOS");
		setBounds(100, 100, 700, 600);
		setResizable(false);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		addWindowListener(event.Close);
		
		
	}

}
