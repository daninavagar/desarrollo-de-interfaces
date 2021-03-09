package Visual;

import javax.swing.JComboBox; 
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.*;
import java.util.ArrayList;



public class Window extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	Carga carga = new Carga();
	Seleccion seleccion = new Seleccion();
	Trabajo trabajo = new Trabajo();
	
	Timer tiempo;
	int cont;
	
	public Window() {
		
		setResizable(false);
		setLocationRelativeTo(null);
		setBounds(100, 100, 700, 600);
		getContentPane().setLayout(new CardLayout(0, 0));
		setVisible(true);
		setTitle("PRACTICA 1");
		
		getContentPane().add(carga);
		getContentPane().add(seleccion);
		
		tiempo = new Timer(5, (ActionListener) new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				cont++;
				carga.barraProgreso.setValue(cont);
				if (carga.barraProgreso.getValue() < 10)
					carga.barraProgreso.setValue(carga.barraProgreso.getValue() + 1);
				if (carga.barraProgreso.getValue() == 100) {
					carga.setVisible(false);
					seleccion.setVisible(true);
					seleccion.listarArchivos();
				} 
					
			}
			
		});
		tiempo.start();
		
		
		seleccion.comboArchivos.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				// JOptionPane.showMessageDialog(null, "Ítem seleccionado: "+ seleccion.comboArchivos.getSelectedItem());	
				String nombre = seleccion.comboArchivos.getSelectedItem().toString();
				// String escritorio = fw.getHomeDirectory().getAbsolutePath();
			/*
				File f = new File(nombre, seleccion.escritorio);
				
				if (!f.exists()) {
					JOptionPane.showMessageDialog(null, "Ese archivo no existe", "Error", 0, null);
				}*/
			 
			}
			
		});
		
		seleccion.btnEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// String escritorio = fw.getHomeDirectory().getAbsolutePath();
			
				String aux = seleccion.list.getSelectedValue().toString();
				
				File f = new File(aux, seleccion.escritorio);
				//if (aux.equals())
				if (!f.exists()) {
					JOptionPane.showMessageDialog(null, "Ese archivo no existe", "Error", 0, null);
				} else {
					JOptionPane.showMessageDialog(null, "Correcto", "Comprobacion", 0, null);
					seleccion.setVisible(false);
					trabajo.setVisible(true);
				}
			}
		});
		
		
		
	}
	
	
}
