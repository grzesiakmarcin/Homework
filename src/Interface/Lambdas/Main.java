package Interface.Lambdas;

import java.util.ArrayList;
import java.util.List;

/**
 * https://javadeveloper.pl/wyrazenia-lambda-w-jezyku-java/#warianty-interfejsu-function
 * <p>
 * https://kobietydokodu.pl/niezbednik-juniora-wyrazenia-lambda-i-strumienie/
 * <p>
 * https://www.samouczekprogramisty.pl/wyrazenia-lambda-w-jezyku-java/
 */

public class Main {
    public static void main (String[] args) {
        List<Celebrity> celebritiesList = new ArrayList<Celebrity>();
        celebritiesList.add(new Celebrity("Dorota", true, false, true));
        celebritiesList.add(new Celebrity("Natasza", true, false, true));
        celebritiesList.add(new Celebrity("Michał", false, false, false));
        celebritiesList.add(new Celebrity("Marcin", false, true, true));
        celebritiesList.add(new Celebrity("Szymon", false, false, true));

        print(celebritiesList, c -> c.CanSing());  // wybieramy tych ktorzy potrafia spiewac
        print(celebritiesList,Celebrity::CanAct);

    }


    private static void print (List<Celebrity> lista, CheckTalent check) {
        for (Celebrity celebryta : lista) {
            if (check.test(celebryta)) {
                System.out.println(celebryta + " ");

            }
            System.out.println();
        }

    }
}
