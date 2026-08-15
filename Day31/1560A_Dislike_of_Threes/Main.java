import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();
        while (t-- > 0) {
            int k = read.nextInt();
            int count = 0;
            int num = 1;
            while (count < k) {
                if (num % 3 != 0 && num % 10 != 3) {
                    count++;
                }
                if (count == k) {
                    System.out.println(num);
                    break;
                }
                num++;
            }
        }
    }
}