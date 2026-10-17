import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();
        while(t-->0){
            int n = read.nextInt();
            int m = read.nextInt();
            int k = read.nextInt();
            int sum = 0;
            int[] b = new int[n];
            for(int i=0 ; i<n ; i++){
                b[i] = read.nextInt();
            }
            int[] c = new int[m];
            for(int j=0 ; j<m ; j++){
                c[j] = read.nextInt();
            }
            int count = 0;
            for(int i=0 ; i<n ; i++){
                for(int j=0 ; j<m ; j++){
                    sum = b[i]+c[j];
                    if(sum<=k)
                        count++;
                }
            }
            System.out.println(count);
        }
    }
}