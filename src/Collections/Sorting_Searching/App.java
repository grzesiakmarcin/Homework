package Collections.Sorting_Searching;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class App {
    public static void main (String[] args) {
        Random generator = new Random();

        List<Integer> numbers = new ArrayList<Integer>();
        for (int a = 0; a < 20; a++) {
            numbers.add(generator.nextInt(100));
        }
        printList(numbers);


        find(numbers,60);


    }

    public static void printList (List<Integer> mojalista) {
        System.out.println("============ nieposortowana lista=================");
        for (Integer numerki : mojalista) {
            System.out.print(numerki + " ");
        }
    }


    public static int find (List<Integer> przeszukiwanaLista, Integer szukanaWartosc) {
        int znaleziono = 0;
        for (int i = 0; i < przeszukiwanaLista.size(); i++) {

            if (przeszukiwanaLista.get(i) == szukanaWartosc) {
                znaleziono = szukanaWartosc;
                break;
            }
        }

        System.out.println("\n ===========================");
        System.out.println(znaleziono);
        return znaleziono;
    }







}