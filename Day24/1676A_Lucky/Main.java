import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        while(n-- > 0){
            String s = read.next();
            int sum1 = 0;
            int sum2 = 0;
            for(int i=0 ; i<3 ; i++){
                sum1+=s.charAt(i)-'0';
                sum2+=s.charAt(i+3)-'0';
            }
            if(sum1 == sum2){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}