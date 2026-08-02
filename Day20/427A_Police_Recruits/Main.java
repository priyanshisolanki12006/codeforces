import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        int police = 0;
        int crime = 0;
        for(int i=1 ; i<=n ; i++){
            int a = read.nextInt();
            if(a == -1){
                if(police > 0)
                    police--;
                else
                    crime++;
            }
            else{
                police += a;
            }
        }
        System.out.println(crime);
    }
}