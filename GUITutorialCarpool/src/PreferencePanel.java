import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;


public class PreferencePanel extends JPanel {
	private JRadioButton smokeButton, noSmokeButton;
	public PreferencePanel()
	{
		// Create the buttons
	  smokeButton = new JRadioButton("Smokes");
	  noSmokeButton = new JRadioButton("No smoke");
	  // Set no smoke as the default
	  noSmokeButton.setSelected(true);
	  // Add the buttons to the panel
	  add(smokeButton);
	  add(noSmokeButton);
	  ButtonGroup group = new ButtonGroup();
	  group.add(smokeButton);
	  group.add(noSmokeButton);
	  setBorder(new TitledBorder (new EtchedBorder(), "Preferences"));
	  setLayout(new GridLayout(2, 1));

	 }
	}

