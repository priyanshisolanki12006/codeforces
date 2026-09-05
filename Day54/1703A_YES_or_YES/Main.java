import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();
        while(t-->0){
            String s = read.next();
            String a = s.toUpperCase();
            if(a.equals("YES")){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}