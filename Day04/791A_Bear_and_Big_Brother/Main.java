import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        int a = read.nextInt();
        int b = read.nextInt();
        int year = 0;
        while(a <= b){
            a *= 3;
            b *= 2;
            year++;
        }
        System.out.println(year);
    }
}