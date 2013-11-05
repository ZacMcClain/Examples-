import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.Timer;


public class DrawFrame extends JFrame {
	private DrawPanel drawPanel;
	private int dx, dy;

	public DrawFrame()
	{
		drawPanel = new DrawPanel();
		// paintComponent will automatically be 
		// called 1 time
		add(drawPanel, BorderLayout.CENTER);
		setSize(300, 300);
	}
	public void updateDrawing(int dx, int dy)
	{
		  this.dx = dx;
		  this.dy = dy;

		// 1000 millisecond delay
		  Timer t = new Timer(1000, new TimerListener());
		  t.start();
	}
	
	private class TimerListener implements ActionListener {
		  public void actionPerformed(ActionEvent e) {
		    drawPanel.translate(dx, dy);
		  }
		}

	public static void main(String[] args) {
		DrawFrame frame = new DrawFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		// This will cause rectangle to display in new location
		frame.updateDrawing(100, 100);

	}
}

