package Interface.ex1;

public class Ogród {
    public static void main (String[] args) {
        Drzewa sosna = new Sosna();
        Drzewa jablon = new Jablon();
        Drzewa swierk = new Swierk();
        Kosodrzewina kd = new Kosodrzewina();


        System.out.println("---------------------Dziedziczenie ----------------------");
        sosna.bycieDomem();

        System.out.println("--------------- super + nadpisanie metody-----------------");
        jablon.bycieDomem();

        System.out.println("------------------- nadpisanie metody----------------");
        swierk.bycieDomem();

        System.out.println("------------------ Klasa abstrakcyjna ---------------");
        kd.sprawdzamCzyDaSiePrzesadzic();
        System.out.println("-------------------- implementac interfacu---------------------");
        kd.żywicaStop();



    }
}

