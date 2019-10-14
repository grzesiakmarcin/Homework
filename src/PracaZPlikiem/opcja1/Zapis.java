package PracaZPlikiem.opcja1;

import java.io.*;
import java.util.ArrayList;

public class Zapis {


    public static void zapis() throws FileNotFoundException, IOException {

        ArrayList<Student> listaStudentow = new ArrayList<Student>();

        listaStudentow.add(new Student("Arek", 23, "Uniwersytet Ekonomiczny", "Finanse i rachunkowosc", "Wrocław"));
        listaStudentow.add(new Student("Agnieszka", 20, "Uniwersytet Medyczny", "medycyna", "Poznań"));
        listaStudentow.add(new Student("Przemek", 41, "Akademia Wychowania Fizycznego", "fizjoterapia", "Szczecin"));
        listaStudentow.add(new Student("Jarek", 29, "Uniwersytet Warszawski", "filologia polska", "Warszawa"));
        listaStudentow.add(new Student("Kasia", 21, "Uniwersytet Jagieloński", "prawo", "Kraków"));
        listaStudentow.add(new Student("Justyna", 23, "KUL", "filozofia", "Lublin"));

        /*
         Czynności :
         1.Utworzyć nowy plik,
         2.Utworzyć nowy FileOutputStream
         3.Utworzyć nowy ObjectOutputStream który będzie zawierać pętle zapisującą zawartość ArrayListy do pliku
         4. pozamykać wrzysztko

        https://www.youtube.com/watch?v=_jhCvy8_lGE
         */

        File mojPlik = new File("listaStudentów.txt");
        FileOutputStream streamPliku = new FileOutputStream(mojPlik);
        ObjectOutputStream wlasciwyStream = new ObjectOutputStream(streamPliku);
        for (Student osoba : listaStudentow) {
            wlasciwyStream.writeObject(osoba);
        }

        wlasciwyStream.close();
        streamPliku.close();

    }


}


