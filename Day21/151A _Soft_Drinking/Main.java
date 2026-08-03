import static java.lang.Math.min;
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        int k = read.nextInt();
        int l = read.nextInt();
        int c = read.nextInt();
        int d = read.nextInt();
        int p = read.nextInt();
        int nl = read.nextInt();
        int np = read.nextInt();
        int min = min(min((k*l)/nl, c*d), p/np);
        System.out.println(min/n);
    }
}