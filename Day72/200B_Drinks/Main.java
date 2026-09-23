import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        double sum = 0;
        for(int i=0 ; i<n ; i++){
            sum+=read.nextInt();
        }
        System.out.println(sum/n);
    }
}