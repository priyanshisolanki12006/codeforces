import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();
        while (t-- > 0) {
            String s = read.next();
            int a = 0;
            int b = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 'A') {
                    a++;
                } else {
                    b++;
                }
            }
            if (a > b) {
                System.out.println("A");
            } else {
                System.out.println("B");
            }
        }
    }
}
