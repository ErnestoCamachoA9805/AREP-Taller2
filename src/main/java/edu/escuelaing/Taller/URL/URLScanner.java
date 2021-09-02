package edu.escuelaing.Taller.URL;

import java.net.URL;
import java.net.MalformedURLException;

public class URLScanner {
    public static void main(String[] args) throws MalformedURLException{
        URL site= new URL("http://ldbn.escuelaing.edu.co:80/publicaciones/publicaciones.pdf?val=45&r=78#publicaciones");

        // Taller Parte 1
        System.out.println("Protocol: " + site.getProtocol());
        System.out.println("Host: " + site.getHost());
        System.out.println("Authority: " + site.getAuthority());
        System.out.println("Prot: " + site.getPort());
        System.out.println("Path: " + site.getPath());
        System.out.println("Query: " + site.getQuery());
        System.out.println("File: " + site.getFile());
        System.out.println("Reference: " + site.getRef());
    }
}