import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class NewMain {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket();
        ClientServer clientServer = new ClientServer();
        clientServer.startServer(50001);
    }
}
