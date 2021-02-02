package TraductorClases;

import java.awt.event.ActionEvent;  
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class AccionBoton implements ActionListener{

	JTextField textIn = new JTextField();
	JTextField textOut = new JTextField();
	
	
	
	public AccionBoton(JTextField textIn, JTextField textOut) {

		this.textIn = textIn;
		this.textOut = textOut;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (textIn.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "NO HA INTRODUCIDO TEXTO", "ALGO ESTA MAL", JOptionPane.ERROR_MESSAGE);
		} else {
			traducir(textIn.getText(), textOut);
		}
	}

	private void traducir(String text, JTextField textOut2) {
		// TODO Auto-generated method stub
		Document document = null;
		String webPage = "https://www.spanishdict.com/traductor/"+text;
		try {
			document = Jsoup.connect(webPage).get();
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		Elements palabra = document.getElementById("quickdef1-es").getElementsByClass("_1btShz4h");
		textOut2.setText(palabra.html());
	}

}
