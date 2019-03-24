public class Main {
    public static void main(String[] args) {
    NetworkBasedChatClient client = new TcpChatClient();
    client.connect("127.0.0.1", 50000);

    UserInputProvider inputProvider = new ConsoleInputProvider();
    while(client.isOnline()) {
       String userInput = inputProvider.getUserInput();
       client.sendMessage(userInput);
    }
    }
}
