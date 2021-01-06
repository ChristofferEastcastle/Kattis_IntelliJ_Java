import java.util.Scanner;

public class Tarifa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();

        int tot = 0;

        for (int i = 0; i < n; i++) {
            int p = sc.nextInt();
            tot += x - p;
        }
        System.out.println(tot + x);
    }
}
