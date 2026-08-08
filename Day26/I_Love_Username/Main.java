import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        int first = read.nextInt();
        int max = first;
        int min = first;
        int count = 0;
        for (int i = 1; i < n; i++) {
            int score = read.nextInt();
            if (score > max) {
                count++;
                max = score;
            }
            else if (score < min) {
                count++;
                min = score;
            }
        }
        System.out.println(count);
    }
}