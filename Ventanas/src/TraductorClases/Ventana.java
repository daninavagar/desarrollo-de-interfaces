package TraductorClases;

import javax.swing.JFrame;

public class Ventana extends JFrame{
	

	public Ventana() {
		
		setTitle("Prueba Traductor");
		setBounds(100, 100, 450, 300);
		setLocationRelativeTo(null);
		
		PanelPersonal panel1 = new PanelPersonal();
		add(panel1);
		
		
	}

}
