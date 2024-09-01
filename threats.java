//class t1 extends Thread {
//        public void run (){
//            int i=0;
//            while(i<20){
//                System.out.println("1st");
//                i++;
//            }
//        }
//        }
//class t2 extends Thread {
//    public void run(){
//        int i=0;
//        while(i<20){
//            System.out.println("2nd");
//            i++;
//        }
//    }
//}
class t1 implements Runnable{
    public void run(){
        int i=0;
        while(i<20){
            System.out.println("1st");
            i++;
        }
    }
}
class t2 implements Runnable {
    public void run(){
        int i=0;
        while(i<20){
            System.out.println("2nd");
            i++;
        }
    }
}
public class threats {
    public static void main(String[] args) {
    t1 t1 =new t1();
    Thread g1 =new Thread(t1);
    t2 t2=new t2();
    Thread g2 =new Thread(t2);

    g1.start();
    g2.start();
}}
