package Interface.ex1;

public class Ogród {
    public static void main (String[] args) {
        Drzewa sosna = new Sosna();
        Drzewa jablon = new Jablon();
        Drzewa swierk = new Swierk();
        Kosodrzewina kd = new Kosodrzewina();

        sosna.bycieDomem();
        jablon.bycieDomem();
        swierk.bycieDomem();
        kd.żywicaStop();


    }
}

