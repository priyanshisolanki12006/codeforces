import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        while(n-- > 0){
            int a = read.nextInt(); 
            if(a >= 1900){
                System.out.println("Division 1");
            }
            else if(a>=1600 && a<=1899){
                System.out.println("Division 2");
            }
            else if(a>=1400 && a<=1599){
                System.out.println("Division 3");
            }
            else{
                System.out.println("Division 4");
            }
        }
    }
}