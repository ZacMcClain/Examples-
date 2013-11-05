import java.awt.BorderLayout; 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class FirstGUI extends JFrame{
	private JTextField name;

	public FirstGUI () {
		// EXIT_ON_CLOSE is static int, ends program when click x
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("My First GUI");
		setSize(250, 100);	
		createLayout();		
	}
	private void createLayout() {
		JLabel nameLabel = new JLabel("Name");
		name = new JTextField(20);
		add(nameLabel, BorderLayout.NORTH);
		add(name, BorderLayout.CENTER);
		JButton nameButton = new JButton("OK");
		add(nameButton, BorderLayout.SOUTH);
		nameButton.addActionListener(new ButtonListener());
	}
	private class ButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			System.out.println("Button pressed");
			String message = "Hello " + name.getText();
			JOptionPane.showMessageDialog(null, message);
			String numStr = JOptionPane.showInputDialog("Enter your age");
			int num = Integer.parseInt(numStr);
			int yearsLeft = 100 - num;
			JOptionPane.showMessageDialog(null, 
					"You have " + yearsLeft + " years left");
			int ready = JOptionPane.showConfirmDialog(null, 
					"Are you ready to continue?");
			if (ready == JOptionPane.YES_OPTION)
				JOptionPane.showMessageDialog(null, "Here we go!");
			else
				JOptionPane.showMessageDialog(null, "OK, we'll wait");

		}
	}
	public static void main(String[] args) {
		FirstGUI gui = new FirstGUI();
		gui.setVisible(true);
	}

}
