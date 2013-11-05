
public class BoringChatClient implements ChatClient {

	@Override
	public void receiveMessage(String message) {
		System.out.println("here's your message " + message);
		
	}

	@Override
	public String sendMessage() {
		return "This is a very interesting message - about cats";
	}

}
