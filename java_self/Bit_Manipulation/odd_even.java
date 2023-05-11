package Bit_Manipulation;

public class odd_even {
    public static void oddeven(int number){
         int bitMask = 1;
         if((number & bitMask) == 0){
            System.out.println("even");
         }
         else{
            System.out.println("odd");
         }
    }
    public static void main(String args[]){
         oddeven(10);
         oddeven(5);

    }
}
