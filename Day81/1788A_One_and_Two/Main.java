import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();
        while (t-- > 0) {
            int n = read.nextInt();
            int[] a = new int[n];
            int total = 0;
            for (int i = 0; i < n; i++) {
                a[i] = read.nextInt();
                if (a[i] == 2)
                    total++;
            }
            if (total % 2 != 0) {
                System.out.println(-1);
                continue;
            }
            if (total == 0) {
                System.out.println(1);
                continue;
            }
            int count = 0;
            for (int i = 0; i < n; i++) {
                if (a[i] == 2)
                    count++;
                if (count == total / 2) {
                    System.out.println(i + 1);
                    break;
                }
            }
        }
    }
}