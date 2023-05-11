public class Linear {
    public static int func(int a[], int key) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int a[] = { 2, 4, 6, 8, 10 };
        int key = 90;
        int Store = func(a, key);
        if (Store == -1) {
            System.out.println("Not found");
        } else {
            System.out.println("Found at position" + Store);
        }

    }
}
