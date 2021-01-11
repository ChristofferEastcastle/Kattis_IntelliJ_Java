import java.util.ArrayList;
import java.util.Scanner;

public class Modulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int n = sc.nextInt();
            if (!list.contains(n % 42))
                list.add(n % 42);
        }
        System.out.println(list.size());
    }
}
