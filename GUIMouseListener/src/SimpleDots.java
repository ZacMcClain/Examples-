import javax.swing.JFrame;


public class SimpleDots {
	public static void main (String[] args)
	{
		JFrame frame = new JFrame ("Dots");
		frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

		frame.getContentPane().add (new DotsPanel());
		frame.setSize(200, 200);
		frame.setVisible(true);
	}


}
