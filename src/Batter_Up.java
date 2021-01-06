import java.util.ArrayList;
import java.util.Scanner;

public class Batter_Up {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int at_bats = n;
        int x = 0;
        int b = 0;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            if (a == -1) {
                b++;
                if (b >= 1) at_bats--;
            }
            else
                x += a;
        }
        System.out.println((double) x / at_bats);
    }
}
