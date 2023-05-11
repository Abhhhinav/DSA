package Strings;
public class Compression {
   public static String Compress(String str){
       String newstr = "";
        for(int i=0;i<str.length();){
            Integer count = 1;
            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            } 
            newstr = newstr + str.charAt(i);
            if(count>1){
                newstr = newstr + count.toString();
            }
        }
        return newstr;
    }
   public static void main(String args[]){
   String  str = "aaaaabbbbc";
   System.out.println(Compress(str));
   } 
}
  