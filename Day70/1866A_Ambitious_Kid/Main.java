import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int x = read.nextInt();
            if (Math.abs(x) < min) {
                min = Math.abs(x);
            }
        }
        System.out.println(min);
    }
}