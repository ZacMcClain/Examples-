import java.awt.GridLayout ;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;


public class ToFromPanel extends JPanel {
	private JComboBox<String> toCity, fromCity;
	private DisplayPanel dp;

	public ToFromPanel(DisplayPanel dp)
	{
	  this.dp = dp;
		toCity = createCityCombo();
		fromCity = createCityCombo(); 
		ComboListener listener = new ComboListener();
		fromCity.addActionListener(listener);
		toCity.addActionListener(listener);
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
	
	private class ComboListener implements ActionListener {
		  public void actionPerformed(ActionEvent e)
		  {
		    if (e.getSource() == toCity)
		      dp.setToCity(toCity.getSelectedItem().toString());
		    else
		      dp.setFromCity(fromCity.getSelectedItem().toString());
		  }
		}

}
