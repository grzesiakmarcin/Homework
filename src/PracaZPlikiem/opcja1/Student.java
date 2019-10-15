package PracaZPlikiem.opcja1;

import java.io.Serializable;

public class Student implements  Serializable{
    private String name;
    private int age;
    private String uczelnia;
    private String kierunek;
    private String miasto;


    public Student (String name, int age, String uczelnia, String kierunek, String miasto)

    {
        this.name = name;
        this.age = age;
        this.uczelnia = uczelnia;
        this.kierunek = kierunek;
        this.miasto = miasto;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", uczelnia='" + uczelnia + '\'' +
                ", kierunek='" + kierunek + '\'' +
                ", miasto='" + miasto + '\'' +
                '}';
    }
}
