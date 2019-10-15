package PracaZPlikiem.opcja1;

import java.io.*;
import java.util.ArrayList;

public class Odczyt {

    public void odczyt() throws FileNotFoundException, IOException {
        ArrayList<Student> odczytanaLista = new ArrayList<Student>();
        /*
        1. tworzymy nowa arrayliste na potrzeby zapisu
        2. tworzymy nowy fileInputStrem,
        3. tworzymy nowy ObjectInputStream
        odczyujmey
        zamykamy
         */
        File mojPlikOdczyt = new File("listaStudentow.txt");
        System.out.println(mojPlikOdczyt.exists());
        System.out.println(mojPlikOdczyt.canRead());
        FileInputStream odczytZPliku = new FileInputStream(mojPlikOdczyt);
        ObjectInputStream stremZObiektu = new ObjectInputStream(odczytZPliku);


try {

    while (true) {
        Student odczytany = null;
        try {
            odczytany = (Student) stremZObiektu.readObject();


        } catch (ClassNotFoundException e) {
            System.out.println("odczytany obiekt nie pasuje nam do klasy");
            e.printStackTrace();
        }
        odczytanaLista.add(odczytany);

    }
}
catch (EOFException ex){
    System.out.println("Odczyt zakończył się");
    stremZObiektu.close();
    odczytZPliku.close();


}


        for (Student o: odczytanaLista
             ) {
            System.out.println(o);

        }








    }
}
