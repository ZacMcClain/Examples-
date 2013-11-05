
public class ChatServer {
	private ChatClient client;
	
	public ChatServer(ChatClient client) {
		this.client = client;
	}
	public void doMessages() {
		String msg = client.sendMessage();
		System.out.println("Logging " + msg);
		client.receiveMessage(msg);
	}
	
	public static void main(String[] args) {
		ChatServer server = new ChatServer(new BoringChatClient());
		server.doMessages();
		ChatServer server2 = new ChatServer(new FunChatClient());
		server2.doMessages();
		
	}

}
