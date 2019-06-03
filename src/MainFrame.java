import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class MainFrame extends JFrame {
	private JTextArea textarea;
	private JButton btn;
	public MainFrame() {
		super("test app");

		setLayout(new BorderLayout());
		textarea = new JTextArea();
		btn = new JButton("click here");
		
		add(textarea, BorderLayout.CENTER);
		add(btn,BorderLayout.SOUTH);


		setSize(600,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}
