class car{
    int model_no;
    String model_name;
    private String password;
    public void setPassword(String a){
        this.password=a;
    }
    public String getPassword(){
        return this.password;
    }
    public void print(){
        System.out.println(model_name+model_no);
    }

}
public class oops {
    public static void main(String[] args) {

        car rr =new car();
        rr.model_no=111222321;
        rr.model_name="swift";
        rr.print();
        rr.setPassword("BKM");
        System.out.println(rr.getPassword());

//        rr.password="dssd";


    }

}
