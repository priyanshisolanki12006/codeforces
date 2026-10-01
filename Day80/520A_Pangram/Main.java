import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        String s = read.next().toLowerCase();
        boolean[] arr = new boolean[26];
        for(int i=0 ; i<n ;i++){
            arr[s.charAt(i)-'a'] = true;
        }
        for(int i=0 ; i<26 ; i++){
            if(!arr[i]){
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}