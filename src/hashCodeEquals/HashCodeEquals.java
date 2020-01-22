package hashCodeEquals;

public class HashCodeEquals {


    public static void main(String[] args) {
        @Override
        public boolean equals(Object obj) {
            if(this == obj){
                return true;
            }
            if (obj == null){
                return false;
            }
            if (obj instanceof Dog){
                return true;
            }
            return true;

        }

        String napisSroda1 = "jest sroda";
        String napisSroda2 = "jest sroda";

        if(napisSroda1==napisSroda2){
            System.out.println("środy sa identyczne ==");
        }

        if (napisSroda1.equals(napisSroda2)){
            System.out.println("srody sa equals");
        }


        int pierwszaLiczba = 12;
        int drugaLiczba=12;


        if (pierwszaLiczba==drugaLiczba){
            System.out.println("napisy są ==");
        }

        // equalsa nie zrobisz bo jest to funkcja dziedziczaca po klasie obiect;)


        Dog dog1 = new Dog("Reksio",2);
        Dog dog2 = new Dog ("Reksio",2);

        if(dog1==dog2){                                           // obiekty są identyczne w sensie że są pod tym samym odsesem w pamieci
            System.out.println("obiekty są identyczne");
        }

        if(dog1.equals(dog2)){
            System.out.println("Equals  - obiekty są identyczne");
        }
        else{
            System.out.println("moj equals robi robote");
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
