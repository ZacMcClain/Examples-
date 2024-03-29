import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class WillDrivePanel extends JPanel {
	private JTextField name;
	private JCheckBox willDriveCB;
	private DisplayPanel dp;

	public WillDrivePanel(DisplayPanel dp)
	{
		this.dp = dp;
		JLabel label = new JLabel("Name");
		name = new JTextField(20);
		name.setFont(new Font("SansSerif", Font.BOLD, 12));
		name.addFocusListener(new NameListener());
		add(label);
		add(name);
		willDriveCB = new JCheckBox("Will drive");
		willDriveCB.addActionListener(new CheckboxListener());
		add(willDriveCB);
	}
	
	private class CheckboxListener implements ActionListener
	{
	  public void actionPerformed(ActionEvent e)
	  {
	    if (willDriveCB.isSelected())
	      dp.setWillDrive("will drive");
	    else
	      dp.setWillDrive("needs a ride");
	  }
	}
	
	private class NameListener implements FocusListener
	{
	  // We don�t care when we get focus
	  public void focusGained(FocusEvent e) {}
	  // When we lose focus, need to update the display
	  public void focusLost(FocusEvent e) 
	  {
	    dp.setName(name.getText());
	  }
	}


}

