package Visual;

import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultHighlighter;
import javax.swing.text.Highlighter;
import javax.swing.text.Highlighter.HighlightPainter;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;

import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.UIManager;
import javax.swing.JCheckBox;

public class Trabajo extends JPanel{

	/**
	 * 
	 */
	String primer = null, segundo = null, tercer = null;
	private static final long serialVersionUID = 1L;

	JTextArea textArea;
	JLabel labelTitulo;
	JTextField textField;
	JButton btn_buscar;
	JLabel lbl_caracter;
	JTextArea textArea_Contador;
	JButton btn_reiniciar;
	Highlighter color;
	JCheckBox chckbxSegundoCaracter;
	JCheckBox chckbxTercerCaracter;
	JLabel lbl_caracter_2;
	JLabel lbl_caracter_3;
	JComboBox<?> comboBoxPrimer;
	JComboBox<?> comboBoxSegundo;
	JComboBox<?> comboBoxTercera;
	
	
	public Trabajo() {
		setBorder(UIManager.getBorder("CheckBox.border"));
		
		setBounds(100, 100, 959, 692);
		setLayout(null);
		
		labelTitulo = new JLabel("VENTANA TRABAJO");
		labelTitulo.setFont(new Font("Verdana", Font.BOLD, 23));
		labelTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		labelTitulo.setBounds(348, 25, 262, 54);
		add(labelTitulo);
		
		textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setBounds(250, 289, 456, 256);
		add(textArea);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(328, 73, 302, 20);
		add(textField);
		
		char[] Mayus = new char[26];
		char[] Minus = new char[26];
		String[] abc = new String[52];
		ArrayList<String> letras = new ArrayList<String>();
		
		for (int i=0; i<26; i++) {
			Mayus[i] = (char) ('A'+i);
			letras.add(Character.toString(Mayus[i])); 
		}
		for (int i=0; i<26; i++) {
			Minus[i] = (char) ('a'+i);
			letras.add(Character.toString(Minus[i]));
		}
		for (int i=0; i<abc.length; i++) {
			abc[i] = letras.get(i);
		}
		lbl_caracter = new JLabel("Selecciona 1\u00BA C\u00E1racter*");
		
		
		
		

		lbl_caracter.setToolTipText("Pulsa para seleccionar el primer caracter");
		lbl_caracter.setBounds(250, 114, 138, 14);
		add(lbl_caracter);
		
		btn_buscar = new JButton("Buscar");
		btn_buscar.setBounds(250, 255, 89, 23);
		add(btn_buscar);
		
		textArea_Contador = new JTextArea();
		textArea_Contador.setEditable(false);
		textArea_Contador.setBounds(250, 556, 456, 22);
		add(textArea_Contador);
		
		btn_reiniciar = new JButton("Reiniciar");
		btn_reiniciar.setBounds(434, 589, 89, 23);
		btn_reiniciar.setEnabled(false);
		add(btn_reiniciar);
		
		
		chckbxSegundoCaracter = new JCheckBox("Segundo Caracter");
		chckbxSegundoCaracter.setBounds(417, 110, 138, 23);
		add(chckbxSegundoCaracter);
		
		lbl_caracter_2 = new JLabel("Selecciona 2\u00BA C\u00E1racter*");
		lbl_caracter_2.setToolTipText("Pulsa para seleccionar el segundo caracter");
		lbl_caracter_2.setBounds(619, 255, 138, 14);
		lbl_caracter_2.setVisible(false);
		add(lbl_caracter_2);
		
		ActionListener mostrar2Caracter = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (chckbxSegundoCaracter.isSelected()) {
					comboBoxSegundo.setVisible(true);
				} else {
					comboBoxSegundo.setVisible(false);
					segundo = null;
				}
			}};
		chckbxSegundoCaracter.addActionListener(mostrar2Caracter);
		
		
		chckbxTercerCaracter = new JCheckBox("Tercer Caracter");
		chckbxTercerCaracter.setBounds(583, 110, 124, 23);
		add(chckbxTercerCaracter);
		
		
		
		lbl_caracter_3 = new JLabel("Selecciona 3\u00BA C\u00E1racter*");
		lbl_caracter_3.setToolTipText("Pulsa para seleccionar el tercer caracter");
		lbl_caracter_3.setBounds(785, 255, 138, 14);
		lbl_caracter_3.setVisible(false);
		add(lbl_caracter_3);
		
		comboBoxPrimer = new JComboBox();
		comboBoxPrimer.setModel(new DefaultComboBoxModel(abc));
		comboBoxPrimer.setBounds(251, 139, 105, 22);
		comboBoxPrimer.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				primer = comboBoxPrimer.getSelectedItem().toString();
			}
			
		});
		add(comboBoxPrimer);
		
		comboBoxSegundo = new JComboBox();
		comboBoxSegundo.setBounds(417, 140, 105, 22);
		comboBoxSegundo.setModel(new DefaultComboBoxModel(abc));
		comboBoxSegundo.setVisible(false);
		comboBoxSegundo.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				segundo = comboBoxSegundo.getSelectedItem().toString();
			}
			
		});
		add(comboBoxSegundo);
		
		comboBoxTercera = new JComboBox();
		comboBoxTercera.setBounds(583, 140, 105, 22);
		comboBoxTercera.setModel(new DefaultComboBoxModel(abc));
		comboBoxTercera.setVisible(false);
		comboBoxTercera.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				tercer = comboBoxTercera.getSelectedItem().toString();
			}
			
		});
		add(comboBoxTercera);
		
		ActionListener mostrar3Caracter = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (chckbxTercerCaracter.isSelected()) {
					comboBoxTercera.setVisible(true);
				} else {
					comboBoxTercera.setVisible(false);
					tercer = null;
				}
			}};
		chckbxTercerCaracter.addActionListener(mostrar3Caracter);

		btn_buscar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (primer == null) {
					JOptionPane.showMessageDialog(null, "No has seleccionado el primer caracter" , "1º LETRA NO SELECCIONADA", JOptionPane.ERROR_MESSAGE, null);
				} else if (chckbxSegundoCaracter.isSelected() && segundo == null) {
					JOptionPane.showMessageDialog(null, "No has seleccionado el segundo caracter" , "2º LETRA NO SELECCIONADA", JOptionPane.ERROR_MESSAGE, null);
				} else if (chckbxTercerCaracter.isSelected() && tercer == null) {
					JOptionPane.showMessageDialog(null, "No has seleccionado el tercer caracter" , "3º LETRA NO SELECCIONADA", JOptionPane.ERROR_MESSAGE, null);
				}else {
					btn_buscar.setEnabled(false);
					btn_reiniciar.setEnabled(true);
					comboBoxPrimer.setEnabled(false);
					chckbxSegundoCaracter.setEnabled(false);
					chckbxSegundoCaracter.setSelected(false);
					comboBoxSegundo.setVisible(false);
					chckbxTercerCaracter.setEnabled(false);
					chckbxTercerCaracter.setSelected(false);
					comboBoxTercera.setVisible(false);
					subrayar();
				}
			}});
		
		btn_reiniciar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				textArea_Contador.setText(null);
				btn_buscar.setEnabled(true);
				btn_reiniciar.setEnabled(false);
				comboBoxPrimer.setEnabled(true);
				chckbxSegundoCaracter.setEnabled(true);
				chckbxTercerCaracter.setEnabled(true);
				comboBoxSegundo.setVisible(false);
				comboBoxTercera.setVisible(false);
				comboBoxPrimer.setModel(new DefaultComboBoxModel(abc));
				comboBoxSegundo.setModel(new DefaultComboBoxModel(abc));
				comboBoxTercera.setModel(new DefaultComboBoxModel(abc));
				primer = null;
				segundo = null;
				tercer = null;
			}});
	}
	
	public void subrayar() {
		
		
		/*try {
		
			color = textArea.getHighlighter();
			Document doc = textArea.getDocument();
			String text = doc.getText(0, doc.getLength());
			String linea = textArea.getText();
			int pos = 0;
			char letra;
			char aux  = primer.charAt(0);
			String pattern = "";
			/*
			
			while ( (pos = text.indexOf(pattern, pos)) >= 0 )  {
				color.addHighlight(pos, pos+pattern.length(), null)
			}
			
			for (int i=0; i<linea.length(); i++) {
				letra = linea.charAt(i);
				if (letra == aux) {
					pos++;
					
				}
			}*/
			//textArea_Contador.setText("El caracter " + aux + " ha salido un total de " + pos + " veces");
			
			StyledDocument doc = (StyledDocument) textArea.getDocument();
			SimpleAttributeSet letter = new SimpleAttributeSet();
			StyleConstants.setUnderline(letter, Boolean.TRUE);
			doc.setCharacterAttributes(20, 4, letter, false);
			try {
				doc.insertString(0, primer, letter);
			} catch (BadLocationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			textArea_Contador.setText("Primer caracter --> " + primer);
			if (segundo != null && tercer != null) {
				textArea_Contador.setText("Primer caracter --> " + primer + " 2º --> " + segundo + " 3º -->  " + tercer);
				
			} else if (segundo != null) {
				textArea_Contador.setText("Primer caracter --> " + primer + " 2º --> " + segundo);
			} else if (tercer != null) {
				textArea_Contador.setText("Primer caracter --> " + primer + " 3º -->  " + tercer);
			}
				
			
			
		/*} catch (BadLocationException e) {
			System.err.println(e.getMessage());
		}*/
		
	}
}
