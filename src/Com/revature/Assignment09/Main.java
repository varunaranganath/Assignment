package Com.revature.Assignment09;
// Main.java
public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();

        Dog dog = new Dog();


        // Call Cat methods
        System.out.println("=== Cat ===");
        cat.sound();
        cat.drink();
        cat.move();


        // Call Dog methods
        System.out.println("\n=== Dog ===");
        dog.sound();
        dog.drink();
        dog.move();


    }
}