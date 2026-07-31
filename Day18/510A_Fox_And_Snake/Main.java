import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        int m = read.nextInt();
        for(int i=1 ; i<=n ; i++){
            if(i % 2 == 1){
                for(int j=1 ; j<=m ; j++){
                    System.out.print("#");
                }
            }
            else if((i/2)%2 == 1){
                for(int j=1 ; j<m ; j++){
                    System.out.print(".");
                }
                System.out.print("#");
            }
            else{
                System.out.print("#");
                for(int j=1 ; j<m ; j++){
                    System.out.print(".");
                }
            }
            System.out.println();
        }
    }
}