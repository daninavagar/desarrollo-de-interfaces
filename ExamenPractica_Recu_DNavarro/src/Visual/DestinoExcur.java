package Visual;

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
	JLabel lblNewLabelTexto;
	JLabel lblNewLabel;
	JLabel lblDestino;
	JCheckBox checkBox_madrid;
	JCheckBox checkBox_barcelona;
	JCheckBox checkBox_sevilla;
	JCheckBox checkBox_museo;
	JCheckBox checkBox_castillo;
	JCheckBox checkBox_parque;
	
	
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
		checkBox_madrid.setBounds(21, 124, 97, 23);
		add(checkBox_madrid);
		
		checkBox_barcelona = new JCheckBox("BARCELONA");
		checkBox_barcelona.setBounds(21, 165, 97, 23);
		add(checkBox_barcelona);
		
		checkBox_sevilla = new JCheckBox("SEVILLA");
		checkBox_sevilla.setBounds(21, 205, 97, 23);
		add(checkBox_sevilla);
		
		checkBox_museo = new JCheckBox("MUSEO");
		checkBox_museo.setBounds(159, 124, 97, 23);
		add(checkBox_museo);
		
		checkBox_castillo = new JCheckBox("CASTILLO");
		checkBox_castillo.setBounds(159, 165, 97, 23);
		add(checkBox_castillo);
		
		checkBox_parque = new JCheckBox("PARQUE ATRACCIONES");
		checkBox_parque.setBounds(159, 205, 184, 23);
		add(checkBox_parque);
		
	}
}
