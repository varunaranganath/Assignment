package Com.revature.Assignment08;

public class Customer {
     final int customerId;

    private String name;
    private String email;
    static int age;
    public Customer(){
        this.customerId=123;
    }
    public Customer(int id, String name, String email) {
        this.customerId = id;
        this.name = name;
        this.email = email;

    }
    public void displayInfo() {
        System.out.println("Customer ID: " + customerId);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
    }
    public void show(String name){
        System.out.println("Name: " + name);

    }
}

