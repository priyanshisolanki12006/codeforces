import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();
        while (t-- > 0) {
            int n = read.nextInt();
            int odd = 0;
            int even = 0;
            for (int i = 0; i < n; i++) {
                int x = read.nextInt();
                if (x % 2 != 0)
                    odd++;
                else
                    even++;
            }
            if (odd > 0 && even > 0)
                System.out.println("YES");
            else if (odd == n && n % 2 != 0)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}