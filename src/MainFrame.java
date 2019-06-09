import java.awt.BorderLayout;

import javax.swing.JFrame;

public class MainFrame extends JFrame {
	private TextPanel textPanel;
	private Toolbar toolbar;
	private SimpleForm form;
	public MainFrame() {
		super("test app");

		setLayout(new BorderLayout());
		textPanel = new TextPanel();
		form = new SimpleForm();
		toolbar = new Toolbar();
		
		toolbar.setStringListener(new StringListener() {

			@Override
			public void textEmmitted(String text) {
				textPanel.appendText(text);
			}
			
		});
		//add layouts
		add(form, BorderLayout.WEST);
		add(toolbar, BorderLayout.NORTH);
		add(textPanel, BorderLayout.CENTER);
		setSize(600,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}
