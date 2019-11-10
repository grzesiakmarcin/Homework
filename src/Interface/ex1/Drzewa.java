package Interface.ex1;

public class Drzewa {

    public void wzrost () {
        System.out.println("przyrost 1,5 rok, oraz 4cm średnicy w pniu");
    }

    public void fotosynteza () {
        System.out.println("przerabiam dwutlenek węgla na tlen w ilosce 3litry/godzine");
    }

    public void pobieranieWody () {
        System.out.println("Pobieram z gleby składniki mineralne oraz wode");
    }

    public void bycieDomem () {
        System.out.println("Ptaki założyłyt gniazdo");
    }
}


class Sosna extends Drzewa implements AutumnOn {


    @Override
    public void fotosynteza () {
        System.out.println("przerabiam co2 na o2 z predkoscia 0,3 litra na dobe");
    }


    @Override
    public void bycieDomem () {
        super.bycieDomem();
    }

    @Override
    public void żywicaStop () {
        System.out.println("żywica STOP");
    }
}


class Swierk extends Drzewa implements AutumnOn {
    @Override
    public void fotosynteza () {
        System.out.println("przerabiam co2 na o2 z predkoscia 0,3 litra na dobe");
    }


    @Override
    public void bycieDomem () {
        System.out.println("Smiersze zywicą, nic nie założyło gniazdo ale jebie mnie jakiś dzięcioł");
    }

    @Override
    public void żywicaStop () {
        System.out.println("Zywica STOP");
    }
}


class Jablon extends Drzewa implements AutumnOnLisciaste {
    @Override
    public void bycieDomem () {
        super.bycieDomem();
        System.out.println("w mojej koronie znajduje się dodatkow gniazdo pszczół a w starej dziupli po dzięciole wiewiórka zrobiłą sobie salonik :-)");

    }

    public void kwitnienie () {
        System.out.println("pięknie kwitnę");
    }

    public void owocowanie () {
        System.out.println("rodzę owoce");
    }

    @Override
    public void przemarzanie () {
        System.out.println("jezeli będzie za zimno to umrę");
    }

    @Override
    public void leafsOff () {
        System.out.println("gdzie się podziały moje liście?");

    }
}


