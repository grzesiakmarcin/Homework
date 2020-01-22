package hashCodeEquals;

public class HashCodeEquals {
    public static void main(String[] args) {

        Dog dog1 = new Dog("Reksio",2);
        Dog dog2 = new Dog ("Ares",3);
        Dog dog3 = dog2;
        Dog dog4 = new Dog ("Reksio",2);

        if(dog1==dog4){
            System.out.println("obiekty są identyczne");
        }
        else {
            System.out.println("obiekty są różne");
        }


    }
}

class Dog{
    String name;
    int age;

    public Dog(String name, int age){
        this.name=name;
        this.age=age;
    }

}
