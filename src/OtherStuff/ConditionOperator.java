package OtherStuff;

import java.util.Scanner;

public class ConditionOperator {
    public static void main (String[] args) {

        int liczbaA ;


        Scanner sc = new Scanner(System.in);
        System.out.println("podaj liczbę");

        liczbaA=sc.nextInt();
        System.out.println("Podana liczba to:" + liczbaA);


        String result= (liczbaA==21)?"Makao":"nie makao ;p";
        System.out.println(result);



    }
}
