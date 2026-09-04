import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();
        while(t-->0){
            String s = read.next();
            boolean ans = false;
            for(int i=0 ; i<3 ; i++){
                for(int j=i+1 ; j<3 ; j++){
                    char[] arr = s.toCharArray();
                    char temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    if(new String(arr).equals("abc")){
                        ans = true;
                    }
                }
            }
            if(s.equals("abc")){
                ans = true;
            }
            System.out.println(ans ? "YES" : "NO");
        }
    }
}