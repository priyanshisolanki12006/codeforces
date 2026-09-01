import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();
        while(t-->0){
            int n = read.nextInt();
            int sum=0;
            while(n>0){
                int digit=n%10;
                sum=sum+digit;
                n=n/10;
            }
            System.out.println(sum);
        }
    }
}