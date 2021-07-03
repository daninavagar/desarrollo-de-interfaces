package ComparadorArchivos;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Menu {

	private JMenuBar menuBar;
	private JMenu mnArchivo;
	private JMenuItem Item_1_Archivo;
	private JMenuItem Item_2_Archivo;
	private JMenuItem Item_Salir;
	private JMenu mnAcercaDe;
	private JMenuItem Item_1_Acerca;
	
	
	
	public Menu() {
		
		
		menuBar = new JMenuBar();
		
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



	public JMenuBar getMenuBar() {
		return menuBar;
	}



	public void setMenuBar(JMenuBar menuBar) {
		this.menuBar = menuBar;
	}



	public JMenuItem getItem_1_Archivo() {
		return Item_1_Archivo;
	}



	public void setItem_1_Archivo(JMenuItem item_1_Archivo) {
		Item_1_Archivo = item_1_Archivo;
	}



	public JMenuItem getItem_2_Archivo() {
		return Item_2_Archivo;
	}



	public void setItem_2_Archivo(JMenuItem item_2_Archivo) {
		Item_2_Archivo = item_2_Archivo;
	}



	public JMenuItem getItem_Salir() {
		return Item_Salir;
	}



	public void setItem_Salir(JMenuItem item_Salir) {
		Item_Salir = item_Salir;
	}



	public JMenuItem getItem_1_Acerca() {
		return Item_1_Acerca;
	}



	public void setItem_1_Acerca(JMenuItem item_1_Acerca) {
		Item_1_Acerca = item_1_Acerca;
	}

	
}
