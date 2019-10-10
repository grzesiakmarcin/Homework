package PracaZPlikiem.opcja2;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class Opcja2 {
    public static void main(String[] args) {
        File plik = new File("Test.txt");
        plik.mkdir();


        if(!plik.exists()){

            try {
                plik.createNewFile();
            }


            catch (IOException e) {
                e.printStackTrace();
                System.out.println("Nie udało się utworzyć pliku");
            }
        }
        System.out.println("czy moge nanosic zmiany? "+plik.canWrite());
        System.out.println("czy moge nanosic odpalic/otowrzyc? "+plik.canExecute());
        System.out.println("czy moge nanosic oczytac? "+plik.canRead());
        System.out.println("czy moge nanosic ukryty? "+plik.isHidden());

    }
}
