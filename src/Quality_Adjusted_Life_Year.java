import java.util.Scanner;

public class Quality_Adjusted_Life_Year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        double total = 0;
        for (int i = 0; i < n; i++) {
            double q = sc.nextDouble();
            double y = sc.nextDouble();
            total += q * y;
        }
        System.out.println(total);

    }
}
