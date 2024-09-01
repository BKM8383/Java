public class recursion {
    static void multi(int a,int i){
        if(i>10){
            return ;
        }
        System.out.println(a+" * "+ i+" = "+a*i);
        multi(a,i+1);
    }
    static void pattern(int a,int i){
        if (i>a){
            return;
        }
        for (int x=1;x<=i;x++){
            System.out.print("* ");
        }
        System.out.print("\n");
        pattern(a,i+1);
    }
    static int sum(int a,int i){
        if (i>a) return 0;
        int s=i+sum(a,i+1);
        return s;
    }
    public static void main(String[] args) {

        System.out.println(sum(1599,1));
    }
}
