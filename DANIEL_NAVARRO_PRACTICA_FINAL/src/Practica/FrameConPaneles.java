package Practica;
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
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

public class FrameConPaneles {

	private JFrame frame;
	JPanel panel = new JPanel();
	JPanel panel_1 = new JPanel();
	JPanel panel_2 = new JPanel();
	JPanel panel_3 = new JPanel();

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
		frame.setBounds(100, 100, 788, 539);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu unMenu = new JMenu("Help");
		menuBar.add(unMenu);
		
		JMenuItem infoMenu = new JMenuItem("Ayuda");
		unMenu.add(infoMenu);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		
		panel.setBackground(Color.CYAN);
		frame.getContentPane().add(panel, BorderLayout.NORTH);
		panel.setLayout(new BorderLayout(0, 0));
		
		JLabel lbl0 = new JLabel("Panel 0");
		lbl0.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lbl0, BorderLayout.NORTH);
		
		JButton btn1 = new JButton("Hacia panel 1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.setVisible(false);
				panel_1.setVisible(true);
			}
		});
		btn1.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		btn1.setBackground(Color.WHITE);
		btn1.setAlignmentX(Component.CENTER_ALIGNMENT);
		panel.add(btn1, BorderLayout.SOUTH);
		
		
		panel_1.setBackground(Color.YELLOW);
		frame.getContentPane().add(panel_1, BorderLayout.SOUTH);
		
		JButton btn11 = new JButton("Vuelta al panel 0");
		btn11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.setVisible(true);
				panel_1.setVisible(false);
			}
		});
		panel_1.add(btn11);
		
		JLabel lbl1 = new JLabel(" Estas en el Panel 1");
		lbl1.setFont(new Font("SansSerif", Font.PLAIN, 20));
		panel_1.add(lbl1);
		
		JButton btn12 = new JButton("Al panel 2");
		btn12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_2.setVisible(true);
				panel_1.setVisible(false);
			}
		});
		panel_1.add(btn12);
		
		
		panel_2.setFont(new Font("SansSerif", Font.PLAIN, 25));
		panel_2.setBackground(Color.MAGENTA);
		frame.getContentPane().add(panel_2, BorderLayout.WEST);
		panel_2.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton btn21 = new JButton("Volver al panel 1");
		btn21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_1.setVisible(true);
				panel_2.setVisible(false);
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
				panel_3.setVisible(true);
				panel_2.setVisible(false);
			}
		});
		panel_2.add(btn22);
		
		
		panel_3.setBackground(Color.ORANGE);
		frame.getContentPane().add(panel_3, BorderLayout.EAST);
		GridBagLayout gbl_panel_3 = new GridBagLayout();
		gbl_panel_3.columnWidths = new int[] {70, 70, 0, 0, 70, 70};
		gbl_panel_3.rowHeights = new int[] {16, 0, 0, 16, 16, 16};
		gbl_panel_3.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_3.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_3.setLayout(gbl_panel_3);
		
		JLabel lbl_3 = new JLabel("Panel 3");
		lbl_3.setFont(new Font("SansSerif", Font.PLAIN, 20));
		GridBagConstraints gbc_lbl_3 = new GridBagConstraints();
		gbc_lbl_3.insets = new Insets(0, 0, 5, 5);
		gbc_lbl_3.anchor = GridBagConstraints.NORTH;
		gbc_lbl_3.gridx = 3;
		gbc_lbl_3.gridy = 2;
		panel_3.add(lbl_3, gbc_lbl_3);
		
		JButton btn31 = new JButton("Al panel 2");
		btn31.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_3.setVisible(false);
				panel_2.setVisible(true);
			}
		});
		panel_3.add(btn31);
		GridBagConstraints gbc_btn31 = new GridBagConstraints();
		gbc_btn31.insets = new Insets(0, 0, 0, 5);
		gbc_btn31.gridx = 1;
		gbc_btn31.gridy = 5;
		panel_3.add(btn31, gbc_btn31);
		
		JButton btnExit = new JButton("SALIR");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				System.exit(0);
			}
		});
		GridBagConstraints gbc_btnExit = new GridBagConstraints();
		gbc_btnExit.insets = new Insets(0, 0, 0, 5);
		gbc_btnExit.gridx = 4;
		gbc_btnExit.gridy = 5;
		panel_3.add(btnExit, gbc_btnExit);
	}
}