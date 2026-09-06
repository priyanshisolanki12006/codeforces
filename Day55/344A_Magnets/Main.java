import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();
        String a = read.next();
        int count = 1;
        for(int i=1 ; i<t ; i++){
            String b = read.next();
            if(!b.equals(a)){
                count++;
            }
            a = b;
        }
        System.out.println(count);
    }
}