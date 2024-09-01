class a{
     int x ;
    String y;
     char z;
    a(int a,String b,char c){
        this.x=a;
        this.y=b;
        this.z=c;
    }
}
public class constructir {
    public static void main(String[] args) {
        a bkm = new a(12,"sdf",'a');
        System.out.println(bkm.x+bkm.y+bkm.z);

    }
}
