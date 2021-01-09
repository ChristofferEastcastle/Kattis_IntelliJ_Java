import java.util.Scanner;

public class Chanukah_Challenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        for (int i = 1; i <= p; i++) {
            int k = sc.nextInt();
            int n = sc.nextInt();
            int c = 0;
            for (int j = 1; j <= n; j++) {
                c += j + 1;
            }
            System.out.printf("%d %d%n", i, c);
        }

    }
}
