package others;

import java.util.ArrayList;
import java.util.List;

public class Constructor {
    public static void main(String[] args) {

        Auto autko1 = new Auto("Mercedes", "kombi",149);
        Auto autko2 = new Auto("BMW", "kombi",115);
        Auto autko3 = new Auto("Mercedes", "sedan",225);
        Auto autko4 = new Auto("Fiat", "hatchback",90);
        CiagnikSiodlowy tir1 = new CiagnikSiodlowy("Scania", 600);





        List <Auto> listaAut = new ArrayList<Auto>();
        listaAut.add(autko1);
        listaAut.add(autko2);
        listaAut.add(autko3);
        listaAut.add(autko4);


        for (Auto auta :listaAut) {
            System.out.println(auta);
        }



        System.out.println(tir1);

        System.out.println(Auto.getCounter());

    }
}


class Auto {
    private String marka;
    private String buda;
    private int km;
    private static int counter=1;
    private int id;




    public Auto(String podajMarke, String podajnadwozie, int podajMoc) {
        marka = podajMarke;
        buda = podajnadwozie;
        km = podajMoc;

        System.out.println("To jest konstruktor Auto");
        id =counter;
        counter++;
        System.out.println("ID: "+id+"\n Marka: "+podajMarke+"\n nadwozie: "+podajnadwozie+"\n moc:"+podajMoc+"KM.\n");
    }

    public static int getCounter() {
        return counter;
    }

    public int getId() {
        return id;
    }



}

class CiagnikSiodlowy {
    private String marka;
    private int km;

    public CiagnikSiodlowy(String podajMarke, int podajMoc){
        marka = podajMarke;
        km = podajMoc;

        System.out.println("To jest konstruktor Ciągnik siodłowy");

        System.out.println("Marka: "+ podajMarke+"\nMoc: "+podajMoc+"KM. \n");

    }

}
