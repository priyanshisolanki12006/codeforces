import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();
        while(t-->0){
            int value = 0;
            for(int i=0 ; i<10 ; i++){
                String s = read.next();
                for(int j=0 ; j<10 ; j++){
                    if(s.charAt(j)=='X'){
                        int ring = Math.min( Math.min(i,9-i),Math.min(j,9-j));
                        value+=ring+1;
                    }
                }
            }
            System.out.println(value);
        }
    }
}