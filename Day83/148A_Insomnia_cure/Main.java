import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        int k = read.nextInt();
        int l = read.nextInt();
        int m = read.nextInt();
        int n = read.nextInt();
        int d = read.nextInt();
        int count = 0;
        for(int i=1 ; i<=d ; i++){
            if(i%k==0 || i%l==0 || i%m==0 || i%n==0)
                count++;
        }
        System.out.println(count);  
    }
}