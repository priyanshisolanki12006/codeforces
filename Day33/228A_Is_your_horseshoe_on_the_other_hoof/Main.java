import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        HashSet<Integer> set = new HashSet<>();
        int n=4;
        while(n-->0){
            int i = read.nextInt();
            set.add(i);
        }
        System.out.println(4-set.size());
    }
}