package Polimorphism;

import java.sql.SQLOutput;

public class Fir extends Plant{
   private String name="Jodła";

    @Override
    public void grow() {
        super.grow();
    }

    @Override
    public void fotosynteza() {
       reduceCO2();
        System.out.println("ale tak tylko w 50%");
        System.out.println("// być może lepszy byłby tutaj interface. -->> do rozkminy <<-- ");
           }

    @Override
    public void autumnOn() {
        System.out.println("Bitch please, jestem "+name+", nie gubie kurwa niczego. Nawet gdy uschnę.\n");
    }
}
