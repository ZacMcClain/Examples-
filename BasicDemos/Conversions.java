/*
 * Demonstrates:
 * - static methods
 */
public class Conversions {
	public static double FEET_TO_METERS = 0.3048;
	
	public static double convertFtToMeters(double feet) {
		return feet * FEET_TO_METERS;
	}

	public static void main(String[] args) {
		double feet = 1;
		double meters = Conversions.convertFtToMeters(feet);
		System.out.println("Fact: " + feet + " feet is " + meters + " meters ");
		feet = 4;
		meters = convertFtToMeters(feet);
		System.out.println("Fact: " + feet + " feet is " + meters + " meters ");

	}

}
