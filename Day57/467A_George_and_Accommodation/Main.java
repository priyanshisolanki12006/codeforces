import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner read = new Scanner (System.in);
        int n = read.nextInt();
        int count = 0;
        while(n-->0){
            int p = read.nextInt();
            int q = read.nextInt();
            if(q-p>=2){
                count++;
            }
        }
        System.out.println(count);
    }
}