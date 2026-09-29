import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();
        while(t-->0){
            int a = read.nextInt();
            int b = read.nextInt();
            int count = 0;
            int diff = Math.abs(a - b);
            System.out.println((diff + 9) / 10);
        }
    }
}