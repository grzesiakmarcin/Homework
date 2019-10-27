package Collections.Zadanko;

import java.util.*;

/**
 * Napisz klasę City, która będzie przechowywała nazwę miasta, liczbę mieszkańców oraz powierzchnię miasta. Korzystając
 * z interfejsu List stwórz listę miast. Zastanów się w jakim przypadku lepiej będzie wykorzystać implementację
 * LinkedList, a kiedy ArrayList. Wynik programu wyświetl na ekran konsoli..
 * <p>
 * <p>
 * Napisz klasę Country, która będzie przechowywała nazwę państwa, liczbę ludności oraz język urzędowy. Korzystając
 * z HashMap, stwórz mapę, gdzie kluczem będzie obiekt Country, zaś wartością będzie lista obiektów City
 * (z zadania nr.1). Wynik programu wyświetl na ekran konsoli. Dodatkowo zapisz mapę do pliku w formacie:
 */

public class App {
    public static void main (String[] args) {


        List<City> listaMiast = new LinkedList<City>();


        listaMiast.add(new City("Wrocław", 641607, 292.8));
        //listaMiast.add(new City("Kraków", 771069, 326.85));
        //listaMiast.add(new City("Lodz", 682679, 293.25));
        //listaMiast.add(new City("Poznań", 536438, 261.91));
        listaMiast.add(new City("Berlin", 3748148, 891.85));
        listaMiast.add(new City("Paryz", 2243833, 105.4));

        for (City miasto : listaMiast
        ) {
            System.out.println(miasto.toString());

        }

        List<Country> countries = new LinkedList<Country>();
        countries.add(new Country("PL", 38413000, "polski"));
        countries.add(new Country("DE", 83019200, "niemiecki"));
        countries.add(new Country("FR", 67022000, "francuski"));


        System.out.println("=======================>Zadanie 2<========================\n");

        Map<Country, City> listaZ2 = new LinkedHashMap<Country, City>();

        listaZ2.put(countries.get(0), listaMiast.get(0));
        listaZ2.put(countries.get(1), listaMiast.get(1));
        listaZ2.put(countries.get(2), listaMiast.get(2));


        for (Map.Entry<Country, City> entry : listaZ2.entrySet()) {
            Country key = entry.getKey();
            City values = entry.getValue();
            System.out.println(key + " " + values);
        }


    }
}

class City {
    private String nazwaMiasta;
    private double liczbaMieszkancow;
    private double powierzchniaMiasta;

    public String getNazwaMiasta () {
        return nazwaMiasta;
    }

    public double getLiczbaMieszkancow () {
        return liczbaMieszkancow;
    }

    public double getPowierzchniaMiasta () {
        return powierzchniaMiasta;
    }

    public City (String nazwaMiasta, double liczbaMieszkancow, double powierzchniaMiasta) {
        this.nazwaMiasta = nazwaMiasta;
        this.liczbaMieszkancow = liczbaMieszkancow;
        this.powierzchniaMiasta = powierzchniaMiasta;


    }

    @Override
    public String toString () {
        return
                "nazwa miasta: '" + nazwaMiasta + '\'' +
                        ", liczba mieszkancow: " + liczbaMieszkancow +
                        ", powierzchnia miasta: " + powierzchniaMiasta + "km kwadrat";

    }
}

class Country {
    private String country;
    private double population;
    private String nationalLanguage;

    public Country (String country) {
        this.country = country;
    }

    public Country (String country, double population, String nationalLanguage) {
        this.country = country;
        this.population = population;
        this.nationalLanguage = nationalLanguage;
    }

    @Override
    public String toString () {
        return "Country{" +
                "country='" + country + '\'' +
                ", population=" + population +
                ", nationalLanguage='" + nationalLanguage + '\'' +
                '}';
    }

    public String getCountry () {
        return country;
    }

    public double getPopulation () {
        return population;
    }

    public String getNationalLanguage () {
        return nationalLanguage;
    }
}