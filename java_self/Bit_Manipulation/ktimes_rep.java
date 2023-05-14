package Bit_Manipulation;
public class ktimes_rep {
    public static int singleNumber(int[] nums) {
        int ans = 0;
        for (int i = 0; i < 32; i++) {
            int codd = 0;
            int ceven = 0;
            for (int j = 0; j < nums.length; j++) {
                if (((1 << i) & nums[j]) != 0) {
                    codd++;
                } else {
                    ceven++;
                }
            }
            if (codd % 3 == 1) {
                ans = ans | (1 << i);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int nums[]={0,1,0,1,0,1,99};
        System.out.println(singleNumber(nums));
    }
}


