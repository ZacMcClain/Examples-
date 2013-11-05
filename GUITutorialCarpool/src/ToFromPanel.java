import java.awt.GridLayout;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;


public class ToFromPanel extends JPanel {
	private JComboBox<String> toCity, fromCity;
	public ToFromPanel()
	{
		toCity = createCityCombo();
		fromCity = createCityCombo(); 
		JLabel fromLabel = new JLabel("From");
		JLabel toLabel = new JLabel("To");
		setLayout(new GridLayout(0, 2));
		add(fromLabel);
		add(toLabel);
		add(fromCity);
		add(toCity); 
		setBorder(new TitledBorder (new EtchedBorder(), "Location"));
	}
	
	private JComboBox<String> createCityCombo()
	{
		JComboBox<String> combo = new JComboBox<String>();
		combo.addItem("Golden");
		combo.addItem("Boulder");
		combo.addItem("Denver");
		return combo;
	}
}
