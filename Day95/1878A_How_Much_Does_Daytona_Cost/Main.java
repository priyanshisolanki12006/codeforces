import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();
        while(t-->0){
            int n = read.nextInt();
            int k = read.nextInt();
            int[] a = new int[n];
            boolean found = false;
            for(int i=0 ; i<n ; i++){
                a[i] = read.nextInt();
                if(a[i] == k){
                    found = true;
                }
            }
            System.out.println(found ? "YES" : "NO");
        }
    }
}