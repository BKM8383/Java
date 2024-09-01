import java.util.Random;
import java.util.Scanner;
class guess{
    int num;
    public guess(){
        Random rand=new Random();
        this.num=rand.nextInt(101);
    }
    public void process(){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter your guess = ");
        int count=1;
        int guess=scan.nextInt();
        while (guess!=num){
            if (guess<num)System.out.println("Less than random number");
            else System.out.println("Greater than random number");
            System.out.print("Re-enter your guess = ");
            count=count+1;
            guess=scan.nextInt();
        }
        System.out.println("Correct guess u took "+count+" attempts");}}
public class guessthenumber {
    public static void main(String[] args) {
    guess obj=new guess();
    obj.process();}}
