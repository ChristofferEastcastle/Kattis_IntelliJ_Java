import java.util.ArrayList;
import java.util.Scanner;

public class Cetvrta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> xs = new ArrayList<>();
        ArrayList<Integer> ys = new ArrayList<>();
        for (int i = 1; i <= 3; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            if (xs.contains(x))
                xs.remove(xs.indexOf(x));
            else
                xs.add(x);
            if (ys.contains(y))
                ys.remove(ys.indexOf(y));
            else
                ys.add(y);
        }
        System.out.printf("%d %d%n", xs.get(0), ys.get(0));
    }
}
