import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        while(n-->0){
            int a = read.nextInt();
            int b = read.nextInt();
            int c = read.nextInt();
            if(a+b==c){
                System.out.println("+");
            }
            else{
                System.out.println("-");
            }
        }
    }
}