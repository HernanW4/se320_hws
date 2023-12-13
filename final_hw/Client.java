import java.util.Scanner;
import java.io.*;
import java.net.*;

public class Client{

    public static void main(String[] args){
        try{
            Socket socket = new Socket("localhost", 8000);

            DataInputStream incoming = new DataInputStream(
                    socket.getInputStream());

            DataOutputStream output = new DataOutputStream(
                    socket.getOutputStream());

            // Input the weights and height
            Scanner scan = new Scanner(System.in);

            System.out.println("Please enter your weight(kg): ");
            // Get weight
            double weight = scan.nextDouble();
            output.writeDouble(weight);

            System.out.println("Please enter your height(m): ");
            //Get height
            double height = scan.nextDouble();
            output.writeDouble(height);

            scan.close();


            System.out.println("The server calculates that your BMI is... "+incoming.readDouble());

            socket.close();



        }catch(IOException e){
            System.err.println(e);
        }
    }
}
