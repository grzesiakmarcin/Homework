package Collections;
import java.util.HashMap;
import java.util.Map;

public class HashMapa {
    public static void main (String[] args) {
        java.util.HashMap <Integer, String> mojaHashMapa = new java.util.HashMap<Integer, String>();

        mojaHashMapa.put (1, "łukasz Bacik");
        mojaHashMapa.put (2, "Dagmara Bielnik");
        mojaHashMapa.put (3, "Bartosz Binek");
        mojaHashMapa.put (4, "Damian Duczma");
        mojaHashMapa.put (5, "Dawid Dylejko");


        System.out.println("Poproszę do odpowiedzi nr 5: " + mojaHashMapa.get(5));

//        for (Map.Entry<Integer, String> klucz : mojaHashMapa.entrySet()){
//            int klucz = Map.Entry.get.Va
//            System.out.println(mojaHashMapa.get(klucz));
//        }

        for(int i=1; i<(mojaHashMapa.size()+1);i++){
            System.out.println(mojaHashMapa.get(i)); 

        }

    }
}
