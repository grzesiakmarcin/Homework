package PracaZPlikiem.opcja1;


import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) throws FileNotFoundException {


        PrintWriter zapis = new PrintWriter("WszystkichSwietych.txt");
        zapis.println("Jerzy Kukuczka - 24.10.1989 połódniowa ściana Lhotse ");
        zapis.close();


    }


}

