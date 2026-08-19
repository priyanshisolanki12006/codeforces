import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        boolean[] levels = new boolean[n + 1];
        int p = read.nextInt();
        for (int i = 0; i < p; i++) {
            int x = read.nextInt();
            levels[x] = true;
        }
        int q = read.nextInt();
        for (int i = 0; i < q; i++) {
            int y = read.nextInt();
            levels[y] = true;
        }
        for (int i = 1; i <= n; i++) {
            if (!levels[i]) {
                System.out.println("Oh, my keyboard!");
                return;
            }
        }
        System.out.println("I become the guy.");
    }
}