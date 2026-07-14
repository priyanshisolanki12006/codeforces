import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        char[] ch = read.next().toCharArray();
        Arrays.sort(ch);
        int count = 1;
        for(int i=1 ; i<ch.length ; i++){
            if(ch[i] != ch[i-1]){
                count ++;
            }
        }
        if(count%2 == 0){
            System.out.println("CHAT WITH HER!");
        }
        else{
            System.out.println("IGNORE HIM!");
        }
    }
}