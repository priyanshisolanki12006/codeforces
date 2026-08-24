import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        int m = read.nextInt();
        int next = n + 1;
        while (!isPrime(next)) {
            next++;
        }
        if (next == m)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
    static boolean isPrime(int x) {
        if (x < 2)
            return false;
        for (int i = 2; i * i <= x; i++) {
            if (x % i == 0)
                return false;
        }
        return true;
    }
}