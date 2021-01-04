import java.util.Scanner;

public class Heart_Rate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            double b = sc.nextDouble();
            double p = sc.nextDouble();
            double bpm = 60 * b / p;
            double min = bpm - (60 / p);
            double max = bpm + (60 / p);
            System.out.printf("%.4f %.4f %.4f%n", min, bpm, max);
        }
    }
}
