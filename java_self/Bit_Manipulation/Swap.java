package Bit_Manipulation;

public class Swap {
    public static void main(String args[]){
        int x = 3 ;
        int y = 4;
        System.out.println("before Swapping: x= "+x + "and y= " +y);
        x = x^y;
        y = x^y;
        x = x^y;
        System.out.println("After Swapping: x= "+x + "and y= " +y);
    }
}
