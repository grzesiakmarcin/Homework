package Generics;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {


        List<Machine> listaMachine = new ArrayList<Machine>();
            listaMachine.add(new Machine());
            listaMachine.add(new Machine());
            listaMachine.add(new Machine());
            listaMachine.add(new Machine());

        List<Camera> listaCamera = new ArrayList<Camera>();

        listaCamera.add(new Camera());
        listaCamera.add(new Camera());
        listaCamera.add(new Camera());
        listaCamera.add(new Camera());
        listaCamera.add(new Camera());


     showList((ArrayList<Machine>) listaMachine);



    }

    public static void showList(ArrayList<Machine> jakasLista){

        for(Machine wartosci: jakasLista){
            System.out.println(wartosci);
        }

    }
}
