import java.util.Scanner;

public class Roaming_Romans {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double a = (5280 / 1000.0) / (4854 / 1000.0) * 1000 * x;
        System.out.println(Math.round(a));
    }
}
