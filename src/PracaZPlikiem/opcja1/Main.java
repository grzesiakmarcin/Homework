package PracaZPlikiem.opcja1;


import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) throws FileNotFoundException {


        PrintWriter zapis = new PrintWriter("WszystkichSwietych.txt");
        zapis.println("Jerzy Kukuczka - 24.10.1989 połódniowa ściana Lhotse \n Najlepszy himalaista wszech czasów odpadł ze południowej - nigdy nie zdobyteś - ściany a jego ciała nigdy nie odnaleziono.");
        zapis.close();



        FileReader reader = new FileReader("WszystkichSwietych.txt");
        BufferedReader bufferedReader = new BufferedReader(reader);

        // albo w jednej linijce
        // BufferedReader bufferedReader = new BufferedReader( new FileReader("WszystkichSwietych.txt"););
        try {
            String s;
            while ((s = bufferedReader.readLine())!= null) {
                s = bufferedReader.readLine();
                System.out.println(s);
            }

            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }


}

