import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();
        while(t-- > 0){
            int a = read.nextInt();
            int b = read.nextInt();
            if(a%b == 0)
                System.out.println(0);
            else
                System.out.println(b-(a%b));
        }
    }
}
