package Visual;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;



@SuppressWarnings("serial")
public class Load extends JPanel{
	
	public JButton mostrar = new JButton();
	public Action hola = new Action();
	
	
	Load() {
		setLayout(null);
		setBackground(Color.GRAY);
		mostrar = new JButton("SIGUIENTE");
		mostrar.setBounds(170, 200, 120, 30);
		mostrar.setText("Mostrar");
		//mostrar.addActionListener(hola.hola());
		add(mostrar);
		
		
	}
}
