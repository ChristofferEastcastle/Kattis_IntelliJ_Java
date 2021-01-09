import java.util.Scanner;

public class Piece_Of_Cake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int h = sc.nextInt();
        int v = sc.nextInt();

        if (h < v && v > n / 2) {
            System.out.println((n - h) * v * 4);
        } else if (h > v && h > n / 2) {
            System.out.println((n - v) * h * 4);
        } else {
            System.out.println((n - v) * (n - h) * 4);
        }
    }
}
