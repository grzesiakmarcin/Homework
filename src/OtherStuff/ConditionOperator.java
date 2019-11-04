package OtherStuff;

import java.util.Scanner;

public class ConditionOperator {
    public static void main (String[] args) {

        int liczbaA ;


        Scanner sc = new Scanner(System.in);
        System.out.println("podaj liczbę");

        liczbaA=sc.nextInt();
        System.out.println("Podana liczba to:" + liczbaA);



        // na szybko

//        if(liczbaA<20){
//             liczbaA =21;
//        }
//        else if (liczbaA==20){
//            liczbaA = 21;
//                    }
//        else{
//            System.out.println(liczbaA);
//        }
//
//        System.out.println("wynik odejmowania " +liczbaA " i " + "20  będzie dodatni i wyniesie "+(liczbaA-20) + "."  );

/*
od razu widac co jest grane i co robimy wiec po co to zmieniac operatorem warunkowym??
-mniej kodu na ekranie
- zwiezly zapis (o ile nie zapomnisz co jest grane  <warunek> ? <wariant jeżeli  nbtak> <wariant jezeli nie>)



 */
        int liczbaB = liczbaA <21 ? 21: liczbaA;  // <- jeżeli liczba jest więszka od  21 to wstaw wartość wskazaną przez użytkownika, , w innym razie wstaw 21

        System.out.println("liczba B to: " +liczbaB);


    }
}
