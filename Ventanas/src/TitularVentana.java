import java.awt.EventQueue;  

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class TitularVentana {

	private JFrame frmTitularNoticia;
	private JTextField textField_muestra;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TitularVentana window = new TitularVentana();
					window.frmTitularNoticia.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TitularVentana() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTitularNoticia = new JFrame();
		frmTitularNoticia.setTitle("TITULAR NOTICIA");
		frmTitularNoticia.setBounds(100, 100, 704, 686);
		frmTitularNoticia.setLocationRelativeTo(null);
		frmTitularNoticia.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTitularNoticia.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("TITULAR");
		lblNewLabel.setFont(new Font("Tempus Sans ITC", Font.BOLD, 20));
		lblNewLabel.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(190, 31, 273, 76);
		frmTitularNoticia.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1_TEXTO = new JLabel("Introduzca Noticia MARCA");
		lblNewLabel_1_TEXTO.setBounds(45, 118, 223, 32);
		frmTitularNoticia.getContentPane().add(lblNewLabel_1_TEXTO);
		
		textField_muestra = new JTextField();
		textField_muestra.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textField_muestra.setEnabled(false);
		textField_muestra.setBounds(52, 226, 591, 380);
		frmTitularNoticia.getContentPane().add(textField_muestra);
		textField_muestra.setColumns(10);
		
		JButton btnNewButton_boton = new JButton("MOSTRAR");
		btnNewButton_boton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					noticia(textField_muestra);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}

			private void noticia(JTextField textField_muestra) throws IOException {
				// TODO Auto-generated method stub
				
				
				Document document;
				String web = "https://as.com";
				
				try {
					document = Jsoup.connect(web).get();
					Elements word = document.getElementsByClass("title");
					// word.text();
					textField_muestra.setText(word.text());
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		btnNewButton_boton.setToolTipText("Pulsa para mostrar titular pagina web");
		btnNewButton_boton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_boton.setBounds(378, 121, 172, 23);
		frmTitularNoticia.getContentPane().add(btnNewButton_boton);
		
		
	}

}
