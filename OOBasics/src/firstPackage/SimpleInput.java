package firstPackage;
import java.util.Scanner;


public class SimpleInput {
	private String name;
	private int age, score;
	
	public void fillFields() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter your name: ");
		name = scan.nextLine(); // spaces
		System.out.print("Enter your age: ");
		age = scan.nextInt();
		System.out.print("Enter your test score: ");
		String scoreStr = scan.next();
		try {
			score = Integer.parseInt(scoreStr);
		} catch (NumberFormatException e)
		{
			System.out.println("That is not a number!");
		}
	}

	@Override
	public String toString() {
		return "SimpleInput [name=" + name + ", age=" + age + ", score="
				+ score + "]";
	}

	public static void main(String[] args) {
		SimpleInput si = new SimpleInput();
		si.fillFields();
		System.out.println(si);
		

	}

}
