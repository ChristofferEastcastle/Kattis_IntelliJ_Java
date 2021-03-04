import java.util.HashSet;
import java.util.Scanner;

public class Missing_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashSet<Integer> set = new HashSet<>();
        int last = 0;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            set.add(a);
            if (i == n - 1)
                last = a;
        }
        if (last == n)
            System.out.println("good job");
        else {
            for (int i = 1; i <= last; i++) {
                if (!set.contains(i))
                    System.out.println(i);
            }
        }
    }
}
