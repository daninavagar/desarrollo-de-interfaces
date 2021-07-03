package DirectorTutor;
 
import javax.swing.JComboBox; 
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.UIManager;


public class ConfigExcursion extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JLabel lbl_origen;
	private JLabel lbl_destino;
	private JRadioButton radiobtn_ida;
	private JRadioButton radiobtn_vuelta;
	private JComboBox<String> comboBox_origen;
	private JComboBox<String> comboBox_destino;
	private JLabel lbl_alumnos;
	private JLabel lbl_coste;
	private JTextField textField_coste;
	private JSpinner spinner_alumnos;
	
	public ConfigExcursion() {
		
		setLayout(null);
		setVisible(false);
		lbl_origen = new JLabel("ORIGEN");
		lbl_origen.setBounds(64, 76, 66, 14);
		add(lbl_origen);
		
		lbl_destino = new JLabel("DESTINO");
		lbl_destino.setBounds(64, 118, 66, 14);
		add(lbl_destino);
		
		comboBox_origen = new JComboBox<String>();
		getComboBox_origen().setBorder(UIManager.getBorder("Tree.editorBorder"));
		getComboBox_origen().setBounds(166, 73, 133, 22);
		
		add(getComboBox_origen());
		
		comboBox_destino = new JComboBox<String>();
		getComboBox_destino().setBorder(UIManager.getBorder("Tree.editorBorder"));
		getComboBox_destino().setBounds(166, 115, 133, 22);
		add(getComboBox_destino());
		
		radiobtn_ida = new JRadioButton("IDA");
		radiobtn_ida.setBounds(64, 160, 66, 23);
		add(radiobtn_ida);
		
		radiobtn_vuelta = new JRadioButton("IDA + VUELTA");
		radiobtn_vuelta.setBounds(130, 160, 120, 23);
		add(radiobtn_vuelta);
		
		lbl_alumnos = new JLabel("Número de alumnos");
		lbl_alumnos.setBounds(64, 185, 120, 50);
		add(lbl_alumnos);
		
		lbl_coste = new JLabel("Coste total de la excursión *");
		lbl_coste.setToolTipText("Pulsa en la caja para ver el precio de la excursión");
		lbl_coste.setBounds(64, 215, 165, 50);
		add(lbl_coste);
		
		spinner_alumnos = new JSpinner();
		getSpinner_alumnos().setModel(new SpinnerNumberModel(1, 1, 50, 1));
		getSpinner_alumnos().setBounds(250, 200, 49, 20);
		getSpinner_alumnos().setEditor(new JSpinner.DefaultEditor(getSpinner_alumnos()));
		add(getSpinner_alumnos());
		
		textField_coste = new JTextField();
		getTextField_coste().setBounds(250, 230, 49, 20);
		getTextField_coste().setEditable(false);
		add(getTextField_coste());
	}
	
	public boolean compruebaOrigen() {
		
		boolean exit = false;
		
		
		if (getComboBox_origen().getItemCount() <= 0 || getComboBox_destino().getItemCount() <= 0) {
			return exit;
		} else {
			exit = true;
		}
		return exit;
	}

	public JRadioButton getRadiobtn_ida() {
		return radiobtn_ida;
	}

	public void setRadiobtn_ida(JRadioButton radiobtn_ida) {
		this.radiobtn_ida = radiobtn_ida;
	}

	public JRadioButton getRadiobtn_vuelta() {
		return radiobtn_vuelta;
	}

	public void setRadiobtn_vuelta(JRadioButton radiobtn_vuelta) {
		this.radiobtn_vuelta = radiobtn_vuelta;
	}

	public JTextField getTextField_coste() {
		return textField_coste;
	}

	public JSpinner getSpinner_alumnos() {
		return spinner_alumnos;
	}

	public JComboBox<String> getComboBox_origen() {
		return comboBox_origen;
	}

	public JComboBox<String> getComboBox_destino() {
		return comboBox_destino;
	}
	
	
}
