package Interface.ex1;

abstract class DoPrzesadzenia {


    void sprawdzamCzyDaSiePrzesadzic () {
        System.out.println("Grażyna czai się na implementacje tej rośliny w swoim ogrodzie :)");
    }

    abstract void JanuszWykopuje ();

}
/*
W Javie do tworzenia pewnej abstrakcji służą jak już się dowiedzieliśmy interfejsy. Istnieje jednak również drugi sposób, są to klasy abstrakcyjne.
Ich użycie, a także budowa jest bardzo podobna do interfejsów, ale zawiera też pewne różnice, poniżej znajduje się lista najważniejszych cech klas abstrakcyjnych:

    mogą zawierać metody abstrakcyjne, czyli takie, które nie posiadają implementacji (ani nawet nawiasów klamrowych)
    może zawierać stałe (zmienne oznaczone jako public static final)
    mogą zawierać zwykłe metody, które niosą jakąś funkcjonalność, a klasy rozszerzające mogą ją bez problemu dziedziczyć
    klasy rozszerzające klasę abstrakcyjną muszą stworzyć implementację dla metod oznaczonych jako abstrakcyjne w klasie abstrakcyjnej
    metod abstrakcyjnych nie można oznaczać jako statyczne (nie posiadają implementacji)
    podobnie jak w przypadku interfejsów nie da się tworzyć instancji klas abstrakcyjnych

Jaka jest więc przewaga klas abstrakcyjnych nad interfejsami, skoro na pierwszy rzut oka nie widać praktycznie żadnych różnic?
Przede wszystkim tutaj możemy już umieścić jakąś implementację, natomiast klasy rozszerzające będą miały jedynie obowiązek rozbudować
funkcjonalność poprzez zaimplementowanie metod abstrakcyjnych.

https://javastart.pl/baza-wiedzy/programowanie-obiektowe/klasy-abstrakcyjne
 */
