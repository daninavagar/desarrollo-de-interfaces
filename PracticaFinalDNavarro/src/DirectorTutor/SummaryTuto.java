package DirectorTutor;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

public class SummaryTuto extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel lbl_tutoria;
	private JTextArea txtArea_resumen;
	private JButton btn_guardar;
	
	public SummaryTuto() {
		
		setLayout(null);
		setVisible(false);
		lbl_tutoria = new JLabel("RESUMEN TUTORÍA");
		lbl_tutoria.setFont(new Font("Comic Sans", Font.BOLD, 13));
		lbl_tutoria.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_tutoria.setBounds(90, 11, 160, 31);
		add(lbl_tutoria);
		
		txtArea_resumen = new JTextArea();
		txtArea_resumen.setBounds(34, 53, 273, 127);
		txtArea_resumen.setEditable(false);
		add(txtArea_resumen);
		txtArea_resumen.setColumns(10);
		
		btn_guardar = new JButton("GUARDAR");
		btn_guardar.setBounds(126, 215, 95, 23);
		add(btn_guardar);
		
		btn_guardar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				String ubica = "src/DirectorTutor/Files/Resumen.txt";
				
				
				String concepto = txtArea_resumen.getText();
				File resumen = new File(ubica);
				try {
					FileWriter resumen_w = new FileWriter(resumen, true);
					BufferedWriter resumen_wr = new BufferedWriter(resumen_w);
					resumen_wr.write(concepto);
					resumen_wr.close();
				} catch (IOException e1) {
					System.err.println("Erro al escribir: " + e1.getMessage());
				}
				
			}});
		
		
	}

	public JTextArea getTxtArea_resumen() {
		return txtArea_resumen;
	}

	public void setTxtArea_resumen(JTextArea txtArea_resumen) {
		this.txtArea_resumen = txtArea_resumen;
	}

	public JButton getBtn_guardar() {
		return btn_guardar;
	}

	public void setBtn_guardar(JButton btn_guardar) {
		this.btn_guardar = btn_guardar;
	}
	
}
