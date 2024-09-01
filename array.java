import java.util.Scanner;

public class array {
    public static void main(String[] args) {
//        int []marks=new int[5];
//        marks[0]=100;
//        marks[1]=10;
//        marks[2]=120;
//        marks[3]=150;
//         marks[4]=1200;
//        System.out.println(marks[0-3]);
//        for (int i=0;i<5;i++){
//            System.out.println(marks[i]);
//        }
//        for (int i:marks){
//            System.out.println(i);
//        }
//        int []arr={1,2,3,4,5,6};
//        Scanner scan=new Scanner(System.in);
//        System.out.print("Enter the number to find = " );
//        int a=scan.nextInt();
//        int b;
//        for (int i:arr) {
//            if (i == a)
//                System.out.println("yes");
//            else
//                System.out.println("nope");
//        int [][]a={{2,1},{5,4},{6,4}};
//        int [][]b={{21,12},{55,47},{96,43}};
//        int [][]c=new int[3][2];
//        for (int i=0;i<3;i++){
//            for (int j=0;j<2;j++){
//                c[i][j]=a[i][j]+b[i][j];
//            }
//        }
//        for (int i=0;i<3;i++){
//            for (int j=0;j<2;j++){
//                System.out.println(c[i][j]);
//            }
//        }
    Scanner scan=new Scanner(System.in);
    int []b=new int[5];
    int n=0,x=0;
    for (int i=0;i<5;i++){
        System.out.print("Enter the "+i+" element = ");
        b[i]= scan.nextInt();
    }


    while (n<4){
    if (b[n]>b[n+1]){
        for(int i=0;i<4;i++){
            if (b[i]<b[i+1]){
                x=1;
                break;}}break;

    } else if (b[n]<b[n+1]) {
        for(int i=0;i<4;i++){
            if (b[i]>b[i+1]){
                x=1;
                break;}}break;}
    else{
        n=n+1;}}

    if (x==1){
            System.out.println("Not sorted");}
    else {
            System.out.println("sorted");
        }
    }
}
