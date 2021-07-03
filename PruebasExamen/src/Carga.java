import javax.swing.JPanel;
import javax.swing.JProgressBar;
import java.awt.Color;

public class Carga extends JPanel{
	
	private JProgressBar progressBar;
	public Carga() {
		
		setBounds(100, 100, 450, 300);
		setLayout(null);
		
		progressBar = new JProgressBar();
		progressBar.setForeground(Color.DARK_GRAY);
		progressBar.setStringPainted(true);
		progressBar.setBounds(10, 143, 412, 14);
		add(progressBar);
	}
	
	
	public JProgressBar GetBarra() {
		return progressBar;
	}
}
