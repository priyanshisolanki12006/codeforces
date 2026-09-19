import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();
        while(t-->0){
            int[] a = new int[4];
            for(int i=0 ; i<4 ; i++){
                a[i] = read.nextInt();
            }
            if(a[0]==a[1] && a[1]==a[2] && a[2]==a[3]){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}