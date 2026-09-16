import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        int height = 0;
        int cubes = 0;
        int level = 1;
        while (cubes + level * (level + 1) / 2 <= n) {
            cubes += level * (level + 1) / 2;
            height++;
            level++;
        }
        System.out.println(height);
    }
}