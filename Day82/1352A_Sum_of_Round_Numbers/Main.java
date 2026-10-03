import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();
        while (t-- > 0) {
            int n = read.nextInt();
            int temp = n;
            int count = 0;
            int place = 1;
            ArrayList<Integer> ans = new ArrayList<>();
            while (temp > 0) {
                int digit = temp % 10;
                if (digit != 0) {
                    ans.add(digit * place);
                    count++;
                }
                temp = temp / 10;
                place = place * 10;
            }
            System.out.println(count);
            for (int x : ans) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}