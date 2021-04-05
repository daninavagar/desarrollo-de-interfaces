package Visual;

import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultHighlighter;
import javax.swing.text.Document;
import javax.swing.text.Highlighter;
import javax.swing.text.Highlighter.HighlightPainter;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import javax.swing.text.DefaultHighlighter.DefaultHighlightPainter;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JTextField;

import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.font.TextAttribute;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.UIManager;
import javax.swing.JCheckBox;
import javax.swing.JTextPane;

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
	JButton btn_reiniciar;
	Highlighter color;
	JCheckBox chckbxSegundoCaracter;
	JCheckBox chckbxTercerCaracter;
	JComboBox<?> comboBoxPrimer;
	JComboBox<?> comboBoxSegundo;
	JComboBox<?> comboBoxTercera;
	Highlighter highlighter;
	Highlighter highlighter2;
	Highlighter highlighter3;
	HighlightPainter pinta;
	HighlightPainter pinta2;
	HighlightPainter pinta3;
	JLabel lbl_1;
	JLabel lbl_2;
	JLabel lbl_3;
	
	
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
		textArea.setBounds(250, 289, 456, 289);
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
		btn_buscar.setBounds(435, 255, 89, 23);
		add(btn_buscar);
		
		btn_reiniciar = new JButton("Reiniciar");
		btn_reiniciar.setBounds(435, 589, 89, 23);
		btn_reiniciar.setEnabled(false);
		add(btn_reiniciar);
		
		
		chckbxSegundoCaracter = new JCheckBox("Segundo Caracter");
		chckbxSegundoCaracter.setBounds(417, 110, 138, 23);
		add(chckbxSegundoCaracter);
		
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
		
		lbl_1 = new JLabel("Contador 1");
		lbl_1.setBounds(250, 172, 106, 14);
		lbl_1.setVisible(false);
		add(lbl_1);
		
		lbl_2 = new JLabel("Contador 2");
		lbl_2.setBounds(417, 173, 106, 14);
		lbl_2.setVisible(false);
		add(lbl_2);
		
		lbl_3 = new JLabel("Contador 3");
		lbl_3.setBounds(583, 173, 94, 14);
		lbl_3.setVisible(false);
		add(lbl_3);
		
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
				highlighter.removeAllHighlights();
				lbl_1.setText(null);
				lbl_1.setVisible(false);
				lbl_2.setText(null);
				lbl_2.setVisible(false);
				lbl_3.setText(null);
				lbl_3.setVisible(false);
			}});
	}
	
	public void subrayar(){
		
		
		Primer_caracter();
		contarPrimero();
		if (segundo != null && tercer != null) {
			Segundo_caracter();
			contarSegundo();
			Tercer_caracter();
			contarTercer();
		} else if (segundo != null) {
			Segundo_caracter();
			contarSegundo();
		} else if (tercer != null) {
			contarTercer();
			Tercer_caracter();
		}
		
			
			
		
		
	}
	
	public void Primer_caracter() {
		
		
		highlighter = textArea.getHighlighter();
		pinta = new DefaultHighlightPainter(Color.GRAY);
		Document doc = textArea.getDocument();
		String text;
		try {
			text = doc.getText(0, doc.getLength());
			int pos1 = 0;
			while ( (pos1 = text.indexOf(primer, pos1)) >= 0 ) {
				highlighter.addHighlight(pos1, pos1 + primer.length(), pinta);
				pos1 += primer.length();
			}
		} catch (BadLocationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	public void contarPrimero() {
		
		
		String linea = textArea.getText();
		int pos = 0;
		char letra;
		char aux  = primer.charAt(0);

		for (int i=0; i<linea.length(); i++) {
			letra = linea.charAt(i);
			if (letra == aux) {
				pos++;	
			}
		}
		
		lbl_1.setVisible(true);
		lbl_1.setText(""+pos);

	}
	
	public void Segundo_caracter() {
		
		
		highlighter2 = textArea.getHighlighter();
		pinta2 = new DefaultHighlightPainter(Color.YELLOW);
		Document doc = textArea.getDocument();
		String text;
		try {
			text = doc.getText(0, doc.getLength());
			int pos2 = 0;
			while ( (pos2 = text.indexOf(segundo, pos2)) >= 0 ) {
				highlighter2.addHighlight(pos2, pos2 + segundo.length(), pinta2);
				pos2 += segundo.length();
			}
		} catch (BadLocationException e) {
			e.printStackTrace();
		}	
	}
	
	public void contarSegundo() {
		
		
		String linea = textArea.getText();
		int pos = 0;
		char letra;
		char aux  = segundo.charAt(0);

		for (int i=0; i<linea.length(); i++) {
			letra = linea.charAt(i);
			if (letra == aux) {
				pos++;
			}
		}
		
		lbl_2.setVisible(true);
		lbl_2.setText(""+pos);

	}
	
	public void Tercer_caracter() {
		
		
		highlighter3 = textArea.getHighlighter();
		pinta3 = new DefaultHighlightPainter(Color.CYAN);
		Document doc = textArea.getDocument();
		String text;
		try {
			text = doc.getText(0, doc.getLength());
			int pos3 = 0;
			while ( (pos3 = text.indexOf(tercer, pos3)) >= 0 ) {
				highlighter3.addHighlight(pos3, pos3 + tercer.length(), pinta3);
				pos3 += tercer.length();
			}
		} catch (BadLocationException e) {
			
			e.printStackTrace();
		}	
	}
	
	
	public void contarTercer() {
		
		
		String linea = textArea.getText();
		int pos = 0;
		char letra;
		char aux  = tercer.charAt(0);

		for (int i=0; i<linea.length(); i++) {
			letra = linea.charAt(i);
			if (letra == aux) {
				pos++;		
			}
		}
		
		lbl_3.setVisible(true);
		lbl_3.setText(""+pos);

	}
}
