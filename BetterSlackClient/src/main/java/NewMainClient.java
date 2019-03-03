import java.io.IOException;
import java.net.Socket;

public class NewMainClient {
    public static void main(String[] args) throws IOException {
        ClientExample clientExample = new ClientExample();
        clientExample.connectToServer("192.168.1.74", 55555 );
    }
}
