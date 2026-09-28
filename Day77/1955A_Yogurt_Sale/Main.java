import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();
        while (t-- > 0) {
            int n = read.nextInt();
            int a = read.nextInt();
            int b = read.nextInt();
            int ans = (n / 2) * Math.min(2 * a, b);
            if (n % 2 != 0) {
                ans += a;
            }
            System.out.println(ans);
        }
    }
}