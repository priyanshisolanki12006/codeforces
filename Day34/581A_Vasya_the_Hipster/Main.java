import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int a = read.nextInt();
        int b = read.nextInt();
        int different = Math.min(a, b);
        int remaining = Math.max(a, b) - different;
        int same = remaining / 2;
        System.out.println(different + " " + same);
    }
}