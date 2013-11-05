package utilities;

import java.util.Scanner;

public class MyConverter {
	public static int FEET_PER_YARD = 3;
	public static double INCHES_TO_METERS = 0.0254;

	public static double englishToMeters(int feet, int inches)
	{
		return 0;
		//int totalInches = feet * 12 + inches;
		//return totalInches * INCHES_TO_METERS;
	}
	
	public static int yardsToFeet(int yards)
	{
		// start with a failing case
		return 0;
		//return yards * FEET_PER_YARD;
	}
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter feet: ");
		int feet = scan.nextInt();
		System.out.print("Enter inches: ");
		int inches = scan.nextInt();
		System.out.println(englishToMeters(feet, inches));
	}

}
