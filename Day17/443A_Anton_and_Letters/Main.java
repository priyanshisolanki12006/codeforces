import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        String s = read.nextLine();
        HashSet<Character> set = new HashSet<>();
        for(int i=0 ; i<s.length() ; i++){
            char ch = s.charAt(i);
            if(ch>='a' && ch<='z'){
                set.add(ch);
            }
        }
        System.out.println(set.size());
    }
}