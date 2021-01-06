import java.util.Scanner;

public class Grass_Seed_Inc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double c = sc.nextDouble();
        int l = sc.nextInt();

        double tot = 0;

        for (int i = 0; i < l; i++) {
            double w = sc.nextDouble();
            double li = sc.nextDouble();
            tot += w * li;
        }
        System.out.println(tot * c);
    }
}
