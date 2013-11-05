import java.awt.Rectangle;


public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello World"); // Prints "Hello World" to the screen
		System.out.println(3+5); // Prints 8 to the screen
		System.out.println("the total is " + (3 + 5)); // Prints "the total is 8" to the screen
		int tot = 5; // initializes 'tot' to the int 5
		System.out.println("tot " + tot); // prints "tot 5" to the screen
		String name = "cyndi"; // initializes 'name' to the String "cyndi" 
		String message = "Hello " + name; // initializes 'message' to the String "Hello cyndi"
		System.out.println(message); // prints 'message' ("Hello cyndi") to the screen
		message.replace("cyndi", "jane"); // this dose not set message to anything new it just dose the replace and then the new String just diapers
		System.out.println(message); // prints "Hello cyndi" to the screen for the second time
		message = message.replace("cyndi", "jane"); // assign the new String created by .replace to the variable 'message' 
		System.out.println(message); // prints out the new 'message' ("Hello jane")
		String input = "12"; // initializes the String named 'input' to "12"
		int howMany = Integer.parseInt(input) + 5; // initializes the int howMany and sets it to the converted value (converted using Integer.parseInt(...) method) of input + the int 5 ( = 17 )  
		System.out.println(howMany); // prints the value of howMany to the screen
		Rectangle box = new Rectangle(5, 10, 20, 20); // creates a new Rectangle data type called box and initializes it using a 5 parameter constructor
		System.out.println(box); // prints box to the screen
		Rectangle box2 = new Rectangle(5, 10, 20, 20);
		System.out.println(box2);
		if (box == box2)
			System.out.println("same");
		else
			System.out.println("not same");
		if (box.equals(box2))
			System.out.println("equal");
		else
			System.out.println("not equal");
		box2.translate(5, 20);
		System.out.println(box2);
		if (box.equals(box2))
			System.out.println("equal");
		else
			System.out.println("not equal");
		String s1 = "cats";
		String s2 = "cats";
		if (s1 == s2)
			System.out.println("same");
		else
			System.out.println("not same");
		String s3 = "I love cats";
		String s4 = s3.substring(7);
		System.out.println(s4);
		System.out.println(s1);
		if (s1 == s4)
			System.out.println("same");
		else
			System.out.println("not same");
		if (s1.equals(s4))
			System.out.println("same");
		else
			System.out.println("not same");
		String s5 = "I love cats";
		String s6 = "cats";
		if (s1 == s6)
			System.out.println("same");
		else
			System.out.println("not same");
		
		
		
		
		
		
	}

}
