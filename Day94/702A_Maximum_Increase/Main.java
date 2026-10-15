import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        int prev = read.nextInt();
        int current = 1;
        int max = 1;
        for (int i = 1; i < n; i++) {
            int x = read.nextInt();
            if (x > prev) {
                current++;
            } else {
                current = 1;
            }
            if (current > max) {
                max = current;
            }
            prev = x;
        }
        System.out.println(max);
    }
}
