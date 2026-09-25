import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        int ans=0;
        while(n-->0){
            String s = read.next();
            if (s.equals("Tetrahedron"))
                ans += 4;
            else if (s.equals("Cube"))
                ans += 6;
            else if (s.equals("Octahedron"))
                ans += 8;
            else if (s.equals("Dodecahedron"))
                ans += 12;
            else
                ans += 20;
        }
        System.out.println(ans);
    }
}