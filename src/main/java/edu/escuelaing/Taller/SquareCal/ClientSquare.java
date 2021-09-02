package edu.escuelaing.Taller.SquareCal;

import java.io.*;
import java.net.*;

public class ClientSquare {
    public static void main(String[] args) throws IOException{
        Socket clientSocket = null;
        PrintWriter out = null;
        BufferedReader in = null;
        try {
            clientSocket = new Socket("127.0.0.1", 35001);
            out = new PrintWriter(clientSocket.getOutputStream(), true);
            in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        } catch (UnknownHostException e) {
            System.err.println("Don’t know about host!.");
            System.exit(1);
        } catch (IOException e) {
            System.err.println("Couldn’t get I/O for "+ "the connection to: localhost.");
            System.exit(1);
        }
        BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
        String userInput;
        System.out.println("Por favor digite los numeros seguidos de la tecla <Enter>: ");
        while ((userInput = stdIn.readLine()) != null) {
            out.println(userInput);
            System.out.println(in.readLine());
            if(userInput.equals("End.")) break;
        }
        out.close();
        in.close();
        stdIn.close();
        clientSocket.close();
    }
}