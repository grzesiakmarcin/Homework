package Polimorphism;

import com.sun.xml.internal.ws.addressing.WsaActionUtil;

public class App {
    public static void main(String[] args) {

        Plant P1 = new Plant();
        Plant p2 = new Oak();

        Oak o1 = new Oak();

        Plant p3 = new Acer();
        Plant p4 = new Fir();


        p2.fotosynteza();

        p3.autumnOn();
        p4.autumnOn();

        // p2.seed(); dziedzieczenie w gore nie dziala->> polimorfizm w jednym kierunku
        o1.seed();

        p3.someMethod();
        o1.someMethod();
        System.out.println(o1.liczba (2));
        System.out.println();





    }
}
