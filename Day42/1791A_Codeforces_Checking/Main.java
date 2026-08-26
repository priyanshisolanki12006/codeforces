import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        while(n-->0){
            char ch = read.next().charAt(0);
            if("codeforces".contains(String.valueOf(ch))){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}