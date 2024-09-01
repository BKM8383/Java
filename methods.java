//import java.lang.String;
public class methods {
    static int  function(int a){
        int x=1;
        for (int i=a;i>1;i--){
            x=x*i;
        }
        return x;
    }
    static int function(int x,int ...arr){
        for (int i:arr    ) {
            x=x+i;
        }
        return x;
    }
    public static void main(String[] args) {
//        String a="hallo pwolwww asdf";
//        char []x=a.toCharArray();
//        for (char i:x ){
//            System.out.println(i);
//        }
      System.out.println(function(5,2,4,5,6,7,3));

//        methods obj=new methods();        callling using object
//        int x=obj.function(5);
//        System.out.println(x);

    }
}
