package network;

public interface ChatClient {
    void sendMessage(String message);
    void disconnect();
    boolean isOnline();
}