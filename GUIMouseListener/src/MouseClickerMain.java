import javax.swing.JFrame;


public class MouseClickerMain {
	public static void main(String[] args) {
	    // Notice we create a JFrame
	    JFrame frame = new JFrame("Mouse Click Example");
	    MouseClickerPanel panel = new MouseClickerPanel(5);
	    // Add the panel to the JFrame
	    frame.setContentPane(panel);
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    // Pack will determine size based on components
	    frame.pack();
	    frame.setVisible(true);      
	}

}
