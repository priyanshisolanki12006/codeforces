import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();
        while (t-- > 0) {
            int n = read.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = read.nextInt();
            }
            if (!isSorted(a)) {
                System.out.println(0);
            } else {
                int min = Integer.MAX_VALUE;
                for (int i = 0; i < n - 1; i++) {
                    min = Math.min(min, a[i + 1] - a[i]);
                }
                System.out.println(min / 2 + 1);
            }
        }
    }
    public static boolean isSorted(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
