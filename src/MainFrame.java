import java.awt.BorderLayout;

import javax.swing.JFrame;

public class MainFrame extends JFrame {
	private TextPanel textPanel;
	private Toolbar toolbar;
	public MainFrame() {
		super("test app");

		setLayout(new BorderLayout());
		textPanel = new TextPanel();
		
		toolbar = new Toolbar();
		
		toolbar.setTextPanel(textPanel);
		
		
		add(toolbar, BorderLayout.NORTH);
		add(textPanel, BorderLayout.CENTER);
		setSize(600,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}
