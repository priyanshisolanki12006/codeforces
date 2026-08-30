import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();
        while (t-- > 0) {
            int x = read.nextInt();
            int digit = x % 10;
            int n = String.valueOf(x).length();
            int ans = (digit - 1) * 10;
            for (int i = 1; i <= n; i++) {
                ans += i;
            }
            System.out.println(ans);
        }
    }
}