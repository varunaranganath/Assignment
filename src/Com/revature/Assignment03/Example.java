package Com.revature.Assignment03;

public class Example {
    int a=10;
    int b=1;
    int c=29;
    int n=10;
    public void ab(){
        if(a>b){
            System.out.println("Greater");

        }
        else{
            System.out.println("Lesser");
        }
    }
    public void abc(){
        if(a>b){
            System.out.println("Greater is a");
        }
        else if(b>c){
            System.out.println("Greater is b");
        }
        else{
            System.out.println("Greater is c");
        }
        }
    public void abcd(){
        for(int i=0;i<n;i++){
            int sum=0;
            sum+=sum+i;
            System.out.print(sum);


        }

    }


    public static void main(String[] args) {
Example e=new Example();
e.ab();
e.abc();
e.abcd();


    }
}
