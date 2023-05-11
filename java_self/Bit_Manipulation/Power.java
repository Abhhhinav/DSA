package Bit_Manipulation;
public class Power {
        public static boolean po(int n){
            return (n & (n-1))==0;
        }
        public static void main(String args[]){
            System.out.println(po(5));
        }
    }
    
