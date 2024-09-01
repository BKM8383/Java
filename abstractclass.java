abstract class base{
    static public void greet (){
        System.out.println("base class");
    }
}
class derived extends base{

    static public void greet() {
        System.out.println("derived class");
    }
}

public class abstractclass
{public static void main(String[] args) {
        derived obj =new derived();
        base.greet();
    }
}
