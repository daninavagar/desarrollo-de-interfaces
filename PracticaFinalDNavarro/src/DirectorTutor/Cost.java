package DirectorTutor;

import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

public class Cost extends JPanel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel labeltitulo;
	private JLabel label_2;
	private JLabel label_pocos;
	private JLabel label_medio;
	private JSpinner spinner;
	private JSpinner spinner_1;
	private JSpinner spinner_2;

	public Cost() {
		
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
		getSpinner().setBounds(183, 96, 43, 28);
		getSpinner().setModel(new SpinnerNumberModel(1, 1, null, 1));
		getSpinner().setEditor(new JSpinner.DefaultEditor(getSpinner()));
		add(getSpinner());
		
		spinner_1 = new JSpinner();
		getSpinner_1().setBounds(183, 146, 43, 28);
		getSpinner_1().setModel(new SpinnerNumberModel(1, 1, null, 1));
		getSpinner_1().setEditor(new JSpinner.DefaultEditor(getSpinner_1()));
		add(getSpinner_1());
		
		spinner_2 = new JSpinner();
		getSpinner_2().setBounds(183, 202, 43, 28);
		getSpinner_2().setModel(new SpinnerNumberModel(1, 1, null, 1));
		getSpinner_2().setEditor(new JSpinner.DefaultEditor(getSpinner_2()));
		add(getSpinner_2());
		
		
		
	}

	public JSpinner getSpinner() {
		return spinner;
	}

	public JSpinner getSpinner_1() {
		return spinner_1;
	}

	public JSpinner getSpinner_2() {
		return spinner_2;
	}
}
