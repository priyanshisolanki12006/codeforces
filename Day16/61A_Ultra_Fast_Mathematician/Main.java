import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        String a = read.next();
        String b = read.next();
        for (int i = 0; i < a.length(); i++) {
            int x = a.charAt(i) - '0';
            int y = b.charAt(i) - '0';
            System.out.print(x ^ y);
        }
    }
}