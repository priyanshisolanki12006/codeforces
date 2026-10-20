import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        int[][] a = new int[n+1][n+1];
        for(int i=1 ; i<=n ; i++){
            for (int j=1 ; j<=n ; j++){
                if(i==1 || j==1){
                    a[i][j]=1;
                }
                else{
                    a[i][j]=a[i-1][j]+a[i][j-1];
                }
            }
        }
        System.out.println(a[n][n]);
    }
}