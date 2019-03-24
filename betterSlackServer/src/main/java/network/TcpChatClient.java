package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class TcpChatClient implements ChatClient {

    private Socket clientSocket;
    private PrintWriter output;
    private BufferedReader input;
    private Thread readerThread;

    public TcpChatClient(Socket clientSocket) {
        this.clientSocket = clientSocket;
        try {
            output = new PrintWriter(clientSocket.getOutputStream(), true);
            input = new BufferedReader(new InputStreamReader((clientSocket.getInputStream())));
        } catch (IOException e) {
            throw new IllegalArgumentException("Error by initializing client");
        }
        startReading();
    }

    private void startReading() {
        readerThread = new Thread(() -> {
            while (isOnline()) {

            }
        });
        readerThread.start();
    }

    private void readMessage() {
        try {
            String msg = input.readLine();

            if (msg == null) {
                disconnect();
                return;
            }


            System.out.println(msg);
        } catch (IOException e) {
            // TBD
        }
    }

    @Override
    public void sendMessage(String message) {
        if (isOnline()) {
            output.println(message);
        }
    }

    @Override
    public void disconnect() {
        if (isOnline()) {
            try {
                clientSocket.close();
            } catch (IOException e) {
                // implementation not required
            }
            clientSocket = null;
        }

    }

    @Override
    public boolean isOnline() {
        return clientSocket != null && !clientSocket.isClosed();
    }
}
