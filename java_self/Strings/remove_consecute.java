package Strings;
public class remove_consecute{
   public static String Remove(String str){
    int n = str.length();
    String res = "";
    for(int i=0;i<n;i++) {
        if(i<n-1  && str.charAt(i)==str.charAt(i+1)){
            continue;
        }
        else{
            res = res + str.charAt(i);
        }
    }
    return res;
    }
    public static void main(String args[]){
        String str = "aabb";
        System.out.println(Remove(str));
    }
}