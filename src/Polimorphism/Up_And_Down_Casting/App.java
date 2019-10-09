package Polimorphism.Up_And_Down_Casting;

public class App {
    public static void main(String[] args) {

        Machine m1 = new Machine();

        Camera c1= new Camera();


        m1.start();

        c1.start();
        c1.snap();



        //Upcasting
        Machine m2 = c1;

        m2.start();



        //Downcasting
        // error: m2.snap();  <-- nie jestem w stanie tego wykonac
        ((Camera) m2).snap(); /*  a jednak jestem,


        Machine m2  - myśl o tym jak o pewnej rejestracji/etykiecie bez metod,
        Metody są wykonywanie na obiekcie którym jest Camera(),
        Nie mniej jeżeli chcesz wykonać czynność zarejestrowaną dla danego obiektu
        to musisz wskazac JAVIE dokladna etykiete
        ((Camera) m2) to takie pokazanie kompilatorowi ze wiesz co robisz

        */

// *  przy downcastingu należy wiedzieć co się robi:

//   Machine m4 = new Machine();
 //  Camera c3 = (Camera) new Machine();

//        ((Machine)c3).start(); // <-- wywołanie metody start z klasy Machine
 //       c3.snap(); // <-- i oto próbujesz wywołać metode snap w klasie która tej metody nie ma!







    }
}
