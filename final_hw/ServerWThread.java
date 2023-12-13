import java.io.*;
import java.net.*;

public class ServerWThread {
    public static void main(String[] args) {
        try {
            // Making the server socket
            ServerSocket serverSocket = new ServerSocket(8000);
            System.out.println("Starting this server with threads!!!");

            int clientId = 1;

            while (true) {
                // Start listening
                Socket socket = serverSocket.accept();

                // I spent minutes trying to figure this out. I hate Threads
                final int threadCounter = clientId;

                // Making thread, what the thread should do
                Thread t = new Thread(() -> {
                    try {
                        DataInputStream incoming = new DataInputStream(
                                socket.getInputStream());
                        DataOutputStream output = new DataOutputStream(
                                socket.getOutputStream());

                        double weight = incoming.readDouble();

                        double height = incoming.readDouble();

                        double bmi = weight / (height * height);

                        output.writeDouble(bmi);

                        System.out.println("Client " + threadCounter + " been Served... get it?");

                        socket.close();
                    } catch (Exception e) {
                        System.err.println(e);
                    }
                });

                t.start();
                clientId += 1;

            }
        } catch (IOException e) {
            System.err.print(e);
        }
    }
}
