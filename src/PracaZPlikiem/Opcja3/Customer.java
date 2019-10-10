package PracaZPlikiem.Opcja3;

public class Customer {
    private String name;
    private String surname;
    private int age;


    public Customer(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Customer() {

    }

    public  Customer[] getCustomer(){
        Customer [] customers = new Customer[3];
        customers[0] = new Customer("Łukasz","Bacik",18);
        customers[1] = new Customer("Marta","Bacik",88);
        customers[2] = new Customer("Marcelina","Bacik",22);

        return customers;

    }

    public void printCustomers () {


    }

//http://www.newthinktank.com/2012/04/java-video-tutorial-32/

}
