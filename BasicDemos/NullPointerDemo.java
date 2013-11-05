/*
 * Demonstrates
 * - null pointer exception
 */

import java.awt.Point;

public class NullPointerDemo {
	private Point aPoint;
	
	public NullPointerDemo() {
		Point aPoint = new Point(5,6);
	}
	
	public void showMyPoint() {
		System.out.println(aPoint.x);	
	}

	public static void main(String[] args) {
		NullPointerDemo npd = new NullPointerDemo();
		npd.showMyPoint();

	}

}
