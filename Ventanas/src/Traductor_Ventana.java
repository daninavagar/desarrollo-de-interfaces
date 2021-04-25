import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;


public class Traductor_Ventana {

	private JFrame frmTraductorVentana;
	private JTextField textField_TRADUCIDA;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Traductor_Ventana window = new Traductor_Ventana();
					window.frmTraductorVentana.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Traductor_Ventana() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		// MOSTRAR PANTALLA EN EL MEDIO, LARGO PANTALLA/2 - largo aplicacion 
		frmTraductorVentana = new JFrame();
		frmTraductorVentana.setTitle("TRADUCTOR VENTANA");
		frmTraductorVentana.setBounds(100, 100, 450, 300);
		frmTraductorVentana.setLocationRelativeTo(null); // VENTANA AL CENTRO DE LA PANTALLA SIEMPRE
		frmTraductorVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTraductorVentana.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_TEXTO = new JLabel("INTRODUCE UNA PALABRA");
		lblNewLabel_TEXTO.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_TEXTO.setBounds(10, 42, 233, 34);
		frmTraductorVentana.getContentPane().add(lblNewLabel_TEXTO);
		
		JTextField textField_CAJA = new JTextField();
		textField_CAJA.setFont(new Font("Tahoma", Font.PLAIN, 17));
		textField_CAJA.setBounds(252, 42, 159, 31);
		frmTraductorVentana.getContentPane().add(textField_CAJA);
		textField_CAJA.setColumns(10);
		
		JLabel lblNewLabel_TRADUCCION = new JLabel("TRADUCCION: ");
		lblNewLabel_TRADUCCION.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_TRADUCCION.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_TRADUCCION.setBounds(37, 108, 142, 60);
		frmTraductorVentana.getContentPane().add(lblNewLabel_TRADUCCION);
		
		textField_TRADUCIDA = new JTextField();
		textField_TRADUCIDA.setHorizontalAlignment(SwingConstants.CENTER);
		textField_TRADUCIDA.setEnabled(false);
		textField_TRADUCIDA.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_TRADUCIDA.setBounds(252, 108, 159, 60);
		frmTraductorVentana.getContentPane().add(textField_TRADUCIDA);
		textField_TRADUCIDA.setColumns(10);
		
		btnNewButton = new JButton("MOSTRAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (textField_CAJA.getText().isEmpty()) {
					
					JOptionPane.showMessageDialog(null, "NO HA INTRODUCIDO TEXTO", "ALGO ESTA MAL", JOptionPane.ERROR_MESSAGE);
					
				} else {
				
					try {
						traducir(textField_CAJA.getText(), textField_TRADUCIDA);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				
				 
			}

			private void traducir(String text, JTextField textField_TRADUCIDA) throws IOException {
				// TODO Auto-generated method stub
				
				Document document;
				String webPage = "https://www.spanishdict.com/traductor/"+text;
				document = Jsoup.connect(webPage).get();
				Elements palabra = document.getElementById("quickdef1-es").getElementsByClass("_1btShz4h");
				palabra.html();
				textField_TRADUCIDA.setText(palabra.html());
			}
		});
		btnNewButton.setToolTipText("PULSA PARA TRADUCIR");
		
		btnNewButton.setBounds(154, 194, 123, 34);
		frmTraductorVentana.getContentPane().add(btnNewButton);
	}
}
