import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        long n = read.nextLong();
        if(n % 2 == 0) {
            System.out.println(n / 2);
        } else {
            System.out.println(-(n + 1) / 2);
        }
    }
}
