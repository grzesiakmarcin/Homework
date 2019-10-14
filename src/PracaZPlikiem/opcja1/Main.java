package PracaZPlikiem.opcja1;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        String odczytaneZPliku = "";
        int jakaś_cyfra=0;

        File mojPlik = new File ("testik.txt");

        try {
            PrintWriter zapisDoPliku = new PrintWriter(mojPlik);
            zapisDoPliku.println("13. padziernika");
            //zapisDoPliku.println("13. padziernika");

            zapisDoPliku.println(300);
            zapisDoPliku.close();

        } catch (FileNotFoundException e) {
            System.out.println("Nie znaleziono pliku który miał być zapisany %s\n"+ e);
            e.printStackTrace();
        }



        try {
            Scanner odczytZPliku = new Scanner(mojPlik);
           while(odczytZPliku.hasNext()) {
              odczytaneZPliku=odczytZPliku.nextLine();
              jakaś_cyfra= odczytZPliku.nextInt();
           }
            odczytZPliku.close();


        } catch (FileNotFoundException e) {
            System.out.println("Nie udało się odczytać z pliku"+ e);
            e.printStackTrace();
        }

        System.out.println(odczytaneZPliku);
        System.out.println(jakaś_cyfra);


    }

}

