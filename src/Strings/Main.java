package Strings;

public class Main {
    public static void main(String[] args) {

        String string1 = "SeaQuest 2032";
        String string2 = "         Himalaje są daleko      .               ";
        String string3 = "Ucze się Javy";
        String string4 = "WIADOMOŚCI";



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
        //
        System.out.println("------>");
        //k
        System.out.println(" ----->");
        //
        System.out.println("------>");
    }



}
