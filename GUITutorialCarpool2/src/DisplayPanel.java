import javax.swing.JPanel;
import javax.swing.JTextArea;


public class DisplayPanel extends JPanel {
	// Variables for message
	private String name, fromCity,toCity, willDrive, smoker;
	// display – multiple lines allowed in JTextArea
	private JTextArea display;
	public DisplayPanel()
	{ // set some default values
		name = "Someone";
		fromCity = "Somewhere";
		toCity = "Somewhere";
		willDrive = "needs a ride";
		smoker = "no smoking";

		display = new JTextArea(2, 20);
		display.setLineWrap(true); // uses multiple lines
		display.setWrapStyleWord(true); // breaks on word boundaries
		updateDisplay();
		add(display);
	}

	private void updateDisplay()
	{
		display.setText(name + " " + willDrive + " from " + fromCity
				+ " to " + toCity + " and prefers " + smoker);
	}

	public void setName(String name) {
		this.name = name;
		updateDisplay();
	}

	public void setFromCity(String fromCity) {
		this.fromCity = fromCity;
		updateDisplay();
	}

	public void setToCity(String toCity) {
		this.toCity = toCity;
		updateDisplay();
	}

	public void setWillDrive(String willDrive) {
		this.willDrive = willDrive;
		updateDisplay();
	}

	public void setSmoker(String smoker) {
		this.smoker = smoker;
		updateDisplay();
	}

}