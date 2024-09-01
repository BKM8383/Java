import java.util.Scanner;

class exception extends Exception{

}


public class calculator {
    public static void main(String[] args) {
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Divide");
        System.out.print("Which operation you want to perform = ");
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        if (x==1){
            int a=scan.nextInt();
            int b=scan.nextInt();
            
        }
    }
}

