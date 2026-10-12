import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();
        while(t-->0){
            int n = read.nextInt();
            int s = read.nextInt();
            int x = read.nextInt();
            int sum=0;
            for(int i=0 ; i<n ; i++){
                sum += read.nextInt();
            }
            if (sum <= s && (s - sum) % x == 0) 
                System.out.println("YES");
            
            else 
                System.out.println("NO");
            
        }
    }
}