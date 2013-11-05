package firstPackage;

import java.awt.Point;
import java.util.ArrayList;

public class ArrayListPlay {
	public static void main(String[] args) {
		ArrayList things = new ArrayList();
		//things.add(new Point(4,7));
		things.add("Cyndi");
		things.add(new Point (3,4));
		for (Object o: things)
			System.out.println(o);
		String aString = (String) things.get(0);
		System.out.println(aString);
		ArrayList<Point> points;
		points = new ArrayList<Point>();
		//points.add("Cyndi");
		points.add(new Point(4,5));
		points.add(new Point(10, 20));
		for (Point p: points)
			System.out.println(p.toString());
		System.out.println("Number of points " + points.size());
		points.remove(0);
		System.out.println("Number of points " + points.size());
		//System.out.println(points.get(1));
		System.out.println(points.get(0));
		ArrayList<Integer> values = new ArrayList<Integer>();
		Integer wrappedInt = new Integer(5);
		System.out.println("Wrapped " + wrappedInt);
		values.add(wrappedInt);
		values.add(42);
		int[] bigData = new int[100000];
		
		
	}

}
