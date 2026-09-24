import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();
        while (t-- > 0) {
            int n = read.nextInt();
            int x = read.nextInt();
            int prev = 0;
            int ans = 0;
            for (int i = 0; i < n; i++) {
                int a = read.nextInt();
                ans = Math.max(ans, a - prev);
                prev = a;
            }
            ans = Math.max(ans, 2 * (x - prev));
            System.out.println(ans);
        }
    }
}