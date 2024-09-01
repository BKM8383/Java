import java.util.Scanner;
public class marks_to_percentage {
    public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
        System.out.print("Enter marks in 1st subject : ");
        int a= scan.nextInt();
        System.out.print("Enter marks in 2st subject : ");
        int b= scan.nextInt();
        System.out.print("Enter marks in 3st subject : ");
        int c= scan.nextInt();
        System.out.print("Enter marks in 4st subject : ");
        int d= scan.nextInt();
        System.out.print("Enter marks in 5st subject : ");
        int e= scan.nextInt();
        float per = (a+b+c+d+e)/5.0f;
        System.out.print("percentage : ");
        System.out.println(per);

    }
}
