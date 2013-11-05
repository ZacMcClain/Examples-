/*
 * Simple program just to see how to throw an exception
 */
import java.util.Scanner;


public class ThrowException {
	
	public void getInput() throws Exception {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number from 1 - 100: ");
		int num = scan.nextInt();
		if (num < 1 || num > 100)
			throw new Exception("The value " + num + " is not between 1 and 100!");
	}

	public static void main(String[] args) throws Exception {
		ThrowException demo = new ThrowException();
		try {
		    demo.getInput();
		} catch (Exception e) {
			System.out.println(e);
			System.out.println(e.getMessage());
		}
	}

}
