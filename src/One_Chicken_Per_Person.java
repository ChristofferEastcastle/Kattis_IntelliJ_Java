import java.util.Scanner;

public class One_Chicken_Per_Person {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        String str;
        if (n - m > 0) {
            if (n - m == 1)
                str = "piece";
            else
                str = "pieces";
            System.out.printf("Dr. Chaz needs %d more %s of chicken!", n - m, str);
        }else {
            if (m - n == 1)
                str = "piece";
            else
                str = "pieces";
            System.out.printf("Dr. Chaz will have %d %s of chicken left over!", m - n, str);
        }
    }
}
