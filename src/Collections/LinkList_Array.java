package Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkList_Array {

    public static void main (String[] args) {


        ArrayList<Integer> mojaArrayLista = new ArrayList<Integer>();
        LinkedList<Integer> mojaLinkLista = new LinkedList<Integer>();

        zliczaczCzasu("ArrayLista", mojaArrayLista);
        zliczaczCzasu("LinkLista",mojaLinkLista);

//        for(Integer wartosc : mojaArrayLista){
//            System.out.println(wartosc);
//        }


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


