package edu.escuelaing.Taller.SquareCal;

import java.io.*;
import java.net.*;

public class ServerSquare {
    public static void main(String[] args) throws IOException{
        ServerSocket serverSocket= null;
        try {
            serverSocket = new ServerSocket(35001);
        } catch (IOException e) {
            System.err.println("Could not listen on port: 35001.");
            System.exit(1);
        }
        Socket clientSocket = null;
        try {
            clientSocket = serverSocket.accept();
        } catch (IOException e) {
            System.err.println("Accept failed.");
            System.exit(1);
        }
        PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
        BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        String inputLine, outputLine;
        while ((inputLine = in.readLine()) != null) {
            if (inputLine.equals("End.")) break;
            Double valor= Double.parseDouble(inputLine);
            valor= Math.pow(valor, 2);
            outputLine = "El cuadrado de " + inputLine +" es: " + valor;
            out.println(outputLine);
        }
        out.close();
        in.close();
        clientSocket.close();
        serverSocket.close();
    }
}