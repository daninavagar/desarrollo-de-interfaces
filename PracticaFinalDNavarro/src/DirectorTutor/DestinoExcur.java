package DirectorTutor;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JCheckBox;

public class DestinoExcur extends JPanel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel lblNewLabelTexto;
	private JLabel lblNewLabel;
	private JLabel lblDestino;
	private JCheckBox checkBox_madrid;
	private JCheckBox checkBox_barcelona;
	private JCheckBox checkBox_sevilla;
	private JCheckBox checkBox_museo;
	private JCheckBox checkBox_castillo;
	private JCheckBox checkBox_parque;
	
	
	public DestinoExcur() {
		
		setLayout(null);
		setVisible(false);
		lblNewLabelTexto = new JLabel("EXCURSIONES");
		lblNewLabelTexto.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabelTexto.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabelTexto.setBounds(32, 22, 188, 32);
		add(lblNewLabelTexto);
		
		lblNewLabel = new JLabel("ORIGEN");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(21, 65, 54, 14);
		add(lblNewLabel);
		
		lblDestino = new JLabel("DESTINO");
		lblDestino.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDestino.setHorizontalAlignment(SwingConstants.CENTER);
		lblDestino.setBounds(159, 65, 54, 14);
		add(lblDestino);
		
		checkBox_madrid = new JCheckBox("MADRID");
		getCheckBox_madrid().setBounds(21, 124, 97, 23);
		add(getCheckBox_madrid());
		
		checkBox_barcelona = new JCheckBox("BARCELONA");
		getCheckBox_barcelona().setBounds(21, 165, 97, 23);
		add(getCheckBox_barcelona());
		
		checkBox_sevilla = new JCheckBox("SEVILLA");
		getCheckBox_sevilla().setBounds(21, 205, 97, 23);
		add(getCheckBox_sevilla());
		
		checkBox_museo = new JCheckBox("MUSEO");
		getCheckBox_museo().setBounds(159, 124, 97, 23);
		add(getCheckBox_museo());
		
		checkBox_castillo = new JCheckBox("CASTILLO");
		getCheckBox_castillo().setBounds(159, 165, 97, 23);
		add(getCheckBox_castillo());
		
		checkBox_parque = new JCheckBox("PARQUE ATRACCIONES");
		getCheckBox_parque().setBounds(159, 205, 184, 23);
		add(getCheckBox_parque());
		
	}


	public JCheckBox getCheckBox_barcelona() {
		return checkBox_barcelona;
	}


	public JCheckBox getCheckBox_madrid() {
		return checkBox_madrid;
	}


	public JCheckBox getCheckBox_sevilla() {
		return checkBox_sevilla;
	}


	public JCheckBox getCheckBox_castillo() {
		return checkBox_castillo;
	}


	public JCheckBox getCheckBox_museo() {
		return checkBox_museo;
	}


	public JCheckBox getCheckBox_parque() {
		return checkBox_parque;
	}
}
