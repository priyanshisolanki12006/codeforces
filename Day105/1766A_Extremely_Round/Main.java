import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();
        while(t-->0){
            int n = read.nextInt();
            int digits = 0;
            int temp = n;
            while(temp>=10){
                temp/=10;
                digits++;
            }
            System.out.println(9*digits+temp);
        }
    }
}