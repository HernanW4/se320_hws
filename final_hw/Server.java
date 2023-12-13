import java.io.*;
import java.net.*;
import java.util.*;
import java.awt.*;

public class Server {

    public static void main(String[] args) {
        try {
            // Making the server socket
            ServerSocket serverSocket = new ServerSocket(8000);

            // Start listening
            Socket socket = serverSocket.accept();

            DataInputStream incoming = new DataInputStream(
                    socket.getInputStream());
            DataOutputStream output = new DataOutputStream(
                    socket.getOutputStream());

            while (true) {
                //Get the needed stuff 
                double weight = incoming.readDouble();

                double height = incoming.readDouble();

                double bmi = weight / (height * height);

                output.writeDouble(bmi);

                System.out.println("You have been Served... get it?");

                socket.close();

            }

        } catch (IOException e) {
            System.err.print(e);
        }

    }
}
