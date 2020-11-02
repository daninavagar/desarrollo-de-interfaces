package TraductorClases;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
// import javax.swing.SwingConstants;


public class PanelPersonal extends JPanel{
	
	JLabel palabraIn, palabraOUT, tituloIn;
	JTextField textIn, textOut;
	JButton traducir;
	
	PanelPersonal() {
		
		setBackground(new Color(250,250,250));
		setLayout(null);
		palabraIn = new JLabel();
		palabraIn.setBounds(80, 80, 50, 50);
		palabraIn.setText("Palabra a Traducir");
		palabraIn.setSize(palabraIn.getPreferredSize());
		
		add(palabraIn);
		
		
		palabraOUT = new JLabel();
		palabraOUT.setBounds(80, 140, 50, 50);
		palabraOUT.setText("Palabra Traducida");
		palabraOUT.setSize(palabraOUT.getPreferredSize());
		
		add(palabraOUT);
		
		textIn = new JTextField();
		textIn.setBounds(200, 80, 80, 20);
		
		add(textIn);
		
		textOut = new JTextField();
		textOut.setBounds(200, 140, 80, 20);
		textOut.setEditable(false);
		
		add(textOut);
		
		traducir = new JButton("TRADUCIR");
		traducir.setBounds(170, 200, 120, 30);
		traducir.setText("MOSTRAR");
		traducir.setFont(new Font("Tahoma", Font.PLAIN, 15));
		traducir.setToolTipText("Pulsa para mostrar palabra traducida");
		AccionBoton miEvento = new AccionBoton(textIn, textOut);
		traducir.addActionListener(miEvento);
		
		add(traducir);
		
		
		
		
		}

}
