import java.awt.Button;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class SimpleForm extends JPanel {
	
	private JLabel nameLabel;
	private JLabel workLabel;
	private JTextField nameField;
	private JTextField workField;
	private JButton submitBtn;
	
	public SimpleForm() {
		Dimension dm = getPreferredSize();
		dm.width = 250;
		setPreferredSize(dm);
		
		nameLabel = new JLabel("Name : ");
		workLabel = new JLabel("Occupation : ");
		nameField = new JTextField(10);
		workField = new JTextField(10);
		
		submitBtn = new JButton("Submit");
		
		Border innerBorder = BorderFactory.createTitledBorder("Add something");
		Border outerBorder = BorderFactory.createEmptyBorder(5,5,5,5);
		setBorder(BorderFactory.createCompoundBorder(innerBorder,outerBorder));
	
	setLayout(new GridBagLayout());
	
	GridBagConstraints gc = new GridBagConstraints();
	
	
	/////First row /////

	gc.weightx = 1;
	gc.weighty = 0.1;
	
	gc.gridx = 0;
	gc.gridy = 0;
	
	gc.fill = GridBagConstraints.NONE;
	gc.anchor = GridBagConstraints.LINE_END;
	add(nameLabel,gc);
	
	gc.gridx = 1;
	gc.gridy = 0;
	gc.anchor = GridBagConstraints.LINE_START;
	add(nameField,gc);
	
	/////second row /////

	gc.weightx = 1;
	gc.weighty = 0.1;
	
	gc.gridy = 1;
	gc.gridx = 0;
	gc.anchor = GridBagConstraints.LINE_END;
	add(workLabel, gc);
	
	gc.gridy = 1;
	gc.gridx = 1;
	gc.anchor = GridBagConstraints.LINE_START;
	add(workField,gc);
	
	/////third row /////

	gc.weightx = 1;
	gc.weighty = 1;
	gc.gridy = 2;
	gc.gridx = 1;
	gc.anchor = GridBagConstraints.FIRST_LINE_START;
	add(submitBtn,gc);
	
	}

}
