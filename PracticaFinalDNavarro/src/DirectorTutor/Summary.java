package DirectorTutor;

import java.awt.CardLayout; 

import javax.swing.JPanel;


public class Summary extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	SummaryTuto resumenTuto = new SummaryTuto();
	SummaryClean resumenLimpia = new SummaryClean();
	
	public Summary() {
		
		setLayout(new CardLayout(0, 0));
		setVisible(false);
		
		add(resumenTuto);
		add(resumenLimpia);
		
		resumenTuto.setVisible(false);
		resumenLimpia.setVisible(false);
	}
}
