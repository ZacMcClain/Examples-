import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MyDialog extends JDialog {
	private JTextField name;
	private JPasswordField password;
	public MyDialog()
	{
		setTitle("Login Dialog");
		setSize(300, 200);
		setLayout(new GridLayout(3, 2));
		JLabel nameLabel = new JLabel("Name");
		name = new JTextField(20);
		JLabel pwdLabel = new JLabel("Password");
		password = new JPasswordField();
		add(nameLabel);
		add(name);
		add(pwdLabel);
		add(password);
		
		// ADD A BUTTON, NOTE IT JUST HIDES THE DIALOG 
		JButton button = new JButton("OK");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				setVisible(false);
			}
		});
		add(button);
		
	}
	
	// MUST HAVE A METHOD TO ACCESS DATA COLLECTED BY DIALOG
	public String getName()
	{
		return name.getText();
	}

} 
