import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();
        while(t-- > 0) {
            int n = read.nextInt();
            if(n % 3 == 0) {
                System.out.println("Second");
            } else {
                System.out.println("First");
            }
        }
    }
}