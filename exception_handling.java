import java.io.IOException;

public class exception_handling {
    public static void main(String[] args) {
        int a=2,b=0;
        try{
            System.out.println(a/b);
        }
        catch(ArithmeticException e){
            System.out.println("hello");
        }
        catch (IllegalArgumentException e){
            System.out.println("hehe");
        }

    }
}
