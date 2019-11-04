package PracaZPlikiem.opcja2;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Opcja2 {
    public static void main (String[] args) {
        String fileName = "Lista_8_tysiecznikow.txt";
        List<String> list = new ArrayList<>();


        try {
            Stream<String> stream = Files.lines(Paths.get(fileName));
            list = stream
                    .map(String::toUpperCase)
                    .collect(Collectors.toList());


        } catch (IOException e) {
            System.out.println("Pliku nie znaleziono");
            e.printStackTrace();
        }

        list.forEach(System.out::println);

    }
}
