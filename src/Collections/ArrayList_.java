package Collections;
import     java.util.ArrayList;
public class ArrayList_ {
    public static void main (String[] args) {

 ArrayList<Integer> mojaLista = new ArrayList<Integer>();



          //dodawanie do listy
        mojaLista.add(22);
        mojaLista.add(24);
        mojaLista.add(27);

        for (Object  wartosc: mojaLista) {
            System.out.println(wartosc);
        }

        for (int v=0; v<mojaLista.size(); v++) {

            System.out.println("wartość elementu " + (v + 1) + ": " + mojaLista.get(v));
        }

        //usuwanie z listy

        mojaLista.remove(2);
        System.out.println("\nZawartość listy po usunięciu oswtatniego elementu");
        for (Object wartosc: mojaLista) {
            System.out.println(wartosc);
        }
        System.out.println("==========================");

/* Array list jest niesamowicie wolna w dzialaniu jezeli chodzi o usuwanie elementów ze środka listy -
sugeruje się używanie LinkedListy
 */




    }
}
