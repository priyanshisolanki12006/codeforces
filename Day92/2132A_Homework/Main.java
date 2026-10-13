import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();
        while(t-->0){
            int n = read.nextInt();
            String a = read.next();
            int m = read.nextInt();
            String b = read.next();
            String c = read.next();
            StringBuilder ans = new StringBuilder(a);
            for(int i=0 ; i<m ; i++){
                if(c.charAt(i) == 'V'){
                    ans.insert(0,b.charAt(i));
                }
                else{
                    ans.append(b.charAt(i));
                }
            }
        System.out.println(ans);    
        }
    }
}