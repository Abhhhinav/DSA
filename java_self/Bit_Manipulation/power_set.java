package Bit_Manipulation;
import java.util.*;
public class power_set {
    static ArrayList<String> AllPossibleStrings(String s){
         int n = s.length();
         ArrayList<String>ans = new ArrayList<>();
         for(int num = 0 ; num<(1<<n); num++){
           String sub = "";
           for(int i=0;i<n;i++){
             if((num & (1<<i))!=0){
                sub = sub+s.charAt(i);
               }
             }
             if(sub.length()>0){
                ans.add(sub);
           }
         }
         Collections.sort(ans);
         return ans;
    }
    public static void main(String args[]){
        String s="abc";
	    ArrayList<String>ans = AllPossibleStrings(s);
	       System.out.println("All possible subsequences are ");
	    for (String it : ans) {
		   System.out.print( it+" ");
    }}}

