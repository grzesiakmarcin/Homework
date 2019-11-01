package Collections;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.*;
import java.util.stream.Collector;
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

        System.out.println("Korona składająca się ze szczytów na literę M:"+przefiltrowana);

        List<Mountain> filtrowanie2 = mountainsList
                .stream()
                .sorted(Comparator.comparingInt(Mountain::getHight))
                .collect(Collectors.toList());

        System.out.println("Szczyty rosnąco:");
        for (Mountain gora: filtrowanie2
             ) {
            System.out.println(gora);
        }


        Map<String,Integer> mountainMap = mountainsList
                .stream()
                .collect(Collectors.toMap(Mountain::getName,Mountain::getHight));


        System.out.println("================== wypisanie zawartosci mapy =====================");
        for (Map.Entry<String,Integer> listelements: mountainMap.entrySet()) {
            System.out.println(listelements.getKey()+" "+listelements.getValue());
        }

//        System.out.println("=================== sortowanie po wartości =======================");

//        Map <String, Integer> sortedMap =mountainMap.entrySet()
//                .stream()
//                .sorted(Map.Entry.comparingByValue())
//                .collect(Collector.toMap(Mountain::getName,Mountain::getHight))

// nie działą ;(



        // albo chuj, sortuje i jade w bieszczady:
        System.out.println("========================= TreeMap======================");
        System.out.println("Po co sie meczyc skoro mamy TreeMap\n");
        TreeMap<String, Integer> selfsortedTreeMap = new TreeMap<>();

        selfsortedTreeMap.putAll(mountainMap);
        for (Map.Entry<String, Integer> list: selfsortedTreeMap.entrySet()) {

            System.out.println(list.getKey() + " " + list.getValue());
        }

            System.out.println("=================== odwrócony TreeMap =========================");
            Metodka foo = new Metodka();
            foo.DifferentMapify(selfsortedTreeMap);




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
class Metodka{

    public Map<Integer, String> DifferentMapify (Map<String,Integer> wstawianaMapa){

        Map <Integer,String> nowaMapa = new TreeMap<>();

        for (Map.Entry<String,Integer> pary:wstawianaMapa.entrySet()) {

            String oldKey=pary.getKey();
            int oldValue=pary.getValue();
            nowaMapa.put(oldValue,oldKey);
        }

        for (Map.Entry<Integer,String> pairs: nowaMapa.entrySet()) {
            int i = pairs.getKey();
            String s = pairs.getValue();
            System.out.println(i+" "+s);
        }


        return nowaMapa;
    }

}