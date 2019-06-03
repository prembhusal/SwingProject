import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
		
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textarea.append("first program\n");
			}
			
		});
		

		add(textarea, BorderLayout.CENTER);
		add(btn,BorderLayout.SOUTH);
		setSize(600,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}
