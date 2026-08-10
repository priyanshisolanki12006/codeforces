import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        int a = read.nextInt();
        int b = read.nextInt();
        int c = read.nextInt();
        int d = read.nextInt();
        String s = read.next();
        int count=0;
        for(int i=0 ; i<s.length() ; i++){
            if(s.charAt(i)=='1')
                count+=a;
            else if(s.charAt(i)=='2')
                count+=b;
            else if(s.charAt(i)=='3')
                count+=c;
            else if(s.charAt(i)=='4')
                count+=d;
        }
        System.out.println(count);
    }
}
