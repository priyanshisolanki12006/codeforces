import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();
        while(t-->0){
            int a = read.nextInt();
            int b = read.nextInt();
            int c = read.nextInt();
            int n = read.nextInt();
            int max = Math.max(a, Math.max(b, c));
            n = n - (max - a);
            n = n - (max - b);
            n = n - (max - c);
            if (n >= 0 && n % 3 == 0)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}