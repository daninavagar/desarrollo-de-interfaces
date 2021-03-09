package Visual;

import javax.swing.JPanel;
import javax.swing.JTree;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.filechooser.FileSystemView;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;
import javax.swing.tree.DefaultTreeModel;

import java.awt.Font;
import java.io.*;
import java.util.ArrayList;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import javax.swing.AbstractListModel;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JButton;

public class Seleccion extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	JTree tree;
	JComboBox comboArchivos;
	ArrayList<String> listaArchivos = new ArrayList();
	JFileChooser fr = new JFileChooser();
	FileSystemView fw = fr.getFileSystemView();
	String escritorio = fw.getHomeDirectory().getAbsolutePath();
	JList list;
	JButton btnEnviar;
	public Seleccion() {
		
		
		
		
		setBounds(100, 100, 700, 600);
		setLayout(null);
		
		JLabel labelTitulo = new JLabel("SELECCION DOCUMENTO");
		labelTitulo.setFont(new Font("Verdana", Font.BOLD, 23));
		labelTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		labelTitulo.setBounds(170, 34, 359, 83);
		add(labelTitulo);
		
		JLabel labelOpcion = new JLabel("LISTA ARCHIVOS");
		labelOpcion.setFont(new Font("Verdana", Font.BOLD, 17));
		labelOpcion.setHorizontalAlignment(SwingConstants.CENTER);
		labelOpcion.setBounds(40, 112, 202, 29);
		add(labelOpcion);
		
	
		
		File carpeta = new File(escritorio);
		File[] lista = carpeta.listFiles();
		String files;
		String archivo = null;
		
		for (int i=0; i<lista.length; i++) {
			if (lista[i].isFile()) {
				files = lista[i].getName();
				if (files.endsWith(".txt")) {
					archivo = files;
					listaArchivos.add(files);
				}
					
			}
		}
		
		DefaultMutableTreeNode abuelo = new DefaultMutableTreeNode(fw.getHomeDirectory());
		DefaultTreeModel modelo = new DefaultTreeModel(abuelo);
		DefaultMutableTreeNode padre = null;
		for (int i=0; i<listaArchivos.size(); i++)
			padre = new DefaultMutableTreeNode(listaArchivos.get(i));
		modelo.insertNodeInto(padre, abuelo, 0);
		tree = new JTree(modelo);
		tree.setShowsRootHandles(true);
			
		DefaultTreeCellRenderer render= (DefaultTreeCellRenderer)tree.getCellRenderer();
		// render.setLeafIcon(new ImageIcon("./Images/icon.pgn"));
		// render.setOpenIcon(new ImageIcon("./Images/icon.pgn"));
		//render.setClosedIcon(new ImageIcon("./Images/icon.pgn"));
		tree.setBounds(89, 190, 215, 135);	
		add(tree);
		
		
		comboArchivos = new JComboBox();
		comboArchivos.setBounds(410, 187, 119, 22);
		for (int i=0;i<listaArchivos.size(); i++)
			comboArchivos.addItem(listaArchivos.get(i));
		
		add(comboArchivos);
		
		list = new JList();
		DefaultListModel elementos = new DefaultListModel();
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list.setBounds(436, 343, 107, 120);
		for (int i=0; i<listaArchivos.size(); i++)
			elementos.addElement(listaArchivos.get(i));
		list.setModel(elementos);
		add(list);
		
		btnEnviar = new JButton("ENVIAR");
		btnEnviar.setBounds(127, 427, 89, 23);
		add(btnEnviar);
		
		
		

		
	}
	
	
	
	public void listarArchivos() {
		if (comboArchivos == null) {
			JOptionPane.showMessageDialog(null, "No existen archivos txt en el escritorio", "Error", 0, null);
			System.exit(1);
		}
	}
}
