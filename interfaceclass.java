interface car1{
    void start();
    void stop();
}
interface bike{
    void start();
    void stop();
    int x=12;
}
class bicycle implements car1 , bike{
    @Override
    public void start() {
        System.out.println("startred");
    }

    @Override
    public void stop() {
        System.out.println("stoprd");
    }
}
public class interfaceclass {
    public static void main(String[] args) {
    bicycle obj =new bicycle();
    obj.start();
    obj.stop();
    }
}
