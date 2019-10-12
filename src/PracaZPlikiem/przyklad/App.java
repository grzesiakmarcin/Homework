package PracaZPlikiem.przyklad;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws FileNotFoundException {

        String pustyString;
        StringBuilder sb =new StringBuilder();

        String sciezkaPliku = "D:\\Test.txt ";



        File mojPlik = new File (sciezkaPliku);


        System.out.println(mojPlik.exists());
        Scanner in = new Scanner (mojPlik);

        while(in.hasNextLine()){
            pustyString = in.nextLine();
            System.out.println(pustyString);
        }
        in.close();


        System.out.println(sb.toString());








    }
}
