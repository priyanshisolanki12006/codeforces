import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        String s1 = read.next();
        String s2 = read.next();
        String s3 = read.next();
        String s = s1+s2;
        char[] a = s.toCharArray();
        char[] b = s3.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        if(Arrays.equals(a,b)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}