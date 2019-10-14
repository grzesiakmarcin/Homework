package Server;

import java.io.IOException;
import java.net.Socket;

public class EchoClient {
    public static void main(String[] args) {
        try {
            Socket socketClient = new Socket("local host", 8080);
            System.out.println("Witaj w EchoCient, aplikacja własnie rozpoczęła działanie");


        } catch (IOException e) {
            System.out.println("Wyjątek zajętego portu");
            e.printStackTrace();
        }















    }
}
