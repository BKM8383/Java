//import java.util.HashMap;
//import java.util.Map;
//import java.util.Random;
//
//public class rock_paper_scissor {
//    public static void main(String[] args) {
//        String x="dfsgdsf";
//        String a = String.valueOf(x);
////        String b = a.
//
//
//    }
//}
//
//class Solution{
//    public int maximumLength(String s){
//        Map<string,Integer> map=new HashMap<>();
//        int n=s.length();
//        for (int i=0;i<n;i++){
//            for (int j=i+1;j<=n;j++){
//                String str=s.substring(i,j);
//                boolean flag=true;
//                for (int l=0;l<str.length()-1;l++){
//                    if (str.charAt(l)!=str.charAt(l+1)){
//                        flag=false;
//                        break;
//                    }
//                }
//                if (flag==true){
//                    if (map.containsKey(str)){
//                        map.put(str,map.get(str)+1);
//                    }
//                    else{
//                        map.put(str,1);
//                    }
//                }
//            }
//        }
//        int max=-1;
//        for (Mao.Entry<String,Integer>e : map.entrySet()){
//            if (e.getValue()>=3){
//                max=Math.max(max,e.getKey(),length());
//            }
//        }
//        return (int)max;
//    }
//}
