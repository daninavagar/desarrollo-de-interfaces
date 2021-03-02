package Visual;

import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

public class Precio extends JPanel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JLabel labeltitulo;
	JLabel label_2;
	JLabel label_pocos;
	JLabel label_medio;
	JLabel label_muchos;
	JSpinner spinner;
	JSpinner spinner_1;
	JSpinner spinner_2;

	public Precio() {
		
		setLayout(null);
		setVisible(false);
		
		labeltitulo = new JLabel("PRECIOS POR GRUPOS");
		labeltitulo.setFont(new Font("Tahoma", Font.BOLD, 22));
		labeltitulo.setBounds(46, 26, 305, 35);
		add(labeltitulo);
		
		label_2 = new JLabel("Número de alumnos");
		label_2.setBounds(98, 62, 128, 30);
		add(label_2);
		
		label_pocos = new JLabel("Menos de 15");
		label_pocos.setBounds(36, 103, 73, 14);
		add(label_pocos);
		
		label_medio = new JLabel("Entre 15 y 25");
		label_medio.setBounds(36, 153, 73, 14);
		add(label_medio);
		
		label_medio = new JLabel("Más de 25");
		label_medio.setBounds(36, 209, 73, 14);
		add(label_medio);
		
		spinner = new JSpinner();
		spinner.setBounds(183, 96, 43, 28);
		spinner.setModel(new SpinnerNumberModel(1, 1, null, 1));
		spinner.setEditor(new JSpinner.DefaultEditor(spinner));
		add(spinner);
		
		spinner_1 = new JSpinner();
		spinner_1.setBounds(183, 146, 43, 28);
		spinner_1.setModel(new SpinnerNumberModel(1, 1, null, 1));
		spinner_1.setEditor(new JSpinner.DefaultEditor(spinner_1));
		add(spinner_1);
		
		spinner_2 = new JSpinner();
		spinner_2.setBounds(183, 202, 43, 28);
		spinner_2.setModel(new SpinnerNumberModel(1, 1, null, 1));
		spinner_2.setEditor(new JSpinner.DefaultEditor(spinner_2));
		add(spinner_2);
		
		
		
	}
}
