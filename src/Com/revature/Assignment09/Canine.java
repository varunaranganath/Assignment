package Com.revature.Assignment09;

public abstract class Canine implements Animal {
    @Override
    public void move() {
        System.out.println("Dog will run");
    }

    @Override
    public void drink() {
        System.out.println("dog drinks milk");
    }
}
