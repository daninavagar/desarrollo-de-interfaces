package Prueba;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.CardLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Component;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import java.awt.Toolkit;
import javax.swing.JProgressBar;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JScrollPane;
import java.awt.FlowLayout;
import javax.swing.JTextArea;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.ListSelectionModel;
import javax.swing.JFileChooser;

public class FrameConPaneles {

	private JFrame frame;
	JPanel panel = new JPanel();
	JPanel panel_1 = new JPanel();
	JPanel panel_2 = new JPanel();
	JPanel panel_3 = new JPanel();
	JTextArea textArea = new JTextArea();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameConPaneles window = new FrameConPaneles();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public FrameConPaneles() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		
		frame.setResizable(false);
		frame.setBounds(100, 100, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Aplicaci�n de Ejemplo");
		frame.setLocationRelativeTo(null);
		frame.setUndecorated(true);//Para quitar el marco
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu unMenu = new JMenu("Help");
		menuBar.add(unMenu);
		
		JMenuItem infoMenu = new JMenuItem("Ayuda");
		infoMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "�DAM 20_21!", "Informaci�n", 1);
			}
		});
		unMenu.add(infoMenu);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		
		panel.setBackground(Color.CYAN);
		frame.getContentPane().add(panel, BorderLayout.NORTH);
		panel.setLayout(new BorderLayout(10, 10));
		
		JLabel lbl0 = new JLabel("Panel 0");
		lbl0.setOpaque(true);
		lbl0.setVerticalTextPosition(SwingConstants.BOTTOM);
		lbl0.setVerticalAlignment(SwingConstants.BOTTOM);
		lbl0.setBackground(new Color(173, 255, 47));
		lbl0.setAlignmentX(Component.CENTER_ALIGNMENT);
		lbl0.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lbl0, BorderLayout.NORTH);
		
		JButton btn1 = new JButton("Al panel 1");
		btn1.setAlignmentX(Component.CENTER_ALIGNMENT);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				frame.setUndecorated(false);
				frame.setVisible(true);
				panel.setVisible(false);
				panel_1.setVisible(true);
			}
		});
		btn1.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		btn1.setBackground(Color.WHITE);
		panel.add(btn1, BorderLayout.SOUTH);
		FlowLayout flowLayout = (FlowLayout) panel_1.getLayout();
		flowLayout.setVgap(50);
		
		
		panel_1.setBackground(Color.YELLOW);
		frame.getContentPane().add(panel_1, BorderLayout.SOUTH);
		
		JButton btn11 = new JButton("Al panel 0");
		btn11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();//Para volver a mostar el marco hay que liberar los recursos y volver a generar el frame
				frame.setUndecorated(false);
				frame.setVisible(true);
				
				panel_1.setVisible(false);
				panel.setVisible(true);
				
			}
		});
		panel_1.add(btn11);
		
		JLabel lbl1 = new JLabel("Panel 1");
		lbl1.setFont(new Font("SansSerif", Font.PLAIN, 20));
		panel_1.add(lbl1);
		
		JButton btn12 = new JButton("Al panel 2");
		btn12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				panel_1.setVisible(false);
				panel_2.setVisible(true);	
			}
		});
		panel_1.add(btn12);
		
		
		panel_2.setFont(new Font("SansSerif", Font.PLAIN, 25));
		panel_2.setBackground(Color.MAGENTA);
		frame.getContentPane().add(panel_2, BorderLayout.WEST);
		panel_2.setLayout(new GridLayout(3, 2, 0, 0));
		
		JButton btn21 = new JButton("Al panel 1");
		btn21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				panel_2.setVisible(false);
				panel_1.setVisible(true);
			
				
			}
		});
		panel_2.add(btn21);
		
		JLabel lbl2 = new JLabel("Panel 2");
		lbl2.setFont(new Font("SansSerif", Font.PLAIN, 20));
		lbl2.setHorizontalTextPosition(SwingConstants.CENTER);
		lbl2.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lbl2);
		
		JButton btn22 = new JButton("Al panel 3");
		btn22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				panel_2.setVisible(false);
				panel_3.setVisible(true);
				frame.pack();
				frame.setLocationRelativeTo(null);
				
			}
		});
		panel_2.add(btn22);
		
		
		//panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 10));				
		panel_3.setBackground(Color.ORANGE);
		frame.getContentPane().add(panel_3);//, BorderLayout.EAST);
		GridBagLayout gbl_panel_3 = new GridBagLayout();
		gbl_panel_3.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
		gbl_panel_3.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, 1.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
		gbl_panel_3.columnWidths = new int[] {40, 40, 40, 67, 40, 40, 68, 40, 40, 40, 40, 40, 82, 71, 40, 40, 40, 40, 40, 40};
		gbl_panel_3.rowHeights = new int[] {30, 30, 30, 30, 30, 30, 30, 0, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30};
		panel_3.setLayout(gbl_panel_3);
		JLabel lbl_3 = new JLabel("Panel 3");
		lbl_3.setFont(new Font("SansSerif", Font.PLAIN, 27));
		GridBagConstraints gbc_lbl_3 = new GridBagConstraints();
		gbc_lbl_3.gridheight = 2;
		gbc_lbl_3.gridwidth = 3;
		gbc_lbl_3.insets = new Insets(0, 0, 5, 5);
		gbc_lbl_3.gridx = 8;
		gbc_lbl_3.gridy = 2;
		panel_3.add(lbl_3, gbc_lbl_3);
		
		JLabel lblList = new JLabel("Lista de Opciones");
		GridBagConstraints gbc_lblList = new GridBagConstraints();
		gbc_lblList.gridwidth = 2;
		gbc_lblList.insets = new Insets(0, 0, 5, 5);
		gbc_lblList.gridx = 11;
		gbc_lblList.gridy = 5;
		panel_3.add(lblList, gbc_lblList);
		
		JLabel lblOpcionesEl = new JLabel("Opciones Elegidas");
		GridBagConstraints gbc_lblOpcionesEl = new GridBagConstraints();
		gbc_lblOpcionesEl.gridwidth = 2;
		gbc_lblOpcionesEl.insets = new Insets(0, 0, 5, 5);
		gbc_lblOpcionesEl.gridx = 13;
		gbc_lblOpcionesEl.gridy = 5;
		panel_3.add(lblOpcionesEl, gbc_lblOpcionesEl);
		
		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.gridwidth = 2;
		gbc_scrollPane.fill = GridBagConstraints.HORIZONTAL;
		gbc_scrollPane.gridheight = 2;
		gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane.gridx = 11;
		gbc_scrollPane.gridy = 6;
		panel_3.add(scrollPane, gbc_scrollPane);
		
		JList<String> list = new JList<String>();
		list.setValueIsAdjusting(true);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {				
				if(list.getValueIsAdjusting()) {
					textArea.append(list.getSelectedValue()+"\n");	
				}			
			}
		});
		scrollPane.setViewportView(list);
		list.setVisibleRowCount(4);
		list.setLayoutOrientation(JList.VERTICAL);
		list.setModel(new AbstractListModel<String>() {
			String[] values = new String[] {"Opci\u00F3n 1", "Opci\u00F3n 2", "Opci\u00F3n 3", "Opci\u00F3n 4", "Opci\u00F3n 5", "Opci\u00F3n 6", "Opci\u00F3n 7", "Opci\u00F3n 8"};
			public int getSize() {
				return values.length;
			}
			public String getElementAt(int index) {
				return values[index];
			}
		});
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				
				if (progressBar.getValue()==100) {
				
					JOptionPane.showMessageDialog(null, "�El proceso se ha completado!", "Enhorabuena", 1);
				}
			}
		});
		
		
		GridBagConstraints gbc_textArea = new GridBagConstraints();
		gbc_textArea.gridwidth = 2;
		gbc_textArea.fill = GridBagConstraints.BOTH;
		gbc_textArea.gridheight = 3;
		gbc_textArea.insets = new Insets(0, 0, 5, 5);
		gbc_textArea.gridx = 13;
		gbc_textArea.gridy = 6;
		textArea.setLineWrap(true);
		textArea.setRows(10);
		textArea.setWrapStyleWord(true);
		panel_3.add(textArea, gbc_textArea);
		
		JLabel lblBarra = new JLabel("Barra de Progreso");
		GridBagConstraints gbc_lblBarra = new GridBagConstraints();
		gbc_lblBarra.anchor = GridBagConstraints.WEST;
		gbc_lblBarra.gridwidth = 3;
		gbc_lblBarra.insets = new Insets(0, 0, 5, 5);
		gbc_lblBarra.gridx = 4;
		gbc_lblBarra.gridy = 14;
		panel_3.add(lblBarra, gbc_lblBarra);
		progressBar.setStringPainted(true);
		GridBagConstraints gbc_progressBar = new GridBagConstraints();
		gbc_progressBar.fill = GridBagConstraints.HORIZONTAL;
		gbc_progressBar.gridwidth = 4;
		gbc_progressBar.insets = new Insets(0, 0, 5, 5);
		gbc_progressBar.gridx = 4;
		gbc_progressBar.gridy = 15;
		panel_3.add(progressBar, gbc_progressBar);
		
		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(0, 0, 100, 1));
		spinner.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				progressBar.setValue((int) spinner.getValue());
			}
		});
		
		JLabel lblSpinner = new JLabel("Spinner para incrementar la barra");
		GridBagConstraints gbc_lblSpinner = new GridBagConstraints();
		gbc_lblSpinner.anchor = GridBagConstraints.WEST;
		gbc_lblSpinner.gridwidth = 3;
		gbc_lblSpinner.insets = new Insets(0, 0, 5, 5);
		gbc_lblSpinner.gridx = 4;
		gbc_lblSpinner.gridy = 16;
		panel_3.add(lblSpinner, gbc_lblSpinner);
		GridBagConstraints gbc_spinner = new GridBagConstraints();
		gbc_spinner.fill = GridBagConstraints.HORIZONTAL;
		gbc_spinner.insets = new Insets(0, 0, 5, 5);
		gbc_spinner.gridx = 7;
		gbc_spinner.gridy = 16;
		panel_3.add(spinner, gbc_spinner);
		
		JButton btn31 = new JButton("Al panel 2");
		btn31.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
				panel_3.setVisible(false);
				panel_2.setVisible(true);				
			}
		});
		
		
		GridBagConstraints gbc_btn31 = new GridBagConstraints();
		gbc_btn31.gridwidth = 3;
		gbc_btn31.insets = new Insets(0, 0, 5, 5);
		gbc_btn31.gridx = 2;
		gbc_btn31.gridy = 18;
		panel_3.add(btn31, gbc_btn31);
		
		JButton btnExit = new JButton("SALIR");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				System.exit(0);
			}
		});
		GridBagConstraints gbc_btnExit = new GridBagConstraints();
		gbc_btnExit.gridwidth = 2;
		gbc_btnExit.anchor = GridBagConstraints.NORTH;
		gbc_btnExit.insets = new Insets(0, 0, 5, 5);
		gbc_btnExit.gridx = 16;
		gbc_btnExit.gridy = 18;
		panel_3.add(btnExit, gbc_btnExit);
	}
}