import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();
        while(t-->0){
            String s = read.next();
            System.out.println((s.charAt(0) - '0') + (s.charAt(2) - '0'));
        }
    }
}