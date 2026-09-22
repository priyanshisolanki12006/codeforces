import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();
        while (t-- > 0) {
            int n = read.nextInt();
            String s = read.next();
            HashSet<Character> set = new HashSet<>();
            boolean ok = true;
            for (int i = 0; i < n; i++) {
                if (i > 0 && s.charAt(i) != s.charAt(i - 1)) {
                    if (set.contains(s.charAt(i)))
                        ok = false;
                    set.add(s.charAt(i - 1));
                }
            }
            System.out.println(ok ? "YES" : "NO");
        }
    }
}