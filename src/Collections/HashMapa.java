package Collections;
import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class HashMapa {
    public static void main (String[] args) {
        Map <Integer, String> mojaHashMapa = new HashMap<Integer, String>();
        mojaHashMapa.put (1, "łukasz Bacik");
        mojaHashMapa.put (2, "Dagmara Bielnik");
        mojaHashMapa.put (3, "Bartosz Binek");
        mojaHashMapa.put (4, "Damian Duczma");
        mojaHashMapa.put (5, "Dawid Dylejko");


        Scanner  scanner = new Scanner(System.in);
        int counter=6;



        while (true) {

            System.out.println("Podaj imie, podając znaczek \"stop\" aplikacja zatrzyma się ");
            String imie = scanner.nextLine();


            if (imie.equals("stop")) {
                System.out.println("koniec programu");
                break;


            } else {
                mojaHashMapa.put(counter, imie);
                System.out.println("Dodano: " + mojaHashMapa.get(counter));
                counter++;
            }
        }

        for (Integer key: mojaHashMapa.keySet()) {
            String value = mojaHashMapa.get(key);
            System.out.println(key + ": " + value);
        }

        Random random = new Random();
        int randomNumber= random.nextInt((counter-1));
        System.out.println("Poproszę do odpowiedzi nr : "+randomNumber
                +". " +mojaHashMapa.get(randomNumber));


        System.out.println("Zwracanie klucza i wartosci");

        for (Map.Entry<Integer, String> cosTam : mojaHashMapa.entrySet()) {
            int klucz = cosTam.getKey();
            String warosc = cosTam.getValue();
            System.out.println(klucz + ": " + warosc);
        }
            //albo po staremu


            System.out.println("==================");
        for (Map.Entry<Integer, String> cosTam : mojaHashMapa.entrySet()) {
            System.out.println(cosTam.getKey()+": "+cosTam.getValue());
        }




    }
}
