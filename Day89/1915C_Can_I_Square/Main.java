import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();
        while (t-- > 0) {
            int n = read.nextInt();
            long sum = 0;
            for (int i = 0; i < n; i++) {
                sum += read.nextInt();
            }
            long root = (long) Math.sqrt(sum);
            if (root * root == sum) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
