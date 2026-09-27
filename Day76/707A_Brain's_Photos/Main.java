import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        int m = read.nextInt();
        boolean color = false;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                char x = read.next().charAt(0);
                if (x == 'C' || x == 'M' || x == 'Y') {
                    color = true;
                }
            }
        }
        if (color)
            System.out.println("#Color");
        else
            System.out.println("#Black&White");
    }
}