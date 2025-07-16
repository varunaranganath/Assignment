package Com.revature.Assignment09;

public  abstract class Feline  implements Animal{
    public void drink(){
        System.out.println("cat drink milk ");

    }

    @Override
    public void move() {
        System.out.println("cat jumps");
    }
}
