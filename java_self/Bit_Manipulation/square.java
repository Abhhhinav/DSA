package Bit_Manipulation;

public class square {
     public static int basic(int n){
         if(n<0)
         n=-n;
         int result = n;
         for(int i=1;i<n;i++){
            result = result + n;
         }
         return result;
     }
     public static void main(String args[]){
       int n =-2;
       System.out.println(basic(n));
     }
}
