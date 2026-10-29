import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int s = sc.nextInt();
            int root = (int) Math.sqrt(s);
            if (root * root == s) {
                System.out.println("0 " + root);
            } else {
                System.out.println("-1");
            }
        }
    }
}