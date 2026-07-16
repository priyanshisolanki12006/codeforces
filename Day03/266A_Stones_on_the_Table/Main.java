import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        String s = read.next();
        int count = 0;
        for(int i=1; i<n ; i++){
            if(s.charAt(i) == s.charAt(i-1)){
                count++;
            }
        }
        System.out.println(count);
    }
}