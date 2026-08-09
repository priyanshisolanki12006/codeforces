import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        while(n-->0){
            int a = read.nextInt();
            int b = read.nextInt();
            int c = read.nextInt();
            int d = read.nextInt();
            int count = 0;
            if(b>a)
                count++;
            if(c>a)
                count++;
            if(d>a)
                count++;
            System.out.println(count);
        }
    }
}