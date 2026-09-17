import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();
        while(t-- > 0) {
            int h = read.nextInt();
            int m = read.nextInt();
            int ans = 1440 - (h * 60 + m);
            System.out.println(ans);
        }
    }
}