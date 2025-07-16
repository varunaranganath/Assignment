package Com.revature.Assignment01;

public class Calculator {
    int x=10;
    int y=10;
    public int  add(){
        return x+y;

    }
    public int sub(){
        return x-y;
    }
    public int mul(){
        return x*y;
    }
    public int div(){
        return x/y;
    }
    public static void main(String[] args) {
        Calculator c=new Calculator();
        System.out.println(c.add());
        System.out.println(c.div());
        System.out.println(c.mul());
        System.out.println(c.sub());
    }

}
