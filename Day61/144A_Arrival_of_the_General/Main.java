import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        int[] a = new int[n];
        for(int i=0 ; i<n ; i++){
            a[i] = read.nextInt();
        }
        int count = 0;
        
        int max=0;
        for(int i=1 ; i<n ; i++){
            if(a[i]>a[max]){
                max=i;
            }
        }
        while(max>0){
            int temp = a[max];
            a[max] = a[max-1];
            a[max-1] = temp;
            max--;
            count++;
        }
        
        int min=0;
        for(int i=1 ; i<n ; i++){
            if(a[i] <= a[min]){
                min=i;
            }
        }
        while(min<n-1){
            int temp = a[min];
            a[min] = a[min+1];
            a[min+1] = temp;
            min++;
            count++;
        }
        
        System.out.println(count);
    }
}