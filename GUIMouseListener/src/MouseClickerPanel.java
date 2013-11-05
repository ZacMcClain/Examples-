import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JPanel;


public class MouseClickerPanel extends JPanel implements MouseListener {
	// constants to control drawing
	public final int BOXES_PER_ROW = 3; 
	public final int MARGIN = 10;
	
	private ArrayList<ABox> boxes; // boxes to draw
	
	public MouseClickerPanel(int numBoxes) {
		createBoxes(numBoxes);
		// Determine panel size based on box and margin values
		int width = BOXES_PER_ROW*ABox.BOX_WIDTH + (MARGIN*2);
		int numRows = numBoxes / BOXES_PER_ROW + 1;
		int height = numRows * ABox.BOX_HEIGHT;
		setPreferredSize(new Dimension(width, height));
		// Set up this panel (i.e., myself) to listen for mouse clicks
		addMouseListener(this);
	}
	
	private void createBoxes(int numBoxes) {
		boxes = new ArrayList<ABox>();
		for (int i=0; i<numBoxes; i++) {
			int x = (MARGIN + ABox.BOX_WIDTH) * (i%BOXES_PER_ROW);
			int row = i/BOXES_PER_ROW;
			int y = row * (MARGIN + ABox.BOX_HEIGHT);
			boxes.add(new ABox(x, y));
		}
	}
	
	public void paintComponent(Graphics g)
	{
		// Always remember to call super.paintComponent
		super.paintComponent(g);
		for (int i=0; i<boxes.size(); ++i) {
			// We send the Graphics object for the panel into the draw function
			boxes.get(i).draw(g);
		}
	}
	
	// Must implement all mouse listener events with at least an empty method
	public void mouseClicked(MouseEvent e) {}
	public void mouseEntered(MouseEvent e) {}
	public void mouseExited(MouseEvent e) {}
	public void mouseReleased(MouseEvent e) {}
	public void mousePressed(MouseEvent e)  {
		ABox whichBox = null;
		for (int i=0; i<boxes.size(); i++) {
			if (boxes.get(i).containsClick(e.getX(), e.getY())) {
				whichBox = boxes.get(i);
				break;
			}
		}
		// display some information just to show whether a box was clicked
		if (whichBox != null) 
			System.out.println(whichBox.getColor());
		else
			System.out.println("Not a box!");
	}   
}
