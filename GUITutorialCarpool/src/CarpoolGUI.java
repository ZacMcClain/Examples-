import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;


public class CarpoolGUI extends JFrame {
	public CarpoolGUI() {
		setSize(new Dimension(400, 250));
		setTitle("Let's carpool");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ToFromPanel tfPanel = new ToFromPanel();
		add(tfPanel, BorderLayout.CENTER);
		PreferencePanel pPanel = new PreferencePanel();
		add(pPanel, BorderLayout.EAST);
		WillDrivePanel wdPanel = new WillDrivePanel();
		add(wdPanel, BorderLayout.NORTH);


	}
	public static void main(String[] args) {
		CarpoolGUI gui = new CarpoolGUI();
		gui.setVisible(true);
	}
}

