import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        if (n % 5 == 0) {
            System.out.println(n / 5);
        } else {
            System.out.println(n / 5 + 1);
        }
    }
}