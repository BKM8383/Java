//import java.util.Arrays;
//abstract class pen{
//    abstract void write(String str);
//    abstract void  refill();
//}
//class fountpen extends pen{
//    void write(String str){
//        System.out.println(str);
//    }
//    void  refill(){
//        System.out.println("refilling...");
//    }
//    void changenib(){
//        System.out.println("changing nib....");
//    }
//}

//class monkey {
//    void jump(){
//        System.out.println("jumping...");
//    }
//    void biting(){
//        System.out.println("biting....");
//    }
//}
//class human extends monkey{
//    void eat(){
//        System.out.println("eating...");
//    }
//    void sleep(){
//        System.out.println("sleeping...");
//    }
//}
abstract class phone {
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}
class telephone extends phone{
    void ring() {
        System.out.println("ting .... tring.....");
    }
    void disconnect() {
        System.out.println("disconnected");
    }
    void lift() {
        System.out.println("call raised...");
    }
}

public class proj {
    public static void main(String[] args){
//    fountpen parker = new fountpen();
//    parker.changenib();
//    parker.write("helllo world!!!!");
//    parker.refill();
    }
}