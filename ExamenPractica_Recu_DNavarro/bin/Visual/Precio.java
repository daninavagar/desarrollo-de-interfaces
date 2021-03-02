package Visual;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JSpinner;

public class Precio extends JPanel{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	JLabel labelTitulo;
	JLabel labelnumero;
	JLabel lblMenosDe;
	JLabel label_20;
	JLabel label_25;
	JSpinner spinner;
	JSpinner spinner_1;
	JSpinner spinner_2;
	public Precio() {
		
		setLayout(null);
		setVisible(false);
		
		labelTitulo = new JLabel("PRECIOS POR GRUPOS");
		labelTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		labelTitulo.setBounds(124, 24, 202, 29);
		labelTitulo.setFont(new Font("Tahoma", Font.BOLD, 17));
		add(labelTitulo);
		
		labelnumero = new JLabel("Número de alumnos");
		labelnumero.setHorizontalAlignment(SwingConstants.CENTER);
		labelnumero.setBounds(124, 65, 202, 29);
		labelnumero.setFont(new Font("Tahoma", Font.PLAIN, 14));
		add(labelnumero);
		
		lblMenosDe = new JLabel("Menos de 15");
		lblMenosDe.setHorizontalAlignment(SwingConstants.CENTER);
		lblMenosDe.setBounds(72, 108, 85, 14);
		add(lblMenosDe);
		
		label_20 = new JLabel("Entre 15 y 25");
		label_20.setHorizontalAlignment(SwingConstants.CENTER);
		label_20.setBounds(72, 154, 85, 14);
		add(label_20);
		
		label_25 = new JLabel("M\u00E1s de 25");
		label_25.setHorizontalAlignment(SwingConstants.CENTER);
		label_25.setBounds(72, 198, 85, 14);
		add(label_25);
		
		spinner = new JSpinner();
		spinner.setBounds(251, 105, 49, 20);
		add(spinner);
		
		spinner_1 = new JSpinner();
		spinner_1.setBounds(251, 151, 49, 20);
		add(spinner_1);
		
		spinner_2 = new JSpinner();
		spinner_2.setBounds(251, 195, 49, 20);
		add(spinner_2);
		
		
		
	}
}
