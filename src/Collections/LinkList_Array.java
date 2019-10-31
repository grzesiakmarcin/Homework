package Collections;

import java.util.*;

public class LinkList_Array {

    public static void main (String[] args) {

        List <String> mojaListaStringow = new ArrayList<String>();
        ArrayList<Integer> mojaArrayLista = new ArrayList<Integer>();
        LinkedList<Integer> mojaLinkLista = new LinkedList<Integer>();

        zliczaczCzasu("ArrayLista", mojaArrayLista);
        zliczaczCzasu("LinkLista",mojaLinkLista);

//        for(Integer wartosc : mojaArrayLista){
//            System.out.println(wartosc);
//        }


        mojaListaStringow.add("Asia");
        mojaListaStringow.add("Monika");
        mojaListaStringow.add("Ola");
        mojaListaStringow.add("Magda");

        mojaListaStringow.add("Helenka");
        mojaListaStringow.add("Halinka");

        for (String osoby: mojaListaStringow) {
            System.out.println(osoby);
            }

        System.out.println("=======================");
        Collections.sort(mojaLinkLista);

        for (String osoby: mojaListaStringow) {
            System.out.println(osoby);
        }




    }

    private static void zliczaczCzasu (String typ, List<Integer> jakasLista){
        long start = System.currentTimeMillis();


        // dodajemy do konca listy
//        for (int i=0; i<1000000; i++){
//            jakasLista.add(i);
//        }


        //dodajemy elementy do środka listy

//        for (int i=0; i<10000; i++){
//            jakasLista.add(((jakasLista.size()/2)),i);
//        }


        //dodajemy elementy na koniec listy

        for (int i=0; i<100000;i++){            // <- dla arrayListy jest to jest jakiś dowcip, wynika to z tego że jezeli chcemy dodać coś na początku to pozostałe elementy muszą być przesunięte
            jakasLista.add(0,i );          // arrayLista jest jak ciąg puzzli kocków lego. aRRay= puZZle
        }


        long stop = System.currentTimeMillis();
        System.out.println("czas " + (stop-start) + "ms dla: " + typ);




    }
}


