import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();
        while (t-- > 0) {
            int a = read.nextInt();
            int b = read.nextInt();
            int c = read.nextInt();
            int d = read.nextInt();
            int[] x = {a, b, c, d};
            Arrays.sort(x);
            int w1 = Math.max(a, b);
            int w2 = Math.max(c, d);
            if ((w1 == x[2] && w2 == x[3]) ||
                (w1 == x[3] && w2 == x[2])) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}