import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
	private Set<String> animals;
	
	public SetDemo()
	{
		animals = new TreeSet<String>();
	}
	
	public void getAnimals() {
		Scanner in = new Scanner(System.in);
		String animal = "";
		do 
		{
			System.out.print("Enter an animal or Q to quit: ");
			animal = in.next();
			if (!(animal.equalsIgnoreCase("Q")))
				animals.add(animal);							
		} while (!(animal.equalsIgnoreCase("Q")));
	}
	
	public void printAnimals()
	{
		for (String animal : animals)
			System.out.println(animal);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SetDemo sd = new SetDemo();
		sd.getAnimals();
		sd.printAnimals();

	}

}
