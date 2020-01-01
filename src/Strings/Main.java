package Strings;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        String string1 = "SeaQuest 2032";
        String string2 = "         Himalaje są daleko      .               ";
        String string3 = "Ucze się Javy";
        String string4 = "WIADOMOŚCI";
        String andrzej = "Pan Andrzej ma na imie Przemek i pochodzi z wielkopolski";



        //trim - wycinanie białych znaków

        String string5 = string2.trim();
        System.out.println("-----> trim"+ string2.trim()+"| TUTAJ KONIEC");
      // System.out.println(string5);

        //toUpperCase
        System.out.println("toUpperCase -----> "+string1.toUpperCase());

        //toLowerCase
        System.out.println("----> toLowerCase " +string4.toLowerCase());

        //isEmpty
        System.out.println("is Empty  ----->"+ string1.isEmpty());

        //length
        System.out.println("------> length "+ string2.length());

        //charAt   zwraca nam znak który jest pod danym indeksem
        System.out.println("charAt -----> "+string3.charAt(7));

        //toCharArray
        char[] tablicaZnakow = string3.toCharArray();
        for (char znak :tablicaZnakow) {
            System.out.print(znak+", ");
        }
        System.out.println();

        //substring
        System.out.println("substring -----> "+ string4.substring(6,10));
        String osci=string4.substring(6,10);



        //SubSequence - robi dokladnie to samo ale z ta roznicą, że zrzuca cos to sekwencji Charów
        CharSequence SubString = string3.subSequence(1,5);

        System.out.println("------>SubSequence" + SubString);


        //STRING SPLIT
        System.out.println(" ----->STRING SPLIT  <------------");

        String[] split1 = string2.split("",5);
        for (String stringus:split1) {
            System.out.println(stringus);
        }

        String[] himalajesadaleko = string2.split("");
        System.out.println(himalajesadaleko.length);


        String[] panAndrzej=andrzej.split(" ");
        System.out.println(panAndrzej.length);



        String[] panAndrzejLimit=andrzej.split("");
        System.out.println(panAndrzejLimit.length + " a ponizej wypisanie dokladnie tego co znajduje sie w tablicy");
        for (String cosik: panAndrzejLimit) {
            System.out.println(cosik+", ");
        }

        //replace

        String andrzej2=andrzej.replace("Andrzej", "Paweł");
        System.out.println(andrzej2);
        andrzej2=andrzej2.replace("Paweł", "123");
        andrzej2=andrzej2.replaceAll("[0-9]","Szymon ");
        System.out.println(andrzej2);

        System.out.println(string1.indexOf("Q"));


        //equals
        System.out.println(andrzej.equalsIgnoreCase(andrzej2));  // ignoruje wielkość znaków


    }



}
