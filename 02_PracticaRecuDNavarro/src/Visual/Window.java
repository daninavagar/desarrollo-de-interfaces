package Visual;

import javax.swing.JFrame;

public class Window extends JFrame{
	
	Event event = new Event();
	Menu menu = new Menu();
	public Window() {
		
		
		setVisible(true);
		setTitle("COMPARADOR ARCHIVOS");
		setBounds(100, 100, 700, 600);
		setResizable(false);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		addWindowListener(event.Close);
		
		
		getContentPane().add(menu.menuBar);
		
		menu.Item_2_Archivo.addActionListener(event.Close_1);
		menu.Item_1_Acerca.addActionListener(event.About);
		
		
	}
}
