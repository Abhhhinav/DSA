package Strings;
class Solutions {
    public static int maxPower(String s) {
        int count = 0;
        int maxCount = 0;
        char previous = ' ';
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == previous) {
                count++;
            } else {
                count = 1;
                previous = c;
            }
            maxCount = Math.max(maxCount, count);
        }
        return maxCount;
    }
    public static void main(String args[]){
        String s ="leetcode";
        System.out.println(maxPower(s));
    }
}