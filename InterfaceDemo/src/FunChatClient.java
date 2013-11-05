import java.util.ArrayList;


public class FunChatClient implements ChatClient {
	private ArrayList<String> messages = new ArrayList<String>();

	@Override
	public void receiveMessage(String message) {
		messages.add(message);
		System.out.println(message.toUpperCase() + "!");
	}

	@Override
	public String sendMessage() {
		java.util.Scanner scan = new java.util.Scanner(System.in);
		System.out.println("Enter a fun message");
		String msg = scan.nextLine();
		return msg;
	}



}
