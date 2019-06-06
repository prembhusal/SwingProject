import java.awt.Dimension;

import javax.swing.JPanel;

public class SimpleForm extends JPanel {
	public SimpleForm() {
		Dimension dm = getPreferredSize();
		dm.width = 250;
		setPreferredSize(dm);
	}

}
