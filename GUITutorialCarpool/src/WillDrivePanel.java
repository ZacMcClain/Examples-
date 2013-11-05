import java.awt.Font;

import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;



public class WillDrivePanel extends JPanel {
	private JTextField name;
	private JCheckBox  willDriveCB;

	public WillDrivePanel()
	{
		JLabel label = new JLabel("Name");
		name = new JTextField(20);
		name.setFont(new Font("SansSerif", Font.BOLD, 12));
		add(label);
		add(name);
		willDriveCB = new JCheckBox("Will drive");
		add(willDriveCB);

	}

}

