/*
 * Demonstrates 
 * - using static methods
 */
public class UseConversions {

	public static void main(String[] args) {
		double feet = 1;
		double meters = Conversions.convertFtToMeters(feet);
		System.out.println("Fact: " + feet + " feet is " + meters + " meters ");
		feet = 4;
		meters = Conversions.convertFtToMeters(feet);
		System.out.println("Fact: " + feet + " feet is " + meters + " meters ");
	}

}
