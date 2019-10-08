package others;

public class setters {
    public static void main(String[] args) {


        Frog frog1 = new Frog();
        Dog dog1 = new Dog();


        frog1.name ="Zabcia";
        frog1.age=1;

        System.out.println(frog1.getName()+" "+frog1.age);


        dog1.setName("Diango");

        System.out.println(dog1.getName());


    }
}


class Frog{
    String name;
    int age;


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}


class Dog{
    String name;
    int age;

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    public int getAge() {
        return age;
    }
// wpisujać age Java identyfikują to z najblizszy age czyli ten w sygnaturze metody. Żeby wskazac nam zmienna zainicjowana w klasie musimy uzytc this.
    public void setAge(int age) {
        this.age = age;
    }
}