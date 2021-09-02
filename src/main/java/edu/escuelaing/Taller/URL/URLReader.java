package edu.escuelaing.Taller.URL;

import java.io.*;
import java.net.*;

//Desarrollado en clase con el Profesor
public class URLReader {
    public static void main(String[] args) throws Exception {
        /*URL url = new URL(args[0]);*/
        URL google = new URL("https://www.google.com/");
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(google.openStream()))) {
            String inputLine = null;
            StringBuilder string = new StringBuilder();
            while ((inputLine = reader.readLine()) != null) {
                System.out.println(inputLine);
                string.append(inputLine);
                string.append(" ");
            }
            FileWriter myWriter = new FileWriter("resultado.html");
            myWriter.write(string.toString());
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException x) {
            System.err.println(x);
        }
    }
}