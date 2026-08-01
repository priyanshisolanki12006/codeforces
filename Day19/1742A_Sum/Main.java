import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        for(int i=1 ; i<=n ; i++){
            int a = read.nextInt();
            int b = read.nextInt();
            int c = read.nextInt();
            if(a+b==c || b+c==a || c+a==b){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}