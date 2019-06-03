import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Toolbar extends JPanel implements ActionListener {
	private JButton helloBtn;
	private JButton byeBtn;
	private TextPanel textPanel;
	public Toolbar() {
		
		helloBtn = new JButton("hello");
		byeBtn = new JButton("bye!!");
		
		helloBtn.addActionListener(this);
		byeBtn.addActionListener(this);
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		add(helloBtn);
		add(byeBtn);
	}
	public void setTextPanel(TextPanel textPanel) {
		this.textPanel = textPanel;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton btn = (JButton) e.getSource();
		if(btn == helloBtn) {
			textPanel.appendText("hello\n");
		}else if (btn == byeBtn){
			textPanel.appendText("bye\n");
		}
		
	}
}
