package Com.revature.Assignment10;

public class Recursion {

    public static int  addition(int n){
        if(n==1){
            return 1;
        }
        return n+addition(n-1);
    }
    public static void main(String[] args) {
        int n=30;
        int result=addition(n);
        System.out.println("result:"+result);

    }
}
