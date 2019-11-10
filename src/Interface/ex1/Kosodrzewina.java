package Interface.ex1;

public class Kosodrzewina extends DoPrzesadzenia implements AutumnOn {
    public void wzrost (){
        System.out.println("przyrost 0,5 przez całe życie z czego 1m w kłębie");
    }
    public void fotosynteza(){
        System.out.println("przerabiam dwutlenek węgla na tlen w śmiesznej ilosci");
    }
    public void pobieranieWody(){
        System.out.println("Pobieram z gleby składniki mineralne oraz wode");
    }

    @Override
    public void żywicaStop () {
        System.out.println("Zywica stop");
    }


    @Override
    void JanuszWykopuje () {
        System.out.println("Janusz po wytarganiu z ziemi i wkopaniu w innym miejscu ogrody zapisał się do fizjoterapeuty.");

    }
}
