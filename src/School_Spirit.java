import java.util.Scanner;

public class School_Spirit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double x = 0;
        for (int i = 0; i < n; i++) {
            double s = sc.nextDouble();
            //x += 1/5 * (s * (i + 1) * (4/5));
            System.out.println(x);
        }
    }
}
