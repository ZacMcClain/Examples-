import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JPanel;


public class DotsPanel extends JPanel {
	private ArrayList<Point> points;
	public final int WIDTH = 10;
	public final int HEIGHT = 10;
	public DotsPanel() {
		points = new ArrayList<Point>();
		setBackground (Color.black); // BACKGROUND COLOR
		addMouseListener(new DotsListener()); // ADD LISTENER TO PANEL
	}
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.cyan);
		// draws every point
		for (Point p : points) {
			g.fillOval(p.x, p.y, WIDTH, HEIGHT);
		}
	}
	private class DotsListener implements MouseListener {
		public void mousePressed (MouseEvent event) {
			// update the list of points
			points.add(event.getPoint());  
			repaint(); // MUST CALL REPAINT
		}

		//  Empty definitions for unused event methods.
		public void mouseClicked (MouseEvent event) {}
		public void mouseReleased (MouseEvent event) {}
		public void mouseEntered (MouseEvent event) {}
		public void mouseExited (MouseEvent event) {}
	}
}