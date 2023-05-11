public class Largest {
    public static int func(int num[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < num.length; i++) {
            if (largest < num[i]) {
                largest = num[i];
            }
        }
        return largest;
    }

    public static void main(String args[]) {
        int num[] = { 2, 4, 5, 7, 8 };
        int Store = func(num);
        System.out.println("the laregst is : " + Store);
    }
}
