package Rzutowanie_WildCards;


import java.util.ArrayList;
import java.util.List;



class KlasaRodzic{
    static List <KlasaRodzic> jakasNowaLista= new ArrayList<>();
    /** podpytac Mateusza**/


    public static List tester (List <?>lista){  //  gdybyśm wpisalio <? extends KlasaRodzic> ograniczymy przyjmowanie obiektów jedynie do poziomu KlasaRodzic

        jakasNowaLista.add((KlasaRodzic) lista);  //jako że jakasNowaLista est listą obiektów typu KlasaRodzic musimu zrzutować przyjmowaną wartość (lista) do tego typu. Robimy to poprzez wpisywane (>>Klasa Obiektu<<)
        return jakasNowaLista;
    }
}
class KlasaDziecko extends KlasaRodzic{}

public class App {
    public static void main (String[] args){

        List<String> listaStringow = new ArrayList<String>();
        List <KlasaRodzic> listaClass = new ArrayList<KlasaRodzic>();

        listaClass.add(new KlasaRodzic());
        listaClass.add(new KlasaDziecko());


        KlasaRodzic.tester(listaStringow);

        List<String> listaS = new ArrayList<String>();
        //List<Object> listaO = listaS;


        KlasaRodzic.tester(listaClass);




    }
}
