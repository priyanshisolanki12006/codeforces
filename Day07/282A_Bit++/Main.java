import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        int x = 0;
        while(n-- > 0){
            String s = read.next();
            if(s.charAt(1) == '+'){
                x++;
            }
            else{
                x--;
            }
        }
        System.out.println(x);
    }
}