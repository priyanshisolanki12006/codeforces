import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();
        while(t-->0){
            int n = read.nextInt();
            int count = 0;
            int[] a = new int[n];
            for(int i=0 ; i<n ; i++){
                a[i] = read.nextInt();
                if(a[i]==0){
                    count++;
                }
            }
            if(count<2){
                System.out.println(-1);
            }
            else{
                System.out.println(a[0]+a[n-1]);
            }
        }
    }
}