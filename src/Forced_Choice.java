import java.util.Scanner;

public class Forced_Choice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        int steps = sc.nextInt();
        for (int i = 0; i < steps; i++) {
            int s = sc.nextInt();
            boolean bool = false;
            for (int j = 0; j < s; j++) {
                if (sc.nextInt() == p)
                    bool = true;
            }
            if (bool)
                System.out.println("KEEP");
            else
                System.out.println("REMOVE");
        }
    }
}
