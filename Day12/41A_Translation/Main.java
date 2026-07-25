import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String s = sc.nextLine();
        String t = sc.nextLine();
        int n = s.length();
        if(n == t.length()){
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == t.charAt(n-i-1))
                continue;
            else{
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
        }
        else
            System.out.println("NO");
    }
}