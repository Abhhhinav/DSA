package Bit_Manipulation;

public class UPtoLower {
    public static void main(String args[]){
        for(char ch = 'A';ch<='Z';ch++){
            System.out.println((char)(ch | ' '));
        }
    }
}
