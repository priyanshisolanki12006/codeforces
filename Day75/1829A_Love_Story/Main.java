import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        while(n-->0){
            String s = read.next();
            String target = "codeforces";
            int count=0;
            for(int i=0 ; i<10; i++){
                if(s.charAt(i) != target.charAt(i))
                    count++;
            }
            System.out.println(count);
        }
    }
}