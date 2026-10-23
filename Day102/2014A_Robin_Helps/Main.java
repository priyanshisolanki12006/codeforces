import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();
        while (t-- > 0) {
            int n = read.nextInt();
            int k = read.nextInt();
            int gold = 0;
            int count = 0;
            for (int i = 0; i < n; i++) {
                int x = read.nextInt();
                if (x >= k && x > 0) {
                    gold += x;
                } else if (x == 0 && gold > 0) {
                    count++;
                    gold--;
                }
            }
            System.out.println(count);
        }
    }
}
