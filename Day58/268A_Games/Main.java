import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        int[] h = new int[n];
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            h[i] = read.nextInt();
            a[i] = read.nextInt();
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j && h[i] == a[j]) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}