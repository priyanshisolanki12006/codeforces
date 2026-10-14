import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();
        while (t-- > 0) {
            String s = read.next();
            if (s.startsWith("10") && s.length() > 2
                    && s.charAt(2) != '0'
                    && Integer.parseInt(s.substring(2)) >= 2) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}