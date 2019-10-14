package Server;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
    public static void main(String[] args) {
        Socket serverSocket = new Socket();


        System.out.println("Witaj w echo, server rozpoczyna zasłuchiwanie");

        try {
            serverSocket.bind(new InetSocketAddress("localhost",8080));











        } catch (IOException e) {
            System.out.println("Wyjątek zajętego portu");
            e.printStackTrace();
        }










    }
}
