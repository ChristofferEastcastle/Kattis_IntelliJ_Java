import java.util.Scanner;

public class Last_Factorial_Digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            Integer sum = 1;

            for (int j = 1; j <= n; j++) {
                sum *= j;
            }
            if (sum >= 10)
                System.out.println(sum.toString().substring(sum.toString().length() - 1));
            else
                System.out.println(sum);
        }
    }
}
