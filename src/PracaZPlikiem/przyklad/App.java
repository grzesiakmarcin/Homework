package PracaZPlikiem.przyklad;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws FileNotFoundException {


        StringBuilder sb =new StringBuilder();

        String sciezkaPliku = "Test.txt ";

        File mojPlik = new File (sciezkaPliku);

        Scanner in = new Scanner (mojPlik);

        while(in.hasNextLine()){
            sb = sb.append(in);

        }
//
//
        in.close();


        System.out.println(sb.toString());








    }
}
