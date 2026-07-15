import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        for(int i=0 ; i<5 ; i++){
            for(int j=0 ; j<5 ; j++){
                if(read.nextInt()==1){
                    System.out.println(Math.abs(i-2)+Math.abs(j-2));
                    return;
                }
            }
        }
    }
}