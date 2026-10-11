import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();
        while(t-->0){
            int n = read.nextInt();
            int x = read.nextInt();
            if(n<=2)
                System.out.println(1);
            else
                System.out.println((n-3)/x+2);
        }
    }
}