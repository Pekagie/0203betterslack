import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientExample {
    private Socket socket;
    private PrintWriter output;
    private BufferedReader input;
    private static final String KEYWORD = "Exit";
    Scanner sc = new Scanner(System.in);

    public void connectToServer(String ipAdress, int port) throws IOException {
        socket = new Socket(ipAdress, port);
        input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        output = new PrintWriter(socket.getOutputStream(), true);

        while(true) {
            String userInput = sc.next();

            output.println(userInput);
            if(userInput.toLowerCase().equals(KEYWORD)) {
                break;
            }
        }
        System.out.println(input.readLine());
    }
}
