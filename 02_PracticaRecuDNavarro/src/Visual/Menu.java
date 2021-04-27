package Visual;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Menu {

	JMenuBar menuBar;
	JMenu mnArchivo;
	JMenuItem Item_1_Archivo;
	JMenuItem Item_2_Archivo;
	JMenuItem Item_Salir;
	JMenu mnAcercaDe;
	JMenuItem Item_1_Acerca;
	
	
	
	public Menu() {
		
		
		menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 694, 22);
		
		
		mnArchivo = new JMenu("Archivo");
		menuBar.add(mnArchivo);
		
		Item_1_Archivo = new JMenuItem("JFileChooser 1");
		mnArchivo.add(Item_1_Archivo);
		
		Item_2_Archivo = new JMenuItem("JFileChooser 2");
		mnArchivo.add(Item_2_Archivo);
		
		Item_Salir = new JMenuItem("SALIR");
		mnArchivo.add(Item_Salir);
		
		mnAcercaDe = new JMenu("Acerca de");
		menuBar.add(mnAcercaDe);
		
		Item_1_Acerca = new JMenuItem("Sobre Comparador");
		mnAcercaDe.add(Item_1_Acerca);
		
	}
}
