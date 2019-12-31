package inheritance;

public class Machine {

    private  String engineType = "Diesel";
    private  String engineType2 = "Petrol";

    public void start(String jakiObiekt){

        System.out.println("Przekrecamy kluczyc w stacyjce");
        System.out.println("wypisane z obiektu: " +jakiObiekt+"\n");
    }

    public void stop(String jakiObiekt){
        System.out.println("Wgasimy silnik");
        System.out.println("wypisane z obiektu: " +jakiObiekt+"\n");
    }


    public String getEngineType() {
        return engineType;
    }

    public String getEngineType2() {
        return engineType2;
    }
}
