import java.util.Scanner;

public class Railroad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        if (y % 2 == 1)
            System.out.println("impossible");
        else
            System.out.println("possible");
    }
}
