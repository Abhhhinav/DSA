package Bit_Manipulation;
public class setbits {
    public static int sb(int number){
        int c = 0;
        while(number>0){
          if ((number & 1)!=0 ){
           c++;
          }
          number = number>>1;
        }
        return c;
    }
    public static void main(String args[]){
        System.out.println(sb(32));
    }
}
