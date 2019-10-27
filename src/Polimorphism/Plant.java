package Polimorphism;

public class Plant {

   protected String name= "jakas tam roslina";

    public void grow(){
        System.out.println("metoda grow w Plant");

    }

    public void fotosynteza(){
        reduceCO2();
    }

    protected void reduceCO2(){
        System.out.println("Redukcja CO2");
        System.out.println("Produkcja O2 \n");
    }

    public void autumnOn(){
        System.out.println(name+": Tracę kurwa liście...\n");
    }


    public void someMethod(){
        System.out.println("Doing nothing :D");
    }
}
