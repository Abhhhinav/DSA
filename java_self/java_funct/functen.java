// import java.util.*;
// public class functen{
//     public static int avg(int a,int b,int c){
//         int avg=(a+b+c)/3;
//         return avg;
//     }
//     public static void main(String[]args) {
       
//         try (Scanner sc = new Scanner (System.in)) {

//         System.out.println("Enter three numbers");
//          int a = sc.nextInt();
//          int b = sc.nextInt();
//          int c = sc.nextInt();
//          int avgggg= avg(a,b,c);
//          System.out.println("average of three nos are"+avgggg);
//       }
//    }
// }

// GREATEST of 2
// import java.util.*;
 
// public class functen {
//    public static int getGreater(int a, int b) {
//       if(a > b) {
//           return a;
//       } else {
//           return b;
//       }
//    }
//    public static void main(String args[]) {
//       try(Scanner sc = new Scanner(System.in)){

      
//       int a = sc.nextInt();
//       int b = sc.nextInt();
//       System.out.println(getGreater(a, b));
//    }   
//  }
// }

import java.util.*;
 
public class functen{
   public static void main(String args[]) {
       try(Scanner sc = new Scanner(System.in)){
       int n = sc.nextInt();
      
       int a = 0, b = 1;
          
       System.out.print(a+" ");
      
       if(n > 1) {
           //find nth term
           for(int i=2; i<=n; i++) {
               System.out.print(b+" ");
               //the concept below is called swapping
               int temp = b;
               b = a + b;
               a = temp;
           }
 
           System.out.println();
       }
   }   
}
 
}