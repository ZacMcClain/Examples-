import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;


public class PreferencePanel extends JPanel {
	private DisplayPanel dp;
	private JRadioButton smokeButton, noSmokeButton;
	public PreferencePanel(DisplayPanel dp)
	{
		this.dp = dp;
		// Create the buttons
		smokeButton = new JRadioButton("Smokes");
		noSmokeButton = new JRadioButton("No smoke");
		// Set no smoke as the default
		noSmokeButton.setSelected(true);
		// Add the buttons to the panel
		add(smokeButton);
		add(noSmokeButton);
		RadioListener listener = new RadioListener();
		smokeButton.addActionListener(listener);
		noSmokeButton.addActionListener(listener);
		ButtonGroup group = new ButtonGroup();
		group.add(smokeButton);
		group.add(noSmokeButton);
		setBorder(new TitledBorder (new EtchedBorder(), "Preferences"));
		setLayout(new GridLayout(2, 1));
	}
	
	private class RadioListener implements ActionListener {
		public void actionPerformed(ActionEvent e)
		{
			if (smokeButton.isSelected())
				dp.setSmoker("smoking");
			else 
				dp.setSmoker("no smoking");
		}
	}

}

