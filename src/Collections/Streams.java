package Collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {
    public static void main (String[] args) {


        List<Mountain> mountainsList = new ArrayList<Mountain>();
        mountainsList.add(new Mountain("Mount Everest", 8848));
        mountainsList.add(new Mountain("Lhotse", 8516));
        mountainsList.add(new Mountain("K2", 8611));
        mountainsList.add(new Mountain("Czo Oju ", 8201));
        mountainsList.add(new Mountain("Nanga Parbat ", 8126));
        mountainsList.add(new Mountain("Makalu ", 8481));
        mountainsList.add(new Mountain("Sziszapangma", 8013));
        mountainsList.add(new Mountain("Kanczendzonga ", 8586));
        mountainsList.add(new Mountain("Broad Peak ", 8051));
        mountainsList.add(new Mountain("Manaslu ", 8156));
        mountainsList.add(new Mountain("Gaszerbrum II ", 8035));
        mountainsList.add(new Mountain("Gaszelbrum I ", 8080));


        List<Mountain> przefiltrowana = mountainsList
                .stream()
                .filter(b -> b.name.startsWith("M"))
                .collect(Collectors.toList());

        System.out.println(przefiltrowana);

        List<Mountain> filtrowanie2 = mountainsList
                .stream()
                .sorted(Comparator.comparingInt(Mountain::getHight))
                .collect(Collectors.toList());

        for (Mountain gora: filtrowanie2
             ) {
            System.out.println(gora);

        }


    }
}

class Mountain {
    String name;
    int hight;



    public Mountain (String name, int hight) {
        this.name = name;
        this.hight = hight;
    }

    public String getName () {
        return name;
    }

    public int getHight () {
        return hight;
    }

    @Override
    public String toString () {
        return "Mountain{" +
                "nazwa:" + name + '\'' +
                ", wysokość:" + hight +
                '}';
    }
}