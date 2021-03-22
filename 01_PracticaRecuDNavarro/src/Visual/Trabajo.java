package Visual;

import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.AbstractListModel;
import javax.swing.ListSelectionModel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class Trabajo extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	JTextArea textArea;
	JLabel labelTitulo;
	JTextField textField;
	JList list = new JList();
	
	
	public Trabajo() {
		
		setBounds(100, 100, 700, 600);
		setLayout(null);
		
		labelTitulo = new JLabel("VENTANA TRABAJO");
		labelTitulo.setFont(new Font("Verdana", Font.BOLD, 23));
		labelTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		labelTitulo.setBounds(219, 25, 262, 54);
		add(labelTitulo);
		
		textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setBounds(122, 247, 456, 256);
		add(textArea);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(199, 101, 302, 20);
		add(textField);
		
		char[] Mayus = new char[26];
		char[] Minus = new char[26];
		String[] abc = new String[52];
		ArrayList<String> letras = new ArrayList();
		
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
		JLabel lblNewLabel = new JLabel("Selecciona un C\u00E1racter*");
		DefaultListModel<String> listModel = new DefaultListModel<String>();
		list.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				listModel.addElement(abc.toString());
				JOptionPane.showInputDialog(null, "Selecciona caracter", "Caracter", JOptionPane.QUESTION_MESSAGE, null, abc, "A");		
			}
		});
		lblNewLabel.setToolTipText("Pulsa para seleccionar los caracteres");
		lblNewLabel.setBounds(122, 173, 138, 14);
		add(lblNewLabel);
		
		

		
		
		
		
	}
}
