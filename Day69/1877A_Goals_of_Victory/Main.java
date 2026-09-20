import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();
        while(t-- > 0) {
            int n = read.nextInt();
            int sum = 0;
            for(int i = 0; i < n - 1; i++) {
                int x = read.nextInt();
                sum += x;
            }
            System.out.println(-sum);
        }
    }
}