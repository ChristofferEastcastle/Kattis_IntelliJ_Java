import java.util.Scanner;

public class Zamka {
    public static int sumOf (Integer input) {
        int len = input.toString().length();
        String[] arr = input.toString().split("");
        int sum = 0;
        for (String s : arr) {
            sum += Integer.parseInt(s);
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int d = sc.nextInt();
        int x = sc.nextInt();
        int n = l;
        while (sumOf(n) != x)
            n++;

        int m = d;
        while (sumOf(m) != x)
            m--;

        System.out.printf("%d%n%d%n", n, m);
    }
}
