import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();
        while(t-->0){
            int a = read.nextInt();
            int b = read.nextInt();
            int n = read.nextInt();
            int count = 0;
            while(a<=n && b<=n){
                if(a<b)
                    a+=b;
                else
                    b+=a;
                count++;
            }
            System.out.println(count);
        }
    }
}