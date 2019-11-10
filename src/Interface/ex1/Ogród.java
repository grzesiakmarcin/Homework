package Interface.ex1;

public class Ogród {
    public static void main (String[] args) {
        Drzewa sosna = new Sosna();
        Drzewa jablon = new Jablon();
        Drzewa swierk = new Swierk();
        Kosodrzewina kd = new Kosodrzewina();


        System.out.println("\n---------------------Dziedziczenie ----------------------");
        sosna.bycieDomem();

        System.out.println("\n--------------- super + nadpisanie metody-----------------");
        jablon.bycieDomem();

        System.out.println("\n------------------- nadpisanie metody----------------");
        swierk.bycieDomem();

        System.out.println("\n------------------ Klasa abstrakcyjna ---------------");
        kd.sprawdzamCzyDaSiePrzesadzic();
        System.out.println("\n-------------------- implementac interfacu---------------------");
        kd.żywicaStop();



    }
}

